package com.yucfeng.topo.web;


import com.yucfeng.topo.exception.resp.AlreadyExistedError;
import com.yucfeng.topo.exception.resp.NotFoundError;
import com.yucfeng.topo.model.entity.Node;
import com.yucfeng.topo.model.req.NodeReq;
import com.yucfeng.topo.repository.NodeRepository;
import com.yucfeng.topo.service.NodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static com.yucfeng.topo.util.CommonUtils.getNullPropertyNames;

@RestController
@RequestMapping(value = "/topo-node")
public class NodeController {

//    @Autowired
//    NodeRepository nodeRepository;


    @Autowired
    NodeService nodeService;


//    ListUDG pG = new ListUDG(vexs, edges);

//    @PostConstruct
//    private void initTopo() {
//        for (EData link : edges)
//            redisTemplate.opsForValue().set(link.getStart() + link.getEnd(), link);
//    }

    @PostMapping("/nodes")
    public ResponseEntity<?> addNodes(@RequestBody List<NodeReq> nodeReqs){
        List<Node> nodes = new ArrayList<>();
        for (NodeReq nodeReq : nodeReqs) {
            if (nodeService.selectByPrimaryKey(nodeReq.getId()).isPresent()){
                AlreadyExistedError error = new AlreadyExistedError(nodeReq.getId());
                return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
            }
            Node node = new Node();
            BeanUtils.copyProperties(nodeReq, node);
            nodes.add(node);
        }
        nodeService.saveAll(nodes);
        return ResponseEntity.ok(nodes);
    }

    @PostMapping("/")
    public ResponseEntity<?> addNode(@RequestBody NodeReq nodeReq) {
        if (nodeService.selectByPrimaryKey(nodeReq.getId()).isPresent()) {
            AlreadyExistedError error = new AlreadyExistedError(nodeReq.getId());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
        Node node = new Node();
        BeanUtils.copyProperties(nodeReq, node);
        nodeService.insert(node);
        return ResponseEntity.ok(node);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateNode(@PathVariable String id, @RequestBody NodeReq nodeReq) {
        Node node = nodeService.selectByPrimaryKey(id).isPresent() ? nodeService.selectByPrimaryKey(id).get() : null;
        if (node == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(nodeReq, node);
        nodeService.insert(node);
        return ResponseEntity.ok(node);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> merge(@PathVariable String id, @RequestBody NodeReq nodeReq) {
        Node node = nodeService.selectByPrimaryKey(id).isPresent() ? nodeService.selectByPrimaryKey(id).get() : null;
        if (node == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        String[] nullAttrs = getNullPropertyNames(nodeReq);
        BeanUtils.copyProperties(nodeReq, node, nullAttrs);
        nodeService.insert(node);
        return ResponseEntity.ok(nodeService.selectByPrimaryKey(id));
    }

    @GetMapping("/")
    public List<Node> getAllNodes(){
        return nodeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getNode(@PathVariable String id){
        Node node = nodeService.selectByPrimaryKey(id).orElse(new Node());
        if (node.getId() == null) {
//            throw new NotFoundException();
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(node);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteNode(@PathVariable String id){
        Node node = nodeService.selectByPrimaryKey(id).orElse(new Node());
        if (node.getId() == null) {
            NotFoundError error = new NotFoundError(id);
            return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
        }
        nodeService.deleteByPrimaryKey(id);
        return ResponseEntity.ok(nodeService.findAll());
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
