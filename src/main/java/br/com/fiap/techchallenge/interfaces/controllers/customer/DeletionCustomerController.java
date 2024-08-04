package br.com.fiap.techchallenge.interfaces.controllers.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.DeletionCustomerRequest;

public interface DeletionCustomerController {

    void delete(DeletionCustomerRequest deletionCustomerRequest);
}
