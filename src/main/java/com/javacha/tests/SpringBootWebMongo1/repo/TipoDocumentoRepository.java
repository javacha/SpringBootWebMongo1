package com.javacha.tests.SpringBootWebMongo1.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacha.tests.SpringBootWebMongo1.beans.TipoDocumento;


public interface  TipoDocumentoRepository extends MongoRepository<TipoDocumento, String> {

	//List<TipoDocumento> findAll();	
	TipoDocumento findByCodigo(int codigo);
	
}
  