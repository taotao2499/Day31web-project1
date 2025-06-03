package com.xlt.controller;

import com.xlt.pojo.EmpQueryParam;
import com.xlt.pojo.PageResult;
import com.xlt.pojo.Result;
import com.xlt.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequestMapping("/emps")
@RestController
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping
    public Result page(EmpQueryParam empQueryParam){
//        log.info("查询员工信息, page={}, pageSize={}", page, pageSize);
//        PageResult pageResult = empService.page(page, pageSize);
        log.info("查询请求参数： {}", empQueryParam);
        PageResult pageResult = empService.page(empQueryParam);
        return Result.success(pageResult);
    }
}
