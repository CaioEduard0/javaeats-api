package com.example.javaeatsapi.infrastructure.repository;

import com.example.javaeatsapi.domain.model.Payment;
import com.example.javaeatsapi.domain.repository.PaymentRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Payment> findAll() {
        return entityManager.createQuery("select p from Payment p", Payment.class).getResultList();
    }

    @Override
    public Payment find(Long id) {
        return entityManager.find(Payment.class, id);
    }

    @Override
    public Payment save(Payment payment) {
        return entityManager.merge(payment);
    }

    @Override
    public void delete(Payment payment) {
        entityManager.remove(payment);
    }
}
