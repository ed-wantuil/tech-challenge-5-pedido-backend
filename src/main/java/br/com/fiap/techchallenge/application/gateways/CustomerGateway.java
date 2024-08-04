package br.com.fiap.techchallenge.application.gateways;


import br.com.fiap.techchallenge.domain.entities.Customer;
import br.com.fiap.techchallenge.domain.entities.CustomerDelete;

public interface CustomerGateway {
    Customer create(Customer customer);

    Customer findByCpf(String cpf);

    void requestDelete(CustomerDelete customerDelete);
}
