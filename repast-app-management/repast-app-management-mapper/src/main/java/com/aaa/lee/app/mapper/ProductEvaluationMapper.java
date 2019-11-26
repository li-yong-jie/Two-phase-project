package com.aaa.lee.app.mapper;

import com.aaa.lee.app.domain.ProductEvaluation;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductEvaluationMapper extends Mapper<ProductEvaluation> {


    List<ProductEvaluation> selectAllEvaluation(Long id);
}