package com.neusoft.crm.mapper;

import com.neusoft.crm.entity.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 员工信息表 Mapper 接口
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-18
 */
public interface EmpMapper extends BaseMapper<Emp> {
    Emp login(@Param("param") Emp emp);
}
