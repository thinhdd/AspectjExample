package com.higgsup.spring.service.interfaces;

import com.higgsup.spring.model.Employee;

/**
 * Created by thinhdd on 3/2/2017.
 */
public interface IEmployeeService {
    Employee getEmployee();

    void setEmployee(Employee e);

    void throwExceptionEmployee();
}
