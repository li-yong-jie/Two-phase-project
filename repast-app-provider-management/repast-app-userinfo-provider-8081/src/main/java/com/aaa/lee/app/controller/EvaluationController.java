package com.aaa.lee.app.controller;

import com.aaa.lee.app.base.ResultData;
import com.aaa.lee.app.domain.ProductEvaluation;
import com.aaa.lee.app.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/21 19:25
 **/
@RestController
public class EvaluationController {

    @Autowired
    private EvaluationService evaluationService;
    /**
     * 查询商品评论
     * @param
     * @return
     */
    @GetMapping("/getProductEvaluation")
    public List<ProductEvaluation> getProductEvaluation(Long id){

        List<ProductEvaluation> productEvaluation = evaluationService.getProductEvaluation(id);
        System.out.println(productEvaluation);
        return productEvaluation;
    }

}
