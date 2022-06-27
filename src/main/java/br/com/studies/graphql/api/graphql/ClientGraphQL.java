package br.com.studies.graphql.api.graphql;

import br.com.studies.graphql.api.graphql.dto.ClientDTO;
import br.com.studies.graphql.domain.service.ClientService;
import br.com.studies.graphql.domain.Client;
import br.com.studies.graphql.infra.mapper.ClientMapper;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class ClientGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final ClientService service;

    private final ClientMapper mapper;

    public ClientDTO client(Long id) {
        var model = service.findById(id);
        return mapper.toDTO(model);
    }

    public List<ClientDTO> clients() {
        return service.findAll().stream()
                .map(mapper::toDTO).collect(Collectors.toList());
    }

    public ClientDTO saveClient(Long id, String name, String email) {
        var model = service.save(new Client(id, name, email));
        return mapper.toDTO(model);
    }

    public Boolean deleteClient(Long id) {
        return service.deleteById(id);
    }
}
