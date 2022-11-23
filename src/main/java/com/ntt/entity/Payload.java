package com.ntt.entity;

import lombok.Data;

@Data
public class Payload {
	private Long id;
	private String name;
	private String email;
	private Long idPratica;
	private Long idSuperpratica;
}
