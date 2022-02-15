package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.practiceAllModules.practiceallmodules.entity.DeptSalaryTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptSalRepo extends JpaRepository<DeptSalaryTest,String>
{
}
