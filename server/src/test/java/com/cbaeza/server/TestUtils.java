package com.cbaeza.server;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Test utils
 * <br/>
 *
 * @author carlos.baeza , carlos.baeza@idealo.de<br/>
 * @since 03.12.15
 */
public class TestUtils {

    public static String convertObjectToJsonString(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        System.out.println(mapper.writeValueAsString(object));
        return mapper.writeValueAsString(object);
    }
}
