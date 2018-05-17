package com.yucfeng.topo.web;

import com.yucfeng.topo.exception.resp.AlreadyExistedError;
import com.yucfeng.topo.model.entity.Link;
import com.yucfeng.topo.model.req.LinkReq;
import com.yucfeng.topo.repository.LinkRepository;
import com.yucfeng.topo.repository.NodeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/topo-link")
public class LinkController {

    @Autowired
    LinkRepository linkRepository;
    @Autowired
    NodeRepository nodeRepository;

    @PostMapping("/")
    public ResponseEntity<?> addLink(@Valid @RequestBody LinkReq linkReq){
        if (linkRepository.findById(linkReq.getId()).isPresent()){
            AlreadyExistedError error = new AlreadyExistedError(linkReq.getId());
            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
        }
        if (!nodeRepository.findById(linkReq.getLocalNodeId()).isPresent()) {

        }
        if (!nodeRepository.findById(linkReq.getRemoteNodeId()).isPresent()) {

        }
        Link link = new Link();
        BeanUtils.copyProperties(linkReq, link);
        link.setStart(nodeRepository.findById(linkReq.getLocalNodeId()).get());
        link.setEnd(nodeRepository.findById(linkReq.getRemoteNodeId()).get());
        linkRepository.save(link);
        return ResponseEntity.ok(link);
    }
}
