package com.neusoft.crm.controller;


import com.neusoft.crm.entity.Emp;
import com.neusoft.crm.service.IEmpService;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 员工信息表 前端控制器
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-18
 */
@RestController
@RequestMapping("/emp")
@CrossOrigin
public class EmpController {
    @Autowired
    private IEmpService empService;

    @RequestMapping("/list")
    public CommonResult getEmplist() {
        List<Emp> list = empService.list();
        if (list == null || list.size() == 0) {
            return new CommonResult(null, 204);
        }
        return new CommonResult(list);
    }

    @RequestMapping("/login")
    public CommonResult login(@RequestBody Emp emp) {
        return empService.login(emp);
    }
}
