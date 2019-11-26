package com.aaa.lee.app.controller;

import com.aaa.lee.app.service.RedisService;
import com.aaa.lee.app.service.DeleteHistorySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 李永杰
 * @Date 2019/11/23 21:11
 **/
@RestController
public class DeleteHistorySearchController {
    @Autowired
    private DeleteHistorySearchService deleteHistorySearchService;
    @Autowired
    private RedisService redisService;

    /**
     * 删除某个用户的历史搜索
     * @param redisService
     * @return
     */
    @GetMapping("/getdeleteHistorySearch")
    public int getdeleteHistorySearch(RedisService redisService){
        return deleteHistorySearchService.getdeleteHistorySearch(redisService);
    }
}
