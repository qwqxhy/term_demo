package com.neusoft.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neusoft.crm.entity.Emp;
import com.neusoft.crm.mapper.EmpMapper;
import com.neusoft.crm.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-18
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

    @Autowired
    private  EmpMapper empMapper;
    @Override
    public CommonResult login(Emp emp) {
        //根据emp中的账户名密码查询数据库是否有匹配
        //查到登录，没查到无此用户
        QueryWrapper<Emp> w = new QueryWrapper<>();
        w.eq("logid",emp.getLogid());
        w.eq("logpwd",emp.getLogpwd());
        Emp e = empMapper.selectOne(w);
        empMapper.selectOne(w);
//        Emp e = empMapper.login(emp);
        if (e == null) {
            return new CommonResult(null, 204);
        }
        return new CommonResult(e);
    }
}
