package br.com.studies.graphql.infra.mapper;

import br.com.studies.graphql.api.graphql.dto.ClientDTO;
import br.com.studies.graphql.domain.Client;
import br.com.studies.graphql.infra.repository.model.ClientModel;

public interface ClientMapper {
    ClientModel toModel(ClientDTO clientDTO);

    ClientDTO toDTO(ClientModel clientModel);

    Client toDomain(ClientDTO dto);

    Client toDomain(ClientModel model);

    ClientDTO toDTO(Client client);

    ClientModel toModel(Client client);
}


