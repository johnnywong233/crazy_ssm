package org.fkit.hrm.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    private Integer id;            // id
    private String name;        // 职位名称
    private String remark;        // 详细描述
}