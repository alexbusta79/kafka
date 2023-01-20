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
	private String tipoAnnullo;
	private String applicazione; 
	private String codSocieta;
	private String codFiliale;
	private String famigliaDocumentale;
	private String ssa;
	private String codProdotto;
	private String tipoOfferta;
	private String totDocumentiPratica;

}