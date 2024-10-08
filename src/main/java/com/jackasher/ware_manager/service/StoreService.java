package com.jackasher.ware_manager.service;


import com.jackasher.ware_manager.entity.Result;
import com.jackasher.ware_manager.entity.Store;
import com.jackasher.ware_manager.page.Page;

import java.util.List;

public interface StoreService {

    //查询所有仓库的业务方法
    public List<Store> queryAllStore();

    //分页查询仓库的业务方法
    public Page queryStorePage(Page page, Store store);

    //校验仓库编号是否已存在的业务方法
    public Result checkStoreNum(String storeNum);

    //添加仓库的业务方法
    public Result saveStore(Store store);

    //修改仓库的业务方法
    public Result updateStore(Store store);

    //删除仓库的业务方法
    public Result deleteStore(Integer storeId);
}
