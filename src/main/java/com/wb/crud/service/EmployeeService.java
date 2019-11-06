package com.wb.crud.service;

import com.wb.crud.bean.Employee;

import java.util.List;

/**
 * @Auther: wb_cheng
 * @Date: 2019/11/6 11:45
 * @Description:
 */
public interface EmployeeService {

    List<Employee> getEmpList(Integer id);

}
