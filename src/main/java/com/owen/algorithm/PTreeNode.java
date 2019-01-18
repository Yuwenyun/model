package com.owen.algorithm;

/**
 * TreeNode with parent pointer
 */
public class PTreeNode<T> extends TreeNode<T>
{
    private TreeNode<T> parent;

    public PTreeNode(T value)
    {
        super(value);
    }

    public TreeNode<T> getParent()
    {
        return parent;
    }

    public void setParent(TreeNode<T> parent)
    {
        this.parent = parent;
    }
}
