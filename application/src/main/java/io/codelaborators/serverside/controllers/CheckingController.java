package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Checking;
import io.codelaborators.serverside.repositories.CheckingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class CheckingController {

    @Resource
    private CheckingRepository checkingRepo;

    @GetMapping("/all-accounts/checking")
    public Collection<Checking> getCheckingAccounts(){
        return (Collection<Checking>) checkingRepo.findAll();
    }

    @GetMapping("/all-accounts/checking/{id}")
    public Optional<Checking> getCheckingAccount(@PathVariable Long id){
        return checkingRepo.findById(id);
    }
}
