package com.neusoft.crm.service;

import com.neusoft.crm.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.neusoft.crm.tools.CommonResult;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-20
 */
public interface ICustomerService extends IService<Customer> {


    CommonResult queryCustomer(String qryvalue, String select);

    CommonResult queryC4contact(String qryvalue, String cname, String empno);
}
