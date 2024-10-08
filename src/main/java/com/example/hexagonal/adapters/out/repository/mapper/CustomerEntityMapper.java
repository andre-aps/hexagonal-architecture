package com.example.hexagonal.adapters.out.repository.mapper;

import com.example.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.example.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(final Customer customer);

    Customer toCustomer(final CustomerEntity customerEntity);

}
