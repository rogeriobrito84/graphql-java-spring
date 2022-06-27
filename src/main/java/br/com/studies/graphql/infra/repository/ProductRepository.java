package br.com.studies.graphql.infra.repository;

import br.com.studies.graphql.infra.repository.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
