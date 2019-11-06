package com.wb.crud.controller;

import com.wb.crud.bean.Employee;
import com.wb.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

/**
 * @Auther: wb_cheng
 * @Date: 2019/11/6 11:44
 * @Description:
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmpList")
    public String getEmpList(Integer id, Map<String, Object> map) {
        List<Employee> empList = employeeService.getEmpList(id);
        map.put("empList", empList);
        return "list";
    }

}
