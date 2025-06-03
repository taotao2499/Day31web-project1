package com.xlt.controller;

import com.xlt.pojo.Dept;
import com.xlt.pojo.Result;
import com.xlt.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts",method = RequestMethod.GET)
    public Result list(){
        System.out.println("查询所有部门数据");
        List<Dept> deptlist = deptService.findAll();
        return Result.success(deptlist);
    }


    //删除部门
    @DeleteMapping("/depts")
    public Result delete(Integer id){
        System.out.println("删除部门："+id);
        deptService.deleteById(id);
        return Result.success();
    }

    //新增部门
    @RequestMapping(value = "/depts",method = RequestMethod.POST)
    public Result add(@RequestBody Dept dept){
        System.out.println("新增部门："+dept);
        deptService.add(dept);
        return Result.success();
    }

    //根据id查询部门
    @RequestMapping(value = "/depts/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable Integer id){
        System.out.println("根据id查询部门："+id);
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    //修改部门
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        System.out.println("修改部门："+dept);
        deptService.update(dept);
        return Result.success();
    }
}
