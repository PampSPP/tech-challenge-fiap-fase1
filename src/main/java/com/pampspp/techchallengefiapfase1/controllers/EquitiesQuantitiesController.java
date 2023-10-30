package com.pampspp.techchallengefiapfase1.controllers;

import com.pampspp.techchallengefiapfase1.entities.EquitiesQuantity;
import com.pampspp.techchallengefiapfase1.repositories.EquitiesQuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/equities-quantity")
public class EquitiesQuantitiesController {

    @Autowired
    private EquitiesQuantityRepository repository;

    @GetMapping
    public List<EquitiesQuantity> findAll() {
        List<EquitiesQuantity> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public EquitiesQuantity findById(@PathVariable Long id) {
        EquitiesQuantity result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public EquitiesQuantity addEquitiesQuantity(@RequestBody EquitiesQuantity equitiesQuantity) {
        EquitiesQuantity result = repository.save(equitiesQuantity);
        return result;
    }

    @PutMapping
    public EquitiesQuantity updateQuantity(@RequestBody EquitiesQuantity equitiesQuantity) {
        EquitiesQuantity result = repository.save(equitiesQuantity);
        return result;
    }

    @DeleteMapping(value = "/{id}")
    public void removeEquitiesQuantity(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
