package com.cbaeza.server.dto;

/**
 * <br/>
 *
 * @author carlos.baeza , carlos.baeza@posteo.de<br/>
 * @since 03.12.15
 */
public class GreetingsDto {

    private String name;

    public GreetingsDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
