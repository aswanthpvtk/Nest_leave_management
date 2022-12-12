package com.nest.nest_leave_management.Controller;

import com.nest.nest_leave_management.dao.EmployeeDao;
import com.nest.nest_leave_management.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/emplogin", produces = "application/json", consumes = "application/json")
    public HashMap<String, String> UserLogin(@RequestBody Employee e)
    {
        System.out.println(e.getEmail());
        System.out.println(e.getPsw());
        List<Employee> result = (List<Employee>) dao.login(e.getEmail(), e.getPsw());
        HashMap<String, String> st = new HashMap<>();
        if (result.size() == 0)
        {
            st.put("status", "failed");
            st.put("message", "user doesn't exist");
        } else
        {
            int id = result.get(0).getId();
            st.put("userId", String.valueOf(id));
            st.put("status", "success");
            st.put("message", "success");
        }

        return st;
    }


    @CrossOrigin(origins = "*")
    @GetMapping("/empview")
    public List<Employee> View()
    {
        return (List<Employee>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/empsearch",consumes = "application/json",produces = "application/json")
    public List<Employee> Search(@RequestBody Employee s)
    {

        String empcode=String.valueOf(s.getEmpid());
        System.out.println(empcode);
        return(List<Employee>)dao.SearchEmployee(s.getEmpid());
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/empdelete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> Delete(@RequestBody Employee e)
    {

        String empid=String.valueOf(e.getId());
        System.out.println(empid);
        dao.deleteEmployee(e.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");

        return map;
    }


}
