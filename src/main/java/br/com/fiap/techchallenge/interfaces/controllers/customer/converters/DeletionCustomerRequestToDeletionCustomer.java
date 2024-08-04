package br.com.fiap.techchallenge.interfaces.controllers.customer.converters;

import br.com.fiap.techchallenge.domain.entities.CustomerDelete;
import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.DeletionCustomerRequest;

public class DeletionCustomerRequestToDeletionCustomer {

    public CustomerDelete convert(final DeletionCustomerRequest deletionCustomerRequest) {

        return CustomerDelete.builder()
                .nome(deletionCustomerRequest.nome())
                .endereco(deletionCustomerRequest.endereco())
                .numeroTelefone(deletionCustomerRequest.numeroTelefone())
                .informacaoPagamento(deletionCustomerRequest.informacaoPagamento())
                .build();
    }
}
