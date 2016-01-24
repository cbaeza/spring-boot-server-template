package com.cbaeza.server.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by cbaeza on 21/01/16.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonDto {

	private Long id;
	private String name;
	private String lastname;
	private String email;
}
