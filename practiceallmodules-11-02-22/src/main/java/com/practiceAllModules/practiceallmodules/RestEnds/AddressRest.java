package com.practiceAllModules.practiceallmodules.RestEnds;

import com.practiceAllModules.practiceallmodules.entity.Address;
import com.practiceAllModules.practiceallmodules.entity.userRepo.AddresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class AddressRest
{
    @Autowired
    AddresRepo addresRepo;


    @GetMapping("allAddress")
    @Transactional
    List<Address> getAllAddress()
    {
        return addresRepo.findAll();
    }

}
