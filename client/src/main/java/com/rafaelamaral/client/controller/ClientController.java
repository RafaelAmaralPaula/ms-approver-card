package com.rafaelamaral.client.controller;

import com.rafaelamaral.client.controller.dtos.ClientDTO;
import com.rafaelamaral.client.service.interfaces.IClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final IClientService clientService;

    public ClientController(IClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> save(@RequestBody ClientDTO clientDTO){
        var result = clientService.save(clientDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                                             .path("/{id}")
                                             .buildAndExpand(result.getId())
                                             .toUri();

        return ResponseEntity.created(uri).body(result);

    }
}
