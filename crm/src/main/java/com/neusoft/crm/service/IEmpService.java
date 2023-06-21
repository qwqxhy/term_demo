package com.neusoft.crm.service;

import com.neusoft.crm.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.crm.tools.CommonResult;

/**
 * <p>
 * 员工信息表 服务类
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-18
 */
public interface IEmpService extends IService<Emp> {

    CommonResult login(Emp emp);
}
