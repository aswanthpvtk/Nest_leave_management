package com.nest.nest_leave_management.dao;

import com.nest.nest_leave_management.model.Security;
import org.springframework.data.repository.CrudRepository;

public interface SecDao extends CrudRepository<Security,Integer> {
}
