package org.fkit.domain;

import lombok.Data;

import java.util.List;
@Data
public class Employee {
    private List<Dept> depts;
}
