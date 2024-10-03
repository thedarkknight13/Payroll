package com.tanyamakuwekuwe.payroll.repositories;

import com.tanyamakuwekuwe.payroll.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
