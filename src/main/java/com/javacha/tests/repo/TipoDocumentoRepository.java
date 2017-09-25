package com.javacha.tests.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.beans.TipoDocumento;


public interface  TipoDocumentoRepository extends MongoRepository<TipoDocumento, String> {

	//List<TipoDocumento> findAll();	
	TipoDocumento findByCodigo(int codigo);
	
}
  