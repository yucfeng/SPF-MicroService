package com.yucfeng.topo.service.impl;

import com.yucfeng.topo.model.entity.Node;
import com.yucfeng.topo.repository.NodeRepository;
import com.yucfeng.topo.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NodeServiceImpl implements NodeService {

    @Autowired
    NodeRepository nodeRepository;

    @Override
    public void saveAll(List<Node> records) {
        nodeRepository.saveAll(records);
    }

    @Override
    public Node insert(Node record) {
        return nodeRepository.save(record);
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        nodeRepository.deleteById(id);
    }

    @Override
    public Node update(Node record) {
        return nodeRepository.save(record);
    }

    @Override
    public Optional<Node> selectByPrimaryKey(String id) {
        return nodeRepository.findById(id);
    }

    @Override
    public List<Node> findAll() {
        return (List<Node>)nodeRepository.findAll();
    }
}
