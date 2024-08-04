package br.com.fiap.techchallenge.frameworks.db.repositories;

import java.util.UUID;

import br.com.fiap.techchallenge.frameworks.db.entities.CustomerDeleteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDeleteRepository extends JpaRepository<CustomerDeleteEntity, UUID> {
}
