package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.TipoDocumento;
import com.javacha.tests.SpringBootWebMongo1.repo.TipoDocumentoRepository;




@RestController
@RequestMapping("/util")
public class UtilController {

	
	@Autowired
	TipoDocumentoRepository tipoDocRepo;	
	
    @RequestMapping("descod")
    public List<TipoDocumento> listDescodByTabla(@RequestParam(value="tabla") int tabla) {
        return tipoDocRepo.findAll();
    }	
	
    
    @RequestMapping("descodOne")
    public TipoDocumento getDescod() {
    	TipoDocumento t = new TipoDocumento(1, "lolo");
        return t;
    }	
	    
    
}
