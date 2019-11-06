package com.wb.crud.service.impl;

import com.wb.crud.bean.Employee;
import com.wb.crud.bean.EmployeeExample;
import com.wb.crud.dao.EmployeeMapper;
import com.wb.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wb_cheng
 * @Date: 2019/11/6 11:46
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmpList(Integer id) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpIdEqualTo(id);
        example.setOrderByClause("emp_id desc"); //排序
        return employeeMapper.selectByExample(example);
    }
}
