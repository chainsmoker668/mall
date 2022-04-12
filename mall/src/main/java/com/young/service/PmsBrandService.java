package com.young.service;

import com.young.mbg.model.PmsBrand;

import java.util.List;

/**
 * PmsBrandService
 *
 * created by young 2022.03
 */
public interface PmsBrandService {
    //展示全部品牌
    List<PmsBrand> listAllBrand();
    //增加一个品牌
    int creatBrand(PmsBrand pmsBrand);
    //更新
    int updateBrand(Long id,PmsBrand pmsBrand);
    //删除
    int deleteBrand(Long id);
    //分页？
    List<PmsBrand> listBrand(int pageNum,int pageSize);
    //取得品牌信息
    PmsBrand getBrand(Long id);
}
