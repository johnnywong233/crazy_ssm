package org.fkit.domain;

import java.io.Serializable;

// 域对象，实现序列化接口
public class User implements Serializable {
    // 部门编号
    private Integer deptId;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }


}
