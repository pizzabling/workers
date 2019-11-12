package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity


public class Worker extends Type{



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int workerId;
    private double rent;
    private double janRent;
    private double febRent;
    private double marRent;
    private double aprRent;
    private double mayRent;
    private double juneRent;
    private double julyRent;
    private double augRent;
    private double sepRent;
    private double octRent;
    private double novRent;
    private double decRent;



    public Worker() {
        super();
    }




    public Worker(int id,int workerId, double rent, double janRent, double febRent, double marRent, double aprRent, double mayRent, double juneRent, double julyRent, double augRent, double sepRent, double octRent, double novRent, double decRent) {
        id = id;
        this.workerId = workerId;
        this.rent = rent;
        this.janRent = janRent;
        this.febRent = febRent;
        this.marRent = marRent;
        this.aprRent = aprRent;
        this.mayRent = mayRent;
        this.juneRent = juneRent;
        this.julyRent = julyRent;
        this.augRent = augRent;
        this.sepRent = sepRent;
        this.octRent = octRent;
        this.novRent = novRent;
        this.decRent = decRent;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public double getJanRent() {
        return janRent;
    }

    public void setJanRent(double janRent) {
        this.janRent = janRent;
    }

    public double getFebRent() {
        return febRent;
    }

    public void setFebRent(double febRent) {
        this.febRent = febRent;
    }

    public double getMarRent() {
        return marRent;
    }

    public void setMarRent(double marRent) {
        this.marRent = marRent;
    }

    public double getAprRent() {
        return aprRent;
    }

    public void setAprRent(double aprRent) {
        this.aprRent = aprRent;
    }

    public double getMayRent() {
        return mayRent;
    }

    public void setMayRent(double mayRent) {
        this.mayRent = mayRent;
    }

    public double getJuneRent() {
        return juneRent;
    }

    public void setJuneRent(double juneRent) {
        this.juneRent = juneRent;
    }

    public double getJulyRent() {
        return julyRent;
    }

    public void setJulyRent(double julyRent) {
        this.julyRent = julyRent;
    }

    public double getAugRent() {
        return augRent;
    }

    public void setAugRent(double augRent) {
        this.augRent = augRent;
    }

    public double getSepRent() {
        return sepRent;
    }

    public void setSepRent(double sepRent) {
        this.sepRent = sepRent;
    }

    public double getOctRent() {
        return octRent;
    }

    public void setOctRent(double octRent) {
        this.octRent = octRent;
    }

    public double getNovRent() {
        return novRent;
    }

    public void setNovRent(double novRent) {
        this.novRent = novRent;
    }

    public double getDecRent() {
        return decRent;
    }

    public void setDecRent(double decRent) {
        this.decRent = decRent;
    }



}