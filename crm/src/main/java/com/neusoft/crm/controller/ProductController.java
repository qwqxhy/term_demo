package com.neusoft.crm.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neusoft.crm.entity.Product;
import com.neusoft.crm.service.IProductService;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-19
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/qry/paged/{currentPage}/{pageSize}")
    public CommonResult getProduct(@PathVariable("currentPage") Integer currentPage,
                                   @PathVariable("pageSize") Integer pageSize) {
        return productService.getProductList(currentPage, pageSize);

    }

}
