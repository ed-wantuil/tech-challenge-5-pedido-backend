package br.com.fiap.techchallenge.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CustomerDelete {

    private String id;
    private String nome;
    private String endereco;
    private String numeroTelefone;
    private String informacaoPagamento;
}
