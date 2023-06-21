package com.neusoft.crm.controller;


import com.neusoft.crm.service.IAddinfoService;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-19
 */
@RestController
@RequestMapping("/addi")
@CrossOrigin
public class AddinfoController {
    @Autowired
    private IAddinfoService addinfoService;

    @GetMapping("/tree")
    public CommonResult getTree() {
        return addinfoService.getTree();
    }
}
