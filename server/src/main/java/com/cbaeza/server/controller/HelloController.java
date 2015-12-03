package com.cbaeza.server.controller;

import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/>
 *
 * @author carlos.baeza , carlos.baeza@idealo.de<br/>
 * @since 02.12.15
 */
@RestController
@RequestMapping( value = "/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, produces = MimeTypeUtils.TEXT_HTML_VALUE)
    @ResponseBody
    public String sayHello(){
        return "hello world!";
    }

}
