package com.rafaelamaral.client.service.implementations;

import com.rafaelamaral.client.controller.dtos.ClientDTO;
import com.rafaelamaral.client.domain.Client;
import com.rafaelamaral.client.repository.ClientRepository;
import com.rafaelamaral.client.service.interfaces.IClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDTO save(ClientDTO clientDTO) {
        var client = Client.builder()
                            .cpf(clientDTO.getCpf())
                            .name(clientDTO.getName())
                            .age(clientDTO.getAge())
                            .build();

        return new ClientDTO(client = clientRepository.save(client));
    }
}
