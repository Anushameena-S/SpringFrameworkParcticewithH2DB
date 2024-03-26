/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Anusha
 */
@Entity
public class Custlist implements Serializable {
    @Id
    
    private int custid;
    private String custname;
    private String custemail;
    
    public Custlist(){}
    
    public Custlist(int custid,String custname,String custemail){
        this.custid = custid;
        this.custname = custname;
        this.custemail = custemail;
    }


    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }
    
    @Override
    public String toString() {
        return "Customers{" + "custid=" + custid + ", custname=" + custname + ", custemail=" + custemail + '}';
    }
    
    
}
