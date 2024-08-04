package br.com.fiap.techchallenge.interfaces.controllers.customer.requests;

public record DeletionCustomerRequest(String nome,
                                      String endereco,
                                      String numeroTelefone,
                                      String informacaoPagamento) {
}
