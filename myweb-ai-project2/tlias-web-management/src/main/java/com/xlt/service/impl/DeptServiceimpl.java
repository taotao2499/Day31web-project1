package com.xlt.service.impl;

import com.xlt.mapper.DeptMapper;
import com.xlt.pojo.Dept;
import com.xlt.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class DeptServiceimpl implements DeptService {
    @Override
    public void update(Dept dept) {
        //1.
        dept.setUpdateTime(LocalDateTime.now());
        //2.
        deptMapper.update(dept);
    }

    @Override
    public void add(Dept dept) {
        //1.
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        //2.
        deptMapper.insert(dept);
    }

    @Override
    public Dept getById(Integer id) {
        return deptMapper.getById(id);
    }

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }


}
