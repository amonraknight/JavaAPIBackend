package com.lishen.apisupporter.common.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class NifiComponent implements Serializable {
    private static final long serialVersionUID = 1L;
    String type;
    String classfile;

}
