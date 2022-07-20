package ir.teherany.model.service;

import java.util.List;

public interface GenericService<T, D, PK> {
    void save(D dto);

    D findById(PK id);

    List<D> findAll();
}
