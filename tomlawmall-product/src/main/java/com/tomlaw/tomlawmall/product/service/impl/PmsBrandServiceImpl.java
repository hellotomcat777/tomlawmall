package com.tomlaw.tomlawmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tomlaw.common.utils.PageUtils;
import com.tomlaw.common.utils.Query;

import com.tomlaw.tomlawmall.product.dao.PmsBrandDao;
import com.tomlaw.tomlawmall.product.entity.PmsBrandEntity;
import com.tomlaw.tomlawmall.product.service.PmsBrandService;


@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrandEntity> implements PmsBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBrandEntity> page = this.page(
                new Query<PmsBrandEntity>().getPage(params),
                new QueryWrapper<PmsBrandEntity>()
        );

        return new PageUtils(page);
    }

}