package br.com.srm.provasrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srm.provasrm.service.RiscoService;

@RestController
public class RiscoController {
	
	private RiscoService riscoService;

	@Autowired
	public RiscoController(RiscoService riscoService) {
		this.riscoService = riscoService;
	}

	@GetMapping(value="/api/riscos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> list(){		
		return this.riscoService.list();		
	}
}