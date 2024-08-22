package com.example.hexagonal.application.core.usecase;

import com.example.hexagonal.application.core.domain.Customer;
import com.example.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.example.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.example.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
        final InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(final Customer customer, final String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }

}
