package br.com.studies.graphql.domain.service;

import br.com.studies.graphql.domain.Product;
import br.com.studies.graphql.infra.mapper.ProductMapper;
import br.com.studies.graphql.infra.repository.ProductRepository;
import br.com.studies.graphql.infra.repository.model.ProductModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository repository;

    private final ProductMapper mapper;

    public List<Product> findAll() {
        var returnList = repository.findAll();
        return returnList.stream()
                .map(mapper::toDomain).collect(Collectors.toList());
    }

    public Product save(Product product) {
        var model = repository.save(mapper.toModel(product));
        return mapper.toDomain(model);
    }

    public boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return  true;
        }
        return false;
    }

    public Product findById(Long id) {
        var model = repository.findById(id).orElse(new ProductModel());
        return mapper.toDomain(model);
    }

}
