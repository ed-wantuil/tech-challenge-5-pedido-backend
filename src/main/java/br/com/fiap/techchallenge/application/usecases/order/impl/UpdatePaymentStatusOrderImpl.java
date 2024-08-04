package br.com.fiap.techchallenge.application.usecases.order.impl;

import br.com.fiap.techchallenge.application.gateways.OrderGateway;
import br.com.fiap.techchallenge.application.usecases.order.UpdatePaymentStatusOrder;
import br.com.fiap.techchallenge.domain.entities.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UpdatePaymentStatusOrderImpl implements UpdatePaymentStatusOrder {

    private final OrderGateway orderGateway;

    @Override
    public Order update(Order order) {

        order = orderGateway.findById(order.getId());

        order.setPaymentStatus(order.getPaymentStatus());
        order.setDeliveryStatus(order.getDeliveryStatus());

        return orderGateway.save(order);
    }
}
