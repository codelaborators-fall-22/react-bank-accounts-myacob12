package io.codelaborators.serverside;

import io.codelaborators.serverside.models.Checking;
import io.codelaborators.serverside.models.Savings;
import io.codelaborators.serverside.repositories.CheckingRepository;
import io.codelaborators.serverside.repositories.SavingsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initializer implements CommandLineRunner {

    @Resource
    private CheckingRepository checkingRepo;

    @Resource
    SavingsRepository savingsRepo;

    @Override
    public void run(String... args) throws Exception {

        List<String> users = new ArrayList<>();
        users.add("Alan");
        users.add("Mel");

        Checking myPersonalChecking = new Checking("1111", 500, users, "personal");
        checkingRepo.save(myPersonalChecking);

        Checking myBusinessChecking = new Checking("2222", 1000, users, "business");
        checkingRepo.save(myBusinessChecking);

        Savings mySavings = new Savings("3333", 2500, users);
        savingsRepo.save(mySavings);


    }
}
