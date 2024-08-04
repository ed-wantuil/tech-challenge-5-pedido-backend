package br.com.fiap.techchallenge.application.usecases.order;

import br.com.fiap.techchallenge.domain.entities.Order;

public interface RegisterPayment {
    void register(Order order);
}
