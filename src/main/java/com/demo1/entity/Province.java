package com.demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Province implements Serializable {
    private BigDecimal id;

    private String code;

    private String name;

    private static final long serialVersionUID = 1L;
}