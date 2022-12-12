package com.nest.nest_leave_management.dao;

import com.nest.nest_leave_management.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `designation`, `email`, `empid`, `empname`, `mob`, `psw`, `salary`, `uname` FROM `employee` WHERE `email`=:email AND `psw`=:psw",nativeQuery = true)
    List<Employee> login(@Param("email") String email, @Param("psw")String psw);

    @Query(value = "SELECT `id`, `designation`, `email`, `empid`, `empname`, `mob`, `psw`, `salary`, `uname` FROM `employee` WHERE `empid`=:empid",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("empid") Integer empid);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `employee` WHERE `id`=:id",nativeQuery = true)
    void deleteEmployee(@Param("id") Integer id);



    @Query(value = "SELECT `id`, `designation`, `email`, `empid`, `empname`, `mob`, `psw`, `salary`, `uname` FROM `employee` WHERE `id`=:id",nativeQuery = true)
    List<Employee> userInfo(@Param("id") Integer id);

}


