package com.leonardo.services;

import com.leonardo.data.vo.v1.PersonVO;
import com.leonardo.exceptions.ResourceNotFoundException;
import com.leonardo.mapper.ModelMapperClass;
import com.leonardo.model.Person;
import com.leonardo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository personRepository;

    public List<PersonVO> findAll() {
        logger.info("Finding all people!");
        return ModelMapperClass.parseListObjects(personRepository.findAll(), PersonVO.class);
    }

    public PersonVO findById(Long id) {
        logger.info("Finding one person!");
        var entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        return ModelMapperClass.parseObject(entity, PersonVO.class);
    }

    public PersonVO create(PersonVO personVO) {
        logger.info("Creating one person!");
        var entity = ModelMapperClass.parseObject(personVO, Person.class);
        var vo = ModelMapperClass.parseObject(personRepository.save(entity), PersonVO.class);
        return vo;
    }

    public PersonVO update(PersonVO personVO) {
        logger.info("Updating one person!");
        var entity = personRepository.findById(personVO.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        entity.setFirstName(personVO.getFirstName());
        entity.setLastName(personVO.getLastName());
        entity.setAddress(personVO.getAddress());
        entity.setGender(personVO.getGender());
        var vo = ModelMapperClass.parseObject(personRepository.save(entity), PersonVO.class);
        return vo;
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");
        var entity = personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
        personRepository.delete(entity);
    }

}
