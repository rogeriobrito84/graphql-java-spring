package br.com.studies.graphql.infra.mapper.impl;

import br.com.studies.graphql.api.graphql.dto.ClientDTO;
import br.com.studies.graphql.domain.Client;
import br.com.studies.graphql.infra.mapper.ClientMapper;
import br.com.studies.graphql.infra.repository.model.ClientModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientMapperImpl implements ClientMapper {

    private final ModelMapper mapper;

    @Override
    public ClientModel toModel(ClientDTO clientDTO) {
        return mapper.map(clientDTO, ClientModel.class);
    }

    @Override
    public ClientDTO toDTO(ClientModel clientModel) {
        return mapper.map(clientModel, ClientDTO.class);
    }

    @Override
    public Client toDomain(ClientDTO dto) {
        return mapper.map(dto, Client.class);
    }

    @Override
    public Client toDomain(ClientModel model) {
        return mapper.map(model, Client.class);
    }

    @Override
    public ClientDTO toDTO(Client client) {
        return mapper.map(client, ClientDTO.class);
    }

    @Override
    public ClientModel toModel(Client client) {
        return mapper.map(client, ClientModel.class);
    }
}
