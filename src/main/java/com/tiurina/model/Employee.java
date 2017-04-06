package com.tiurina.model;

/**
 * Created by Vero on 05.04.2017.
 */
public class Employee {
    protected int empId;
    protected String firstName;
    protected String lastName;
    protected double salary;

    public void setEmpId(int empId){ this.empId=empId; }

    public int getEmpId(){ return this.empId; }

    public void setFirstName(String firstName){ this.firstName=firstName; }

    public String getFirstName(){  return this.firstName;  }

    public void setLastName(String lastName){ this.lastName=lastName;}

    public String getLastName(){ return this.lastName; }

    public void setSalary(double salary){ this.salary=salary; }

    public double getSalary(){return this.salary; }

}
