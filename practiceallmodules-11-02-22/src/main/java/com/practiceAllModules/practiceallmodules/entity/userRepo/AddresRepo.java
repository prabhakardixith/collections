package com.practiceAllModules.practiceallmodules.entity.userRepo;

import com.practiceAllModules.practiceallmodules.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddresRepo extends JpaRepository<Address,Integer> {
}
