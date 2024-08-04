package br.com.fiap.techchallenge.domain.vos;

import lombok.Builder;

@Builder
public record OrderItem(String product, Integer quantity, Double price) {

}
