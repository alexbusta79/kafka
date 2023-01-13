package com.ntt.entity;

import lombok.Data;

@Data
public class Payload {
	private Long idSuperpratica;
	private Long idPratica;
	private String tipoOperazione;
	private String tipoFirma;
	private String scadenzaPratica;
	private String canale;
	private String watermark;
	private String tipoAnnullo;
}
