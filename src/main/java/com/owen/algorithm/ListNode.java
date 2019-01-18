package com.owen.algorithm;

public class ListNode<T>
{
    private T value;
    private ListNode<T> next;

    public ListNode(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public ListNode<T> getNext()
    {
        return next;
    }

    public void setNext(ListNode<T> next)
    {
        this.next = next;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode<?> listNode = (ListNode<?>) o;

        return value.equals(listNode.value);
    }

    @Override
    public int hashCode()
    {
        return value.hashCode();
    }
}
