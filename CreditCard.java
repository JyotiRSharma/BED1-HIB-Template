package com.bed1.dao;

import org.springframework.stereotype.Controller;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
public class CreditCard {


//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Id
    private String panNo;
    private double CreditScore;

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public double getCreditScore() {
        return CreditScore;
    }

    public void setCreditScore(double creditScore) {
        CreditScore = creditScore;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "panNo='" + panNo + '\'' +
                ", CreditScore=" + CreditScore +
                '}';
    }
}
