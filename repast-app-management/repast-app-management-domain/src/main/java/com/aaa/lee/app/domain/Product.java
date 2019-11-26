package com.aaa.lee.app.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Product {
    private Long id;

    private Long shopId;

    private Long brandId;

    private Long productCategoryId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    private String productSn;

    private Integer deleteStatus;

    private Integer publishStatus;

    private Integer newStatus;

    private Integer recommandStatus;

    private Integer sort;

    private Integer sale;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private Integer giftPoint;

    private String subTitle;

    private BigDecimal originalPrice;

    private Integer stock;

    private Integer lowStock;

    private String unit;

    private BigDecimal weight;

    private String serviceIds;

    private String keywords;

    private String note;

    private Long albumId;

    private String detailTitle;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date promotionStartTime;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date promotionEndTime;

    private Integer promotionPerLimit;

    private Integer promotionType;

    private String brandName;

    private String productCategoryName;

    private Byte currency;

    private String description;

    private String detailDesc;

    private String detailHtml;

    private String detailMobileHtml;


}