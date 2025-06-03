package com.xlt.service;

import com.xlt.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();

    //根据id删除部门
    void deleteById(Integer id);

    //添加部门
    void add(Dept dept);


    // 根据id查询部门
    Dept getById(Integer id);

    void update(Dept dept);
}
