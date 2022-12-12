package com.nest.nest_leave_management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leavecount")
public class LeaveCount {

    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String year;
    private int casualleave;
    private int sickleave;
    private int specialleave;

    public LeaveCount() {
    }

    public LeaveCount(int id, int empid, String year, int casualleave, int sickleave, int specialleave) {
        this.id = id;
        this.empid = empid;
        this.year = year;
        this.casualleave = casualleave;
        this.sickleave = sickleave;
        this.specialleave = specialleave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getCasualleave() {
        return casualleave;
    }

    public void setCasualleave(int casualleave) {
        this.casualleave = casualleave;
    }

    public int getSickleave() {
        return sickleave;
    }

    public void setSickleave(int sickleave) {
        this.sickleave = sickleave;
    }

    public int getSpecialleave() {
        return specialleave;
    }

    public void setSpecialleave(int specialleave) {
        this.specialleave = specialleave;
    }
}
