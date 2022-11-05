package io.codelaborators.serverside.repositories;

import io.codelaborators.serverside.models.Checking;
import org.springframework.data.repository.CrudRepository;

public interface CheckingRepository extends CrudRepository<Checking, Long> {
}
