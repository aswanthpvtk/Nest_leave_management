package com.nest.nest_leave_management.Controller;

import com.nest.nest_leave_management.dao.EmployeeDao;
import com.nest.nest_leave_management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {

  @Autowired
    private EmployeeDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> Addemp(@RequestBody Employee e){

        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

}
