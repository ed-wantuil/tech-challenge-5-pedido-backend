package br.com.fiap.techchallenge.interfaces.controllers.customer.impl;

import br.com.fiap.techchallenge.application.usecases.customer.DeletionCustomer;
import br.com.fiap.techchallenge.domain.entities.CustomerDelete;
import br.com.fiap.techchallenge.interfaces.controllers.customer.DeletionCustomerController;
import br.com.fiap.techchallenge.interfaces.controllers.customer.converters.DeletionCustomerRequestToDeletionCustomer;
import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.DeletionCustomerRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DeletionCustomerControllerImpl implements DeletionCustomerController {

    private final DeletionCustomer deletionCustomer;

    private final DeletionCustomerRequestToDeletionCustomer deletionCustomerRequestToDeletionCustomer;

    @Override
    public void delete(DeletionCustomerRequest deletionCustomerRequest) {

        CustomerDelete customerDelete = deletionCustomerRequestToDeletionCustomer.convert(deletionCustomerRequest);

        deletionCustomer.request(customerDelete);
    }
}
