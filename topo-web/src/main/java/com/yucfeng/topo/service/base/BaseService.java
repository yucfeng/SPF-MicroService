package com.yucfeng.topo.service.base;

import java.util.List;
import java.util.Optional;

public interface BaseService<T, K> {

    void saveAll(List<T> records);

    T insert(T record);

    void deleteByPrimaryKey(K id);

    T update(T record);

    Optional<T> selectByPrimaryKey(K id);

    List<T> findAll();
}
