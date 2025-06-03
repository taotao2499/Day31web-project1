package com.xlt.mapper;

import com.xlt.pojo.Emp;
import com.xlt.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    /**
     * 查询总记录数
     */
//    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id ")
//    public Long count();

    /**
     * 查询所有的员工及其对应的部门名称
     */
//    @Select("select e.*, d.name deptName from emp as e left join dept as d on e.dept_id = d.id ")
//    public List<Emp> list();

    /**
     * 查询所有的员工及其对应的部门名称
     */
   // public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);

    List<Emp> list(EmpQueryParam empQueryParam);
}
