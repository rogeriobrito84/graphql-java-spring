package br.com.studies.graphql.api.graphql;

import br.com.studies.graphql.api.graphql.dto.ProductDTO;
import br.com.studies.graphql.domain.service.ProductService;
import br.com.studies.graphql.infra.mapper.ProductMapper;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ProductGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ProductService service;

    private final ProductMapper mapper;

    public ProductDTO product(Long id) {
        var product = service.findById(id);
        return mapper.toDTO(product);
    }

    public List<ProductDTO> products() {
        return service.findAll().stream().map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO saveProduct(ProductDTO dto) {
        var product = service.save(mapper.toDomain(dto));
        return mapper.toDTO(product);
    }

    public Boolean deleteProduct(Long id) {
        return service.deleteById(id);
    }
}
