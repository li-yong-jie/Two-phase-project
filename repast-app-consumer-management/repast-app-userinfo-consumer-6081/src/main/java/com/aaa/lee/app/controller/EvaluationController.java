package com.aaa.lee.app.controller;

import com.aaa.lee.app.base.BaseController;
import com.aaa.lee.app.base.ResultData;
import com.aaa.lee.app.domain.ProductEvaluation;
import com.aaa.lee.app.service.IRepastService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/21 16:06
 **/
@RestController
@Api(value = "评论",tags = "商品评论")
public class EvaluationController extends BaseController {
    @Autowired
    private IRepastService repastService;

    /**
     * 查看商品全部评论
     * @param
     * @return
     */
    @GetMapping("/getProductEvaluation")
    @ApiOperation(value = "商品评论",notes = "察看商品评论")
    public ResultData  getProductEvaluation(Long id){
        List<ProductEvaluation> productEvaluation = repastService.getProductEvaluation(id);
        if(null!=productEvaluation){
            return success(productEvaluation);
        }
        return failed();
    }

}
