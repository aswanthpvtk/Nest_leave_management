package com.nest.nest_leave_management.dao;

import com.nest.nest_leave_management.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
