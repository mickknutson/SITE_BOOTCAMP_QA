package com.bughunters.site.ems.dao;

import com.bughunters.site.ems.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
    // Voodoo Magic is already here... ;-)

}
