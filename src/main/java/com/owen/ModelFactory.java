package com.owen;

import com.owen.algorithm.ListNode;
import com.owen.algorithm.TreeNode;
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

    public static ListNode<Integer> getList(){
        ListNode<Integer> node1 = new ListNode<>(3);
        ListNode<Integer> node2 = new ListNode<>(1);
        ListNode<Integer> node3 = new ListNode<>(9);
        ListNode<Integer> node4 = new ListNode<>(6);
        ListNode<Integer> node5 = new ListNode<>(8);
        ListNode<Integer> node6 = new ListNode<>(2);
        ListNode<Integer> node7 = new ListNode<>(5);
        ListNode<Integer> node8 = new ListNode<>(4);
        ListNode<Integer> node9 = new ListNode<>(0);
        ListNode<Integer> node10 = new ListNode<>(7);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        node8.setNext(node9);
        node9.setNext(node10);
        return node1;
    }

    public static TreeNode<Integer> getTree()
    {
        TreeNode<Integer> root = new TreeNode<>(3);
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(9);
        TreeNode<Integer> node3 = new TreeNode<>(6);
        TreeNode<Integer> node4 = new TreeNode<>(8);
        TreeNode<Integer> node5 = new TreeNode<>(2);
        TreeNode<Integer> node6 = new TreeNode<>(5);
        TreeNode<Integer> node7 = new TreeNode<>(4);
        TreeNode<Integer> node8 = new TreeNode<>(0);
        TreeNode<Integer> node9 = new TreeNode<>(7);
        root.setLeft(node1); root.setRight(node2);
        node1.setLeft(node3); node1.setRight(node4);
        node2.setLeft(node5); node2.setRight(node6);
        node3.setLeft(node7);
        node4.setLeft(node8); node4.setRight(node9);
        return root;
    }

    public static TreeNode<Integer> getDuplicateTree()
    {
        TreeNode<Integer> root = new TreeNode<>(3);
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(9);
        TreeNode<Integer> node3 = new TreeNode<>(6);
        TreeNode<Integer> node4 = new TreeNode<>(8);
        TreeNode<Integer> node5 = new TreeNode<>(8);
        TreeNode<Integer> node6 = new TreeNode<>(2);
        TreeNode<Integer> node7 = new TreeNode<>(5);
        TreeNode<Integer> node8 = new TreeNode<>(4);
        TreeNode<Integer> node9 = new TreeNode<>(0);
        TreeNode<Integer> node10 = new TreeNode<>(7);
        root.setLeft(node1); root.setRight(node2);
        node1.setLeft(node3); node1.setRight(node4);
        node2.setLeft(node5); node2.setRight(node6);
        node3.setLeft(node7);
        node4.setLeft(node8); node4.setRight(node9);
        node5.setLeft(node10);

        return root;
    }
}
