package ir.teherany.model.service.impl;

import ir.teherany.mapper.GenericMapper;
import ir.teherany.model.repository.GenericRepository;
import ir.teherany.model.service.GenericService;

import java.util.List;
import java.util.Optional;

public abstract class GenericServiceImpl<T, D, PK> implements GenericService<T, D, PK> {

    public abstract GenericRepository<T, PK> getRepository();

    public abstract GenericMapper<T, D> getMapper();

    @Override
    public void save(D dto) {
        getRepository().save(getMapper().toEntity(dto));
    }

    @Override
    public D findById(PK id) {
        Optional<T> byId = getRepository().findById(id);
        if (byId.isEmpty()) {
            throw new RuntimeException();
        }
        return getMapper().toDTO(byId.get());
    }

    @Override
    public List<D> findAll() {
        return getMapper().toDTOs(getRepository().findAll());
    }
}
