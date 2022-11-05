package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Savings;
import io.codelaborators.serverside.repositories.SavingsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class SavingsController {

    @Resource
    private SavingsRepository savingsRepo;

    @GetMapping("all-accounts/savings")
    public Collection<Savings> getAllSavings(){
        return (Collection<Savings>) savingsRepo.findAll();
    }

    @GetMapping("all-accounts/savings/{id}")
    public Optional<Savings> getSavingsAccount(@PathVariable Long id){
        return savingsRepo.findById(id);
    }
}
