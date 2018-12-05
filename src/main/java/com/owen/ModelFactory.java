package com.owen;

import com.owen.common.Employee;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory
{
    public static Employee getEmploye(){
        Employee employee = new Employee();
        employee.setFirstName("Owen");
        employee.setLastName("Lee");
        employee.setAge(25);
        employee.setDeptID("ENG189914");
        employee.setEmpID(1010718212L);
        employee.setMale(true);
        employee.setDescription("Owen works in Citi as a developer");
        return employee;
    }

    public static List<Employee> getEmployees(){
        List<Employee> emps = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setFirstName("Jenney");
        emp1.setLastName("Lee");
        emp1.setAge(25);
        emp1.setDeptID("FIN185214");
        emp1.setEmpID(1010718213L);
        emp1.setMale(false);
        emp1.setDescription("Jenney is working really hard for her new job");

        Employee emp2 = new Employee();
        emp2.setFirstName("Vincent");
        emp2.setLastName("Liu");
        emp2.setAge(25);
        emp2.setDeptID("EQU195217");
        emp2.setEmpID(1010718214L);
        emp2.setMale(true);
        emp2.setDescription("Vincent is about to get married");

        Employee emp3 = new Employee();
        emp3.setFirstName("Ricy");
        emp3.setLastName("Dai");
        emp3.setAge(23);
        emp3.setDeptID("FIN185214");
        emp3.setEmpID(1010718214L);
        emp3.setMale(true);
        emp3.setDescription("Ricy meets a girlfriend");

        Employee emp4 = new Employee();
        emp4.setFirstName("Summar");
        emp4.setLastName("Xia");
        emp4.setAge(24);
        emp4.setDeptID("FIN197614");
        emp4.setEmpID(1010718216L);
        emp4.setMale(false);
        emp4.setDescription("Summar got a new job in Alibaba");

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        emps.add(emp4);
        emps.add(getEmploye());
        return emps;
    }
}
