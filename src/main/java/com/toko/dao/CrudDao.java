package com.toko.dao;

import java.util.List;

public interface CrudDao<T, ID> {

    List<T> getAll();

    T get(ID id);

    T insert(T domain);

    T update(T domain);

    void delete(ID id);

}
