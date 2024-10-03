package com.tanyamakuwekuwe.payroll.repositories;

import com.tanyamakuwekuwe.payroll.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
