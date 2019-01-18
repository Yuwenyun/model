package com.owen;

import com.owen.algorithm.ListNode;
import com.owen.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class NodeUtil
{
    private final static String space = " ";
    private final static String forwardSlash = "/";
    private final static String backwardSlash = "\\";

    public static <T> TreeNode getTreeNode(TreeNode<T> root, T value)
    {
        if(root == null || value == null){
            return null;
        }
        if(value.equals(root.getValue())){
            return root;
        }
        TreeNode<T> result = getTreeNode(root.getLeft(), value);
        return result != null ? result : getTreeNode(root.getRight(), value);
    }

    public static <T> TreeNode getLeftMostChild(TreeNode<T> root)
    {
        if(root == null){
            return null;
        }
        if(root.getLeft() == null){
            return root;
        }
        return getLeftMostChild(root.getLeft());
    }

    public static <T> void printList(ListNode<T> root)
    {
        System.out.print(root.getValue() + space);
        if(root.getNext() == null) {
            return;
        }
        else{
            printList(root.getNext());
        }
    }

    public static <T> void printTree(TreeNode<T> root)
    {
        int maxLevel = maxLevel(root);
        printTree(Collections.singletonList(root), 1, maxLevel);
    }

    // print the tree line by line
    private static <T> void printTree(List<TreeNode<T>> nodes, int level, int maxLevel)
    {
        if(nodes.isEmpty() || nodes.stream().allMatch(Objects::isNull)){
            return;
        }

        int floor = maxLevel - level;
        int heightOfLinesBetweenLevel = (int)Math.pow(2, floor - 1);
        int headSpacesCountBeforeChar = (int)Math.pow(2, floor) - 1;
        int betweenSpacesCountBetweenChilds = (int)Math.pow(2, floor + 1) - 1;

        // print space of the line before print any char
        printSpace(headSpacesCountBeforeChar);

        // print the char and prepare it's child nodes
        List<TreeNode<T>> childNodes = new ArrayList<>();
        for(TreeNode<T> node : nodes){
            if(node != null){
                System.out.print(node.getValue());
                childNodes.add(node.getLeft());
                childNodes.add(node.getRight());
            }
            // add null to the list making it like a full tree
            else{
                childNodes.add(null);
                childNodes.add(null);
                System.out.print(space);
            }
            printSpace(betweenSpacesCountBetweenChilds);
        }
        System.out.println("");

        // print forward/backward slashes
        for(int i = 1; i <= heightOfLinesBetweenLevel; i++){
            for(int j = 0; j < nodes.size(); j++){
                printSpace(headSpacesCountBeforeChar - i);

                if(nodes.get(j) == null){
                    printSpace(2 * heightOfLinesBetweenLevel + i + 1);
                    continue;
                }

                if(nodes.get(j).getLeft() != null){
                    System.out.print(forwardSlash);
                }
                else{
                    printSpace(1);
                }

                printSpace(2 * i - 1);

                if(nodes.get(j).getRight() != null){
                    System.out.print(backwardSlash);
                }
                else{
                    printSpace(1);
                }

                printSpace(2 * heightOfLinesBetweenLevel - i);
            }
            System.out.println("");
        }

        printTree(childNodes, level + 1, maxLevel);
    }

    private static <T> int maxLevel(TreeNode<T> node)
    {
        if(node == null){
            return 0;
        }
        return Math.max(maxLevel(node.getLeft()), maxLevel(node.getRight())) + 1;
    }

    private static void printSpace(int count)
    {
        System.out.print(new String(new char[count]).replace("\0", space));
    }
}
