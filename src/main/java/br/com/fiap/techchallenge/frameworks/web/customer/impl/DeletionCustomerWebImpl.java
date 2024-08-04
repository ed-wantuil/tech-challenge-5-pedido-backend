package br.com.fiap.techchallenge.frameworks.web.customer.impl;

import br.com.fiap.techchallenge.frameworks.web.customer.DeletionCustomerWeb;
import br.com.fiap.techchallenge.interfaces.controllers.customer.DeletionCustomerController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.DeletionCustomerRequest;
import br.com.fiap.techchallenge.interfaces.controllers.customer.responses.CustomerResponse;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeletionCustomerWebImpl implements DeletionCustomerWeb {

    private final DeletionCustomerController deletionCustomerController;

    @Override
    public void delete(DeletionCustomerRequest deletionCustomerRequest) {

        deletionCustomerController.delete(deletionCustomerRequest);
    }
}
