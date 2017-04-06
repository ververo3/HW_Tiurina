package com.tiurina.dao;

import com.tiurina.model.Employee;

/**
 * Created by Vero on 05.04.2017.
 */
public interface EmployeeDAO {
    public Employee findByEmpId(int empId);
}



