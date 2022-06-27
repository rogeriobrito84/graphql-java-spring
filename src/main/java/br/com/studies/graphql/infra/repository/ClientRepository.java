package br.com.studies.graphql.infra.repository;

import br.com.studies.graphql.infra.repository.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
