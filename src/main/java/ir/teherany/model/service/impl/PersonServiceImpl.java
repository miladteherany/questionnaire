package ir.teherany.model.service.impl;

import ir.teherany.dto.PersonDTO;
import ir.teherany.entity.Person;
import ir.teherany.mapper.GenericMapper;
import ir.teherany.model.repository.GenericRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl extends GenericServiceImpl<Person, PersonDTO, Long>{

    private final GenericRepository<Person, Long> genericRepository;
    @Override
    public GenericRepository<Person, Long> getRepository() {
        return null;
    }

    @Override
    public GenericMapper<Person, PersonDTO> getMapper() {
        return null;
    }
}
