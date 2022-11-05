package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Savings;
import org.springframework.data.repository.CrudRepository;

public interface SavingsRepository extends CrudRepository<Savings, Long> {
}
