package br.com.studies.graphql.infra.mapper.impl;

import br.com.studies.graphql.api.graphql.dto.ProductDTO;
import br.com.studies.graphql.domain.Product;
import br.com.studies.graphql.infra.mapper.ProductMapper;
import br.com.studies.graphql.infra.repository.model.ProductModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProductMapperImpl implements ProductMapper {

    private final ModelMapper mapper;

    @Override
    public ProductModel toModel(ProductDTO productDTO) {
        return mapper.map(productDTO, ProductModel.class);
    }

    @Override
    public ProductDTO toDTO(ProductModel productModel) {
        return mapper.map(productModel, ProductDTO.class);
    }

    @Override
    public Product toDomain(ProductDTO dto) {
        return mapper.map(dto, Product.class);
    }

    @Override
    public Product toDomain(ProductModel model) {
        return mapper.map(model, Product.class);
    }

    @Override
    public ProductDTO toDTO(Product product) {
        return mapper.map(product, ProductDTO.class);
    }

    @Override
    public ProductModel toModel(Product product) {
        return mapper.map(product, ProductModel.class);
    }
}
