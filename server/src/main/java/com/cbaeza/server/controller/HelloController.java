package com.cbaeza.server.controller;

import com.cbaeza.server.dto.GreetingsDto;
import com.cbaeza.server.dto.PersonDto;
import com.cbaeza.server.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<PersonDto> findById(@PathVariable String id){
		return new ResponseEntity<PersonDto>(new PersonDto(Long.valueOf(id),"Carlos", "Baeza", "carlos.baeza@posteo.de"), HttpStatus.OK);
	}

}
