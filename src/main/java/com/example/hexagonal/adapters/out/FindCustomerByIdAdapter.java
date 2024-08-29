package com.example.hexagonal.adapters.out;

import com.example.hexagonal.adapters.out.repository.CustomerRepository;
import com.example.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.example.hexagonal.application.core.domain.Customer;
import com.example.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(final String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }

}
