package com.rafaelamaral.client.controller.dtos;

import com.rafaelamaral.client.domain.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ClientDTO {

    private Long id;
    private String cpf;
    private String name;
    private Integer age;

    public ClientDTO(){}

    public ClientDTO(Client client){
        id = client.getId();
        cpf = client.getCpf();
        name = client.getName();
        age = client.getAge();
    }

}
