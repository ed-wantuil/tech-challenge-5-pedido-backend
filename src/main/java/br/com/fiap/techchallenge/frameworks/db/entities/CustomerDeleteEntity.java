package br.com.fiap.techchallenge.frameworks.db.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CustomerDeleteEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    private String endereco;

    private String numeroTelefone;

    private String informacaoPagamento;
}
