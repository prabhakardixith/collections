package com.practiceAllModules.practiceallmodules.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_Interview")
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",referencedColumnName = "uid")
    private List<Order> order;

    @OneToOne( fetch = FetchType.EAGER,cascade = CascadeType.ALL
    ,optional = false)
            @JoinColumn(name = "addressid",referencedColumnName = "aid")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private List<Techinician> techinician;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER
    )
    private List<Complaint> complaint;
    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    @JsonManagedReference
    public Address getAddress() {
        return address;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }
    public void setTechinician(List<Techinician> techinician) {
        this.techinician = techinician;
    }

    public void setComplaint(List<Complaint> complaint) {
        this.complaint = complaint;
    }
    @JsonManagedReference
    public List<Order> getOrder() {
        return order;
    }

    @JsonManagedReference
    public List<Techinician> getTechinician() {
        return techinician;
    }

    @JsonBackReference
    public List<Complaint> getComplaint() {
        return complaint;
    }
}
