package com.example.hexagonal.adapters.in.controller;

import com.example.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.example.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.example.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.example.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.example.hexagonal.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private final InsertCustomerInputPort insertCustomerInputPort;
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid final CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

}
