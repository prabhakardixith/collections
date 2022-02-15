package com.practiceAllModules.practiceallmodules.RestEnds;

import com.practiceAllModules.practiceallmodules.entity.Complaint;
import com.practiceAllModules.practiceallmodules.entity.userRepo.ComplaintRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompliantRest
{
    @Autowired
    ComplaintRepo complaintRepo;


    @GetMapping("allComplaint")
    List<Complaint> getAllComplaints()
    {
       return complaintRepo.findAll();
    }
}
