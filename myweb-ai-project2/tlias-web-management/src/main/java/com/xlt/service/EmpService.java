package com.xlt.service;

import com.xlt.pojo.EmpQueryParam;
import com.xlt.pojo.PageResult;

public interface EmpService {
     /**
     * 分页查询
     * @param page 页码
     * @param pageSize 每页记录数
     */
    //PageResult page(Integer page, Integer pageSize);
    /**
     * 分页查询
     */
   // PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);

    PageResult page(EmpQueryParam empQueryParam);
}
