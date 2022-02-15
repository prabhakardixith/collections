package com.practiceAllModules.practiceallmodules.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address_interview")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;
    private String fullAdress;
    private String city;

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @OneToOne(mappedBy = "address",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;

    public Integer getAid() {
        return aid;
    }

    public String getFullAdress() {
        return fullAdress;
    }

    public String getCity() {
        return city;
    }

    @JsonBackReference
    public User getUser() {
        return user;
    }
}
