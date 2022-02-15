package com.practiceAllModules.practiceallmodules.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DeptSalaryTest
{
    @Id
    private int id;
    private String branch;
    private int salary;
}
