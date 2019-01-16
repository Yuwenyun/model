package com.owen.common;

import java.io.Serializable;

public class Employee implements Serializable, Cloneable
{
    private static final long serialVersionID = 6849794470754667710L;

    private String firstName;
    private String lastName;
    private boolean male;
    private int age;
    private long empID;
    private String deptID;
    private transient String description;

    public Employee(){}
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public boolean isMale()
    {
        return male;
    }

    public void setMale(boolean male)
    {
        this.male = male;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public long getEmpID()
    {
        return empID;
    }

    public void setEmpID(long empID)
    {
        this.empID = empID;
    }

    public String getDeptID()
    {
        return deptID;
    }

    public void setDeptID(String deptID)
    {
        this.deptID = deptID;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o){ return true; }
        if (o == null || getClass() != o.getClass()){ return false; }

        Employee employee = (Employee) o;

        return empID == employee.empID;
    }

    @Override
    public int hashCode()
    {
        return (int) (empID ^ (empID >>> 32));
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", male=").append(male);
        sb.append(", age=").append(age);
        sb.append(", empID=").append(empID);
        sb.append(", deptID='").append(deptID).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
