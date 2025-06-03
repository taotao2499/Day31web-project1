package com.xlt.service.impl;

import com.xlt.mapper.EmpMapper;
import com.xlt.pojo.Emp;
import com.xlt.pojo.EmpQueryParam;
import com.xlt.pojo.PageResult;
import com.xlt.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceimpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    //    @Override
//    public PageResult page(Integer page, Integer pageSize) {
//        Long total = empMapper.count();
//
//        //2. 获取结果列表
//        Integer start = (page - 1) * pageSize;
//        List<Emp> empList = empMapper.list(start, pageSize);
//
//        //3. 封装结果
//        return new PageResult(total, empList);
//    }


//    @Override
//    public PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end) {
//        //1. 设置PageHelper分页参数
//        PageHelper.startPage(page, pageSize);
//        //2. 执行查询
//        List<Emp> empList = empMapper.list(name, gender, begin, end);
//        //3. 封装分页结果
//        Page<Emp> p = (Page<Emp>) empList;
//        return new PageResult(p.getTotal(), p.getResult());
//    }

    public PageResult page(EmpQueryParam empQueryParam) {
        //1. 设置PageHelper分页参数
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());
        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);
        //3. 封装分页结果
        Page<Emp> p = (Page<Emp>)empList;
        return new PageResult(p.getTotal(), p.getResult());
    }
}
