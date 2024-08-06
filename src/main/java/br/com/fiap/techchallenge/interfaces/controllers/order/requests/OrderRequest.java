package br.com.fiap.techchallenge.interfaces.controllers.order.requests;

import java.time.LocalDate;
import java.util.List;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.CustomerRequest;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record OrderRequest(@Size(max = 50) String id,
                           CustomerRequest customer,
                           List<OrderItemRequest> items,
                           LocalDate created,
                           Double amount,
                           @Size(max = 50) String deliveryStatus,
                           String paymentStatus) {

    @Builder
    public record OrderItemRequest(@Size(max = 50) String product,
                                   Integer quantity,
                                   Double price) {
    }
}
