package ir.teherany.mapper;

import java.util.List;

public interface GenericMapper<E, D> {
    D toDTO(E entity);

    E toEntity(D dto);

    List<D> toDTOs(List<E> entities);

    List<E> toEntities(List<D> DTOs);

}
