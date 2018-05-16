package com.yucfeng.web;


import com.yucfeng.exception.NotFoundException;
import com.yucfeng.exception.resp.NotFoundError;
import com.yucfeng.model.EData;
import com.yucfeng.model.entity.Node;
import com.yucfeng.model.req.NodeReq;
import com.yucfeng.repository.NodeRepository;
import com.yucfeng.service.NodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.yucfeng.util.CommonUtils.getNullPropertyNames;

@RestController
@RequestMapping(value = "/topo-node")
public class NodeController {



    @Autowired
    NodeRepository nodeRepository;

//    @Autowired
//    LinkRepository linkRepository;

//    @Autowired
//    NodeService nodeService;



//    ListUDG pG = new ListUDG(vexs, edges);

//    @PostConstruct
//    private void initTopo() {
//        for (EData link : edges)
//            redisTemplate.opsForValue().set(link.getStart() + link.getEnd(), link);
//    }

    @PostMapping("/")
    public List<Node> addNodes(@RequestBody List<NodeReq> nodeReqs){
        List<Node> nodes = new ArrayList<>();
        for (NodeReq nodeReq : nodeReqs) {
            Node node = new Node();
            BeanUtils.copyProperties(nodeReq, node);
            nodes.add(node);
        }
        nodeRepository.saveAll(nodes);
        return nodes;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateNode(@PathVariable String id, @RequestBody NodeReq nodeReq) {
        Node node = nodeRepository.findById(id).isPresent() ? nodeRepository.findById(id).get() : null;
        if (node == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(nodeReq, node);
        nodeRepository.save(node);
        return ResponseEntity.ok(node);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> merge(@PathVariable String id, @RequestBody NodeReq nodeReq) {
        Node node = nodeRepository.findById(id).isPresent() ? nodeRepository.findById(id).get() : null;
        if (node == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        String[] nullAttrs = getNullPropertyNames(nodeReq);
        BeanUtils.copyProperties(nodeReq, node, nullAttrs);
        nodeRepository.save(node);
        return ResponseEntity.ok(nodeRepository.findById(id));
    }

    @GetMapping("/")
    public List<Node> getAllNodes(){
        return (List<Node>)nodeRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getNode(@PathVariable String id){
        Node node = nodeRepository.findById(id).orElse(new Node());
        if (node.getId() == null) {
//            throw new NotFoundException();
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(node);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNode(@PathVariable String id){
        Node node = nodeRepository.findById(id).orElse(new Node());
        if (node.getId() == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        nodeRepository.deleteById(id);
        return ResponseEntity.ok(nodeRepository.findAll());
    }



//    @RequestMapping(value = "/node/{nodeName}", method = RequestMethod.GET)
//    public Node getAllShortestPath(@PathVariable String nodeName) {
//        return nodeRepository.findByName(nodeName);
//    }

//    @RequestMapping(value = "/link", method = RequestMethod.POST)
//    public LinkRelationship getAllShortestPath(@RequestBody PathReq pathReq) {
//        return linkRepository.queryLinkRelationshipByDstAndSrc();
//    }

}
