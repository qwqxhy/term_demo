package com.neusoft.crm.service.impl;

import com.neusoft.crm.entity.Addinfo;
import com.neusoft.crm.mapper.AddinfoMapper;
import com.neusoft.crm.service.IAddinfoService;
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
 * @since 2023-06-19
 */
@Service
public class AddinfoServiceImpl extends ServiceImpl<AddinfoMapper, Addinfo> implements IAddinfoService {

    @Override
    public CommonResult getTree() {
        //获取所有数据
        List<Addinfo> list = list();
        Addinfo root = null;
        //获取所有根数据
        for (int i = 0; i < list.size(); i++) {
            if ("00".equals(list.get(i).getPreaddrno())) {
                root = list.get(i);
                break;
            }
        }
        fileNode(root, list);

        return new CommonResult(root);
    }

    private void fileNode(Addinfo root, List<Addinfo> list) {
        // 查出父节点为root的一级子节点
        for (int i = 0; i < list.size(); i++) {
            if (root.getAddrno().equals(list.get(i).getPreaddrno())) {
                root.getChildren().add(list.get(i));
            }
        }
    }
}
