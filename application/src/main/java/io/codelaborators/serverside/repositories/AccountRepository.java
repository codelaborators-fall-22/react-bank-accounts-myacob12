package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
