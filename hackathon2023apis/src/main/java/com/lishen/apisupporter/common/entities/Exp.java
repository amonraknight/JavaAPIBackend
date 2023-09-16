package com.lishen.apisupporter.common.entities;


import lombok.Data;

import java.io.Serializable;

@Data
public class Exp implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String idx;

    private String regex;

    private String task;

    private String number;

    public int getGroupNumberCount() {
        return Integer.parseInt(number);
    }
}