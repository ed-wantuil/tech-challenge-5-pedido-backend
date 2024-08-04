package br.com.fiap.techchallenge.application.usecases.customer.impl;

import br.com.fiap.techchallenge.application.gateways.CustomerGateway;
import br.com.fiap.techchallenge.application.usecases.customer.DeletionCustomer;
import br.com.fiap.techchallenge.domain.entities.CustomerDelete;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeletionCustomerImpl implements DeletionCustomer {

    private final CustomerGateway customerGateway;

    @Override
    public void request(CustomerDelete customerDelete) {
        customerGateway.requestDelete(customerDelete);
    }

}
