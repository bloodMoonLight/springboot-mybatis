package com.example.springboot.mapper;

import com.example.springboot.entity.Department;
import org.apache.ibatis.annotations.*;


/**
 * @ClassName departementMapper
 * @Description TODO
 * @Author 张鸿志
 * @Date 2019年4月13日22:18:40 22:18
 * Version 1.0
 **/
// 指定这是一个操作数据库的mapper
//@Mapper       /在主配置类上标记了@MapperScan()注解就可以不用@Mapper注解了
public interface departementMapper {

    @Select("select * from department where id=#{id}")
    public Department getDepartementId(Integer id);

    @Delete("delete from department where id=#{id}")
    public Integer deleteDeptById(Integer id);

    //是否使用自动生成的主键,并指定哪个参数是主键
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public Integer insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public Integer updateDept(Department department);
}
