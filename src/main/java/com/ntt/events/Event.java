package com.ntt.events;

import lombok.Data;

import java.util.Date;

@Data
public abstract class Event <T> {
    private String id;
    private Date date;
    private EventType type;
    private T data;
    private Long idPratica;
    private Long idSuperpratica;
    
    //controllare tipi
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
