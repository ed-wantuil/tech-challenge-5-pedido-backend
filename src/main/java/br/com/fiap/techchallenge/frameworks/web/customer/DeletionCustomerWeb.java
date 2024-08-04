package br.com.fiap.techchallenge.frameworks.web.customer;

import br.com.fiap.techchallenge.interfaces.controllers.customer.requests.DeletionCustomerRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface DeletionCustomerWeb {

    @Operation(summary = "Request delete a customer",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Requested")
            })
    @PostMapping("customer/request-delete")
    void delete(@RequestBody DeletionCustomerRequest deletionCustomerRequest);
}
