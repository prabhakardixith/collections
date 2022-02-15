package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.practiceAllModules.practiceallmodules.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepo extends JpaRepository<Complaint,Integer> {
}
