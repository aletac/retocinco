package com.reto3web.repository;

import com.reto3web.model.Accessory;
import java.util.List;
import java.util.Optional;

import com.reto3web.repository.crud.AccesoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro Tacue
 */
@Repository
public class AccesoryRepository {
    @Autowired
    private AccesoryCrudRepository accesoryCrudRepository;

    public List<Accessory> getAll() {
        return accesoryCrudRepository.findAll();
    }

    public Optional<Accessory> getAccesory(String reference) {
        return accesoryCrudRepository.findById(reference);
    }
    
    public Accessory create(Accessory accesory) {
        return accesoryCrudRepository.save(accesory);
    }

    public void update(Accessory accesory) {
        accesoryCrudRepository.save(accesory);
    }
    
    public void delete(Accessory accesory) {
        accesoryCrudRepository.delete(accesory);
    }
}
