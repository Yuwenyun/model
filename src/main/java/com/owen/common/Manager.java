package com.owen.common;

import java.util.List;

public class Manager extends Employee
{
    private List<Employee> emps;

    public List<Employee> getEmps()
    {
        return emps;
    }

    public void setEmps(List<Employee> emps)
    {
        this.emps = emps;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("emps=").append(emps);
        sb.append('}');
        return sb.toString();
    }
}
