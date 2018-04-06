package org.fkit.hrm.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dept implements Serializable {

    private Integer id;        // id
    private String name;    // 部门名称
    private String remark;    // 详细描述
}
