package com.ntt.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntt.command.*;

import com.ntt.entity.Payload;
import com.ntt.service.Msad0Service;

@RestController
@RequestMapping("/msad0")
public class Msad0Controller extends BaseController {
	
	private final Msad0Service service;

	public Msad0Controller(Msad0Service service) {
		super();
		this.service = service;
	}
	
	@Autowired
	private BeanFactory beanFactory;
	
	@GetMapping("/PRATICA_ACTIVATE")
	@PostMapping("/PRATICA_ACTIVATE")
	public ResponseEntity<Payload> praticaActivate(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaActivate|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaActivateV1Command command = beanFactory.getBean(PraticaActivateV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/PRATICA_CANCEL")
	public ResponseEntity<Payload> praticaCancel(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaCancel|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaCancelV1Command command = beanFactory.getBean(PraticaCancelV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/PRATICA_CREATA")
	public ResponseEntity<Payload> praticaCreated(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaCreated|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaCreatedlV1Command command = beanFactory.getBean(PraticaCreatedlV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/PRATICA_DELETED")
	public ResponseEntity<Payload> praticaDeleted(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaDeleted|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaDeletedV1Command command = beanFactory.getBean(PraticaDeletedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PutMapping("/PRATICA_DELETE")
	@PostMapping("/PRATICA_DELETE")
	public ResponseEntity<Payload> praticaDelete(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaDelete|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaDeleteV1Command command = beanFactory.getBean(PraticaDeleteV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}

	@PostMapping("/PRATICA_PARTIALLY_SIGNED")
	public ResponseEntity<Payload> praticaPartiallySigned(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaPartiallySigned|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaPartiallySignedV1Command command = beanFactory.getBean(PraticaPartiallySignedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/PRATICA_RETRIEVED_V1")
	public ResponseEntity<Payload> praticaPraticaRetrieved(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaPraticaRetrieved|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaRetrievedV1Command command = beanFactory.getBean(PraticaRetrievedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/PRATICA_SIGNED")
	public ResponseEntity<Payload> praticaPraticaSigned(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaPraticaSigned|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaSignedV1Command command = beanFactory.getBean(PraticaSignedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/PRATICA_UPDATED")
	public ResponseEntity<Payload> praticaUpdated(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=praticaUpdated|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PraticaUpdatedCommand command = beanFactory.getBean(PraticaUpdatedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/FIRMA_DELETED")
	public ResponseEntity<Payload> firmaDeleted(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=firmaDeleted|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		FirmaDeletedV1Command command = beanFactory.getBean(FirmaDeletedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/DOCUMENTALE_DELETED")
	public ResponseEntity<Payload> documentaleDeleted(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=documentaleDeleted|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		DocumentaleDeletedV1Command command = beanFactory.getBean(DocumentaleDeletedV1Command.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
}