package com.nest.nest_leave_management.Controller;

import com.nest.nest_leave_management.dao.SecDao;
import com.nest.nest_leave_management.model.Employee;
import com.nest.nest_leave_management.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SecurityController {

    @Autowired
    private SecDao sao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity",consumes = "application/json",produces = "application/json")
    public HashMap<String, String> Addsecu(@RequestBody Security e){

        sao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }


}
