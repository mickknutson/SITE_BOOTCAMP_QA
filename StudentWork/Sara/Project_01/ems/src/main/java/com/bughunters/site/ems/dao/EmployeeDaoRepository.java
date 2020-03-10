package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDaoRepository extends CrudRepository<Employee, Integer> {
}
