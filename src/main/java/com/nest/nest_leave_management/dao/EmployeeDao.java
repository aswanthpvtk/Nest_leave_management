package com.nest.nest_leave_management.dao;

import com.nest.nest_leave_management.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `designation`, `email`, `empid`, `empname`, `mob`, `psw`, `salary`, `uname` FROM `employee` WHERE `email`=:email AND `psw`=:psw",nativeQuery = true)
    List<Employee> login(@Param("email") String email, @Param("psw")String psw);

    @Query(value = "SELECT `id`, `designation`, `email`, `empid`, `empname`, `mob`, `psw`, `salary`, `uname` FROM `employee` WHERE `empid`=:empid",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empid") Integer empid);
}
