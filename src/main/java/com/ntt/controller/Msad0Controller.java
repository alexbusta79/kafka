package com.ntt.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/delete")
	public ResponseEntity<Payload> delete(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=delete|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		DeleteCommand command = beanFactory.getBean(DeleteCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	/***********************************************/

	@PostMapping("/activate")
	public ResponseEntity<Payload> activate(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=activate|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		ActivateCommand command = beanFactory.getBean(ActivateCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}

	@PostMapping("/docSignedOffered")
	public ResponseEntity<Payload> docSignedOffered(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=docSignedOffered|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		DocSignedOfferedCommand command = beanFactory.getBean(DocSignedOfferedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/partiallySignedOffered")
	public ResponseEntity<Payload> partiallySignedOffered(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=partiallySignedOffered|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		PartiallySignedCommand command = beanFactory.getBean(PartiallySignedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/firmaOfferSigned")
	public ResponseEntity<Payload> firmaOfferSigned(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=firmaOfferSigned|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		FirmaOfferedSignedCommand command = beanFactory.getBean(FirmaOfferedSignedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/offerSaved")
	public ResponseEntity<Payload> offerSaved(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=offerSaved|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		OfferedSavedCommand command = beanFactory.getBean(OfferedSavedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/offerReady")
	public ResponseEntity<Payload> offerReady(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=offerReady|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		OfferReadyCommand command = beanFactory.getBean(OfferReadyCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/startSign")
	public ResponseEntity<Payload> startSign(@RequestBody Payload payment) throws Exception {
		logger.info("requestId={}|operazione=startSign|esito=OK", "123456");
		
		long startTime = System.currentTimeMillis();
		
		FirmaOfferedSignedCommand command = beanFactory.getBean(FirmaOfferedSignedCommand.class, payment);
		Payload result = command.execute();
		
		logger.info("requestId={}|richiesta=fine|durataOperazione={}{}", "654321",(System.currentTimeMillis() - startTime)," ms");

		return ResponseEntity.ok(result);
	}

	public Msad0Service getService() {
		return service;
	}
}

/*
//delete
	@PostMapping(path = "/delete")
	public Payload save(@RequestBody Payload payload) {
		return this.service.delete(payload);
	}
*/
