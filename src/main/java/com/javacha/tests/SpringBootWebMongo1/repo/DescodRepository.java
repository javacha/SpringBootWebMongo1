package com.javacha.tests.SpringBootWebMongo1.repo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.javacha.tests.SpringBootWebMongo1.beans.Descod;

public interface DescodRepository  extends MongoRepository<Descod, String> {

		public List<Descod> findAllByTabla(Double tabla);
		//public Descod findByTablaCodigo(Double tabla, Double codigo);
	
	
}
