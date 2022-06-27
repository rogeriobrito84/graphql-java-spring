package br.com.studies.graphql.domain.service;

import br.com.studies.graphql.domain.Client;
import br.com.studies.graphql.infra.mapper.ClientMapper;
import br.com.studies.graphql.infra.repository.ClientRepository;
import br.com.studies.graphql.infra.repository.model.ClientModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository repository;

    private final ClientMapper mapper;

    public List<Client> findAll() {
        var returnList = repository.findAll();
        return returnList.stream()
                .map(mapper::toDomain).collect(Collectors.toList());
    }

    public Client save(Client client) {
        var model = repository.save(mapper.toModel(client));
        return mapper.toDomain(model);
    }

    public boolean deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return  true;
        }
        return false;
    }

    public Client findById(Long id) {
        var model = repository.findById(id).orElse(new ClientModel());
        return mapper.toDomain(model);
    }

}
