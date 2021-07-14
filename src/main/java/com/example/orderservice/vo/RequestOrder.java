package com.example.orderservice.vo;

import lombok.Data;
import org.springframework.boot.convert.DataSizeUnit;

@Data
public class RequestOrder {
    private String productId;
    private Integer qty;
    private Integer unitPrice;
}
