package com.darren.pbm.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {

    @Id
    @Column(name = "cust_no")
    private String custNo;
    @Column(name = "email")
    private String email;

    public CustomerDetails() {}

    public CustomerDetails(String CUSTNO, String EMAIL) {
        this.custNo = CUSTNO;
        this.email = EMAIL;
    }

    public String getCustNo() {
        return custNo;
    }

    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
