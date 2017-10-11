package com.javacha.tests.SpringBootWebMongo1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javacha.tests.SpringBootWebMongo1.beans.Descod;
import com.javacha.tests.SpringBootWebMongo1.repo.DescodRepository;




@RestController
@RequestMapping("/descod")
public class DescodController {

	
	@Autowired
	DescodRepository descodRepository;	
	
	/**
	 * Lista descod por nro de tabla
	 * @param tabla
	 * @return
	 */
    @RequestMapping(value = "/{tabla}",  method = RequestMethod.GET)
    public List<Descod> listDescodByTabla(@PathVariable int tabla) {
        return descodRepository.findAllByTabla(tabla); 
    }	
	
    /**
     * Obtiene codigo puntual de una tabla
     * @param tabla
     * @param codigo
     * @return
     */
    /*
    @RequestMapping(value = "/{tabla}/{codigo}",  method = RequestMethod.GET)
    public Descod getDescodByTablaCodigo(@PathVariable int tabla, @PathVariable int codigo) {
        return descodRepository.findByTablaAndCodigo(tabla, codigo); 
    }	
	 */
    
 
    @RequestMapping(value = "/{tabla}/{desc}",  method = RequestMethod.GET)
    public List<Descod> listDescodByTablaDescripcion(@PathVariable int tabla, @PathVariable String desc) {
        return descodRepository.findByTablaAndDescripcion(tabla, desc);
    }	
	     
}
