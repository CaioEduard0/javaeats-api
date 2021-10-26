package com.example.javaeatsapi.domain.repository;

import com.example.javaeatsapi.domain.model.Payment;

import java.util.List;

public interface PaymentRepository {

    List<Payment> findAll();

    Payment find(Long id);

    Payment save(Payment payment);

    void delete(Payment payment);
}
