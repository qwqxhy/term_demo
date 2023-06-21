package com.neusoft.crm.controller;


import com.neusoft.crm.entity.Contact;
import com.neusoft.crm.service.IContactService;
import com.neusoft.crm.service.ICustomerService;
import com.neusoft.crm.service.IDictService;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-20
 */
@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/qry/customer")
    public CommonResult queryCustomer(String qryvalue, String select) {
        return customerService.queryCustomer(qryvalue, select);
    }

    @GetMapping("/qry/c4contact")
    public CommonResult queryC4contact(String qryvalue, String select, String empno) {
        return customerService.queryC4contact(qryvalue, select, empno);
    }


}
