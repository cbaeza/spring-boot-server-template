package com.cbaeza.server.controller;

import com.cbaeza.server.dto.GreetingsDto;
import com.cbaeza.server.dto.PersonDto;
import com.cbaeza.server.model.Person;
import com.cbaeza.server.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

/**
 * <br/>
 *
 * @author carlos.baeza , carlos.baeza@posteo.de<br/>
 * @since 02.12.15
 */
@RestController
@RequestMapping(value = "/")
public class HelloController {

    @Autowired
    PersonRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<GreetingsDto> sayHello() {
        return new ResponseEntity<GreetingsDto>(new GreetingsDto("Hello World"), HttpStatus.OK);
    }

	@RequestMapping(value="id/{id}", method = RequestMethod.GET, produces =  MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findById(@PathVariable String id){
        Person one = repository.findOne(Long.valueOf(id));
        if(one==null){
            return new ResponseEntity<String>("not found for id:" + id, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<PersonDto>(new PersonDto(one.getId(),one.getName(),one.getLastname(), one.getEmail()), HttpStatus.OK);
    }

}
