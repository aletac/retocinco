package com.reto3web.repository.crud;

import com.reto3web.model.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Alejandro Tacue
 */
public interface AccesoryCrudRepository extends MongoRepository<Accessory, String> {
    
}
