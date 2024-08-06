package br.com.fiap.techchallenge.interfaces.controllers.customer.requests;


import jakarta.validation.constraints.Size;

public record CustomerRequest(@Size(max = 50) String id,
                              String cpf,
                              String name,
                              String email) {
}
