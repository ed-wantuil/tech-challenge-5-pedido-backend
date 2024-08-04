package br.com.fiap.techchallenge.frameworks.db.converters;

import java.util.UUID;

import br.com.fiap.techchallenge.domain.entities.CustomerDelete;
import br.com.fiap.techchallenge.frameworks.db.entities.CustomerDeleteEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerDeleteToCustomerDeleteEntity {

    public CustomerDeleteEntity convert(final CustomerDelete customerDelete) {
        return CustomerDeleteEntity
                .builder()
                .id(UUID.fromString(customerDelete.getId()))
                .nome(customerDelete.getNome())
                .endereco(customerDelete.getEndereco())
                .numeroTelefone(customerDelete.getNumeroTelefone())
                .informacaoPagamento(customerDelete.getInformacaoPagamento())
                .build();
    }
}
