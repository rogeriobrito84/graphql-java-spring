package br.com.studies.graphql.infra.mapper;

import br.com.studies.graphql.api.graphql.dto.ProductDTO;
import br.com.studies.graphql.domain.Product;
import br.com.studies.graphql.infra.repository.model.ProductModel;

public interface ProductMapper {
    ProductModel toModel(ProductDTO productDTO);

    ProductDTO toDTO(ProductModel productModel);

    Product toDomain(ProductDTO dto);

    Product toDomain(ProductModel model);

    ProductDTO toDTO(Product product);

    ProductModel toModel(Product product);
}


