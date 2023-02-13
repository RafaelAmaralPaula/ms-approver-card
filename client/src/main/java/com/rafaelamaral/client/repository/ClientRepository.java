package com.rafaelamaral.client.repository;

import com.rafaelamaral.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client , Long> {
}
