package com.nest.nest_leave_management.dao;

import com.nest.nest_leave_management.model.LeaveCount;
import org.springframework.data.repository.CrudRepository;

public interface LeaveDao extends CrudRepository<LeaveCount,Integer> {
}
