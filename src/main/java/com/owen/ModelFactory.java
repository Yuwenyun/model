package com.owen;

import com.owen.algorithm.ListNode;
import com.owen.algorithm.PTreeNode;
import com.owen.algorithm.TreeNode;
import com.owen.common.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelFactory
{
    public static final String MAP_KEY_1 = "key_1";
    public static final String MAP_KEY_2 = "key_2";
    public static final String MAP_KEY_3 = "key_3";
    public static final String MAP_KEY_4 = "key_4";
    public static final String MAP_KEY_5 = "key_5";

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

    public static PTreeNode<Integer> getPTree()
    {
        PTreeNode<Integer> root = new PTreeNode<>(3);
        PTreeNode<Integer> node1 = new PTreeNode<>(1);
        PTreeNode<Integer> node2 = new PTreeNode<>(9);
        PTreeNode<Integer> node3 = new PTreeNode<>(6);
        PTreeNode<Integer> node4 = new PTreeNode<>(8);
        PTreeNode<Integer> node5 = new PTreeNode<>(2);
        PTreeNode<Integer> node6 = new PTreeNode<>(5);
        PTreeNode<Integer> node7 = new PTreeNode<>(4);
        PTreeNode<Integer> node8 = new PTreeNode<>(0);
        PTreeNode<Integer> node9 = new PTreeNode<>(7);
        root.setLeft(node1); root.setRight(node2);
        node1.setLeft(node3); node1.setRight(node4); node1.setParent(root);
        node2.setLeft(node5); node2.setRight(node6); node2.setParent(root);
        node3.setLeft(node7); node3.setParent(node1);
        node4.setLeft(node8); node4.setRight(node9); node4.setParent(node1);
        node5.setParent(node2);
        node6.setParent(node2);
        node7.setParent(node3);
        node8.setParent(node4);
        node9.setParent(node4);
        return root;
    }

    public static Map<String, String> getStringKeyedMap()
    {
        Map<String, String> demoMap = new HashMap<>();
        demoMap.put(MAP_KEY_1, MAP_KEY_1);
        demoMap.put(MAP_KEY_2, MAP_KEY_2);
        demoMap.put(MAP_KEY_3, MAP_KEY_3);
        demoMap.put(MAP_KEY_4, MAP_KEY_4);
        demoMap.put(MAP_KEY_5, MAP_KEY_5);
        return demoMap;
    }
}
