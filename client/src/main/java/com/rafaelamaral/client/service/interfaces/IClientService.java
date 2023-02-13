package com.rafaelamaral.client.service.interfaces;

import com.rafaelamaral.client.controller.dtos.ClientDTO;

public interface IClientService {
    ClientDTO save(ClientDTO clientDTO);
}
