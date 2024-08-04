package br.com.fiap.techchallenge.application.usecases.customer;

import br.com.fiap.techchallenge.domain.entities.CustomerDelete;

public interface DeletionCustomer {
    void request(CustomerDelete customerDelete);
}
