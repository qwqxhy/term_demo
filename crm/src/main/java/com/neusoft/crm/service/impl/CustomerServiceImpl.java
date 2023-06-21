package com.neusoft.crm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neusoft.crm.entity.Customer;
import com.neusoft.crm.mapper.CustomerMapper;
import com.neusoft.crm.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-20
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

    @Override
    public CommonResult queryCustomer(String qryvalue, String select) {
        QueryWrapper<Customer> wrapper = new QueryWrapper<>();
        wrapper.like(select, qryvalue);
        List<Customer>list = list(wrapper);
        return new CommonResult(list);
    }

    @Override
    public CommonResult queryC4contact(String qryvalue, String select, String empno) {
        QueryWrapper<Customer> wrapper = new QueryWrapper<>();
        wrapper.like(select, qryvalue);
        List<Customer>list = list(wrapper);
        return new CommonResult(list);
    }
}
