package com.example.hexagonal.adapters.in.consumer.mapper;

import com.example.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.example.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface CustomerMessageMapper {

    Customer toCustomer(final CustomerMessage customerMessage);

}
