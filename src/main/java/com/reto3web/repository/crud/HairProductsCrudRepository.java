package com.reto3web.repository.crud;


import com.reto3web.model.HairProducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Alejandro Tacue
 */
public interface HairProductsCrudRepository extends MongoRepository<HairProducts, String> {
    
}
