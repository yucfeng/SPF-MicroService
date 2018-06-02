package com.yucfeng.topo.service;

import com.yucfeng.topo.model.entity.Node;
import com.yucfeng.topo.service.base.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface NodeService extends BaseService<Node, String>{

}
