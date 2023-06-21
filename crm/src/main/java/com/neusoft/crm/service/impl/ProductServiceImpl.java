package com.neusoft.crm.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neusoft.crm.entity.Product;
import com.neusoft.crm.mapper.ProductMapper;
import com.neusoft.crm.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.neusoft.crm.tools.CommonResult;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HuaYuan
 * @since 2023-06-19
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public CommonResult getProductList(Integer currentPage, Integer pageSize) {
        Page<Product> page = new Page<>(currentPage, pageSize);
        page(page);
        Map<String, Object> result = new HashMap<>();
        result.put("current", page.getCurrent());
        result.put("size", page.getSize());
        result.put("total", page.getTotal());
        result.put("records", page.getRecords());
        System.out.println(result);
        return new CommonResult(result);
    }
}
