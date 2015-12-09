package com.cbaeza.server.controller;

import com.cbaeza.server.controller.dto.GreetingsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
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

    @RequestMapping(method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
    public ResponseEntity<GreetingsDto> sayHello() {
        return new ResponseEntity<GreetingsDto>(new GreetingsDto("Hello World"), HttpStatus.OK);
    }

}
