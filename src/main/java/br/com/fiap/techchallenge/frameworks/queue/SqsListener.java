package br.com.fiap.techchallenge.frameworks.queue;

import br.com.fiap.techchallenge.application.usecases.order.UpdatePaymentStatusOrder;
import br.com.fiap.techchallenge.domain.entities.Order;
import br.com.fiap.techchallenge.frameworks.queue.converters.OrderQueueDTOToOrder;
import br.com.fiap.techchallenge.frameworks.queue.dtos.OrderQueueDTO;
import br.com.fiap.techchallenge.frameworks.util.JsonConverter;
import jakarta.jms.TextMessage;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SqsListener {

    private final JsonConverter jsonConverter;

    private final OrderQueueDTOToOrder orderQueueDTOToOrder;

    private final UpdatePaymentStatusOrder updatePaymentStatusOrder;

    @SneakyThrows
    @JmsListener(destination = "${aws.sqs.queue.cancelamento.name}")
    public void receiveMessage(final TextMessage textMessage) {
        log.info("receiveMessge MESSAGE: {}", textMessage.getText());

        final OrderQueueDTO orderQueueDTO = (OrderQueueDTO) jsonConverter.jsonToObject(textMessage.getText(), OrderQueueDTO.class);
        final Order order = orderQueueDTOToOrder.convert(orderQueueDTO);

        try {
            updatePaymentStatusOrder.update(order);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
