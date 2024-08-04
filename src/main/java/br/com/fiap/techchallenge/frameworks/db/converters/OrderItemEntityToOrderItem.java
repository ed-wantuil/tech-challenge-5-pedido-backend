package br.com.fiap.techchallenge.frameworks.db.converters;

import br.com.fiap.techchallenge.domain.vos.OrderItem;
import br.com.fiap.techchallenge.frameworks.db.entities.OrderItemEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderItemEntityToOrderItem {

    public OrderItem convert(final OrderItemEntity orderItemEntity) {
        return OrderItem
                .builder()
                .product(String.valueOf(orderItemEntity.getProduct()))
                .quantity(orderItemEntity.getQuantity())
                .price(orderItemEntity.getPrice())
                .build();
    }
}
