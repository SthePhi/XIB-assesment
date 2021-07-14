package com.bix.assesment.repositories;

import com.bix.assesment.Entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource( collectionResourceRel = "manager", path = "manager")
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
