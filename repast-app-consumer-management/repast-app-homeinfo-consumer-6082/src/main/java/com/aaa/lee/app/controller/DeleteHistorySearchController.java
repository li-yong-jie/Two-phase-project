package com.aaa.lee.app.controller;

import com.aaa.lee.app.base.BaseController;
import com.aaa.lee.app.base.ResultData;
import com.aaa.lee.app.service.IRepastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author 李永杰
 * @Date 2019/11/23 21:20
 **/
public class DeleteHistorySearchController extends BaseController {

    @Autowired
    private IRepastService repastService;
    /**
     * 删除某个用户的历史搜索
     * @param
     * @return
     */
    @GetMapping("/getdeleteHistorySearch")
    public ResultData getdeleteHistorySearch(){
        int i = repastService.getdeleteHistorySearch();
        if (1>i){
            return success("删除成功");
        }
        return failed("删除失败");
    }
}
