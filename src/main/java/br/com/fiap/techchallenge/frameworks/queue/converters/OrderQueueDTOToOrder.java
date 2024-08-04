package br.com.fiap.techchallenge.frameworks.queue.converters;

import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.frameworks.queue.dtos.OrderQueueDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrderQueueDTOToOrder {


    public Order convert(final OrderQueueDTO orderQueueDTO) {
        return Order
                .builder()
                .id(orderQueueDTO.orderId())
                .paymentStatus(orderQueueDTO.paymentStatus())
                .deliveryStatus(orderQueueDTO.deliveryStatus())
                .build();
    }
}
