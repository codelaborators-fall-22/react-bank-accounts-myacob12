package io.codelaborators.serverside.controllers;

import io.codelaborators.serverside.models.Account;
import io.codelaborators.serverside.repositories.AccountRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Optional;

@RestController
@CrossOrigin
public class AccountController {

    //Inject the database capabilities
    @Resource
    private AccountRepository accountRepo;

    @GetMapping("/all-accounts")
    public Collection<Account> getAllAccounts(){
        return (Collection<Account>) accountRepo.findAll();
    }

    @GetMapping("/all-accounts/{id}")
    public Optional<Account> getAccount(@PathVariable Long id){
        return accountRepo.findById(id);
    }
}
