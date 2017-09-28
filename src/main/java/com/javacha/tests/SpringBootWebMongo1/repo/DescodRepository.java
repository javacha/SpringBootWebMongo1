package com.javacha.tests.SpringBootWebMongo1.repo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.javacha.tests.SpringBootWebMongo1.beans.Descod;

public interface DescodRepository  extends MongoRepository<Descod, Integer> {

		public List<Descod> findAllByTabla(Integer tabla);
		public Descod findByTablaAndCodigo(Integer tabla, Integer codigo);
	
	
}
