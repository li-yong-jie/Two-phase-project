package com.aaa.lee.app.service;

import com.aaa.lee.app.base.BaseService;
import com.aaa.lee.app.domain.ProductEvaluation;
import com.aaa.lee.app.mapper.ProductEvaluationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author 李永杰
 * @Date 2019/11/21 19:33
 **/
@Service
public class EvaluationService extends BaseService<ProductEvaluation> {

    @Autowired
    private ProductEvaluationMapper evaluationMapper;
    @Override
    public Mapper<ProductEvaluation> getMapper() {
        return  evaluationMapper;
    }

    /**'
     * 查询商品评论
     * @param id
     * @return
     */
    public List<ProductEvaluation>  getProductEvaluation(Long id){
        List<ProductEvaluation> productEvaluations = evaluationMapper.selectAllEvaluation(id);
        System.out.println(productEvaluations);
        if(productEvaluations.size()>0){
            return productEvaluations;
        }
        return null;
    }
}
