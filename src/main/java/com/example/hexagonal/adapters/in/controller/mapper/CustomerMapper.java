package com.example.hexagonal.adapters.in.controller.mapper;

import com.example.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.example.hexagonal.adapters.in.controller.response.CustomerResponse;
import com.example.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface CustomerMapper {

    Customer toCustomer(final CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(final Customer customer);

}
