package linkedlist;

public class doubly_list {
private Node head;
private Node tail;
private int size;
public doubly_list()
{
    this.size=0;
}
public void insertFirst(int val)
{
    Node node=new Node(val);
    node.next=head;
    if(head!=null)
    {
        head.prev=node;
    }
    head=node;
    if(tail==null)
    {
        tail=head;
    }
    size+=1;

}
public void insertLast(int val)
{
    if(tail==null)
    {
        insertFirst(val);
        return;
    }
    Node node=new Node(val);
    tail.next=node;
    node.prev=tail;
    tail=node;
    size+=1;
}
public void insert(int val,int index)
{
    if(index==0)
    {
        insertFirst(val);
    }
    else if(index==size-1)
    {
        insertLast(val);
    }
    else
    {
        Node node=new Node(val);
        Node temp;
        temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        node.prev=temp;
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
    }

    }
    public void display()
    {
        if(size+1==0)
        {
            System.out.println("Nothing to print");
        }
        else
        {
            Node temp;
            temp=head;
            System.out.print("Head -->"+temp.val);
            temp=temp.next;
            while(temp!=null)
            {
                System.out.print("<==>");
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println("<-- Tail");
        }

}
    public void deleteFirst()
    {
     if(size==0)
     {
         System.out.println("Nothing to delete");
     }
     head=head.next;
     head.prev=null;
        size-=1;
    }
    public void deleteLast()
    {
        if(size==0)
        {
            deleteFirst();
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size-=1;

    }
    public void delete(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        else if(index==size)
        {
            deleteLast();
            return;
        }
        else
        {
            Node temp;
            temp=head;
            for(int i=1;i<index+1;i++)
            {
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            size-=1;
        }
    }
    public int getSize()
    {
        return size+1;

    }
    public void headValue()
    {
        System.out.println(head.val);
    }
    public Node get(int index)
    {
        if(index==0) {
            return head;
        }
        else if (index==size)
        {
            return tail;
        }
        else
        {
            Node temp=head;
            for(int i=1;i<index+1;i++)
            {
                temp=temp.next;
            }
            return temp;
        }
    }
    public void reverseDisplay()
    {
        if(size+1<=1)
        {
            display();
            return;
        }
        else
        {
            Node temp;
            temp=tail;
            System.out.print("Tail -->"+temp.val);
            temp=temp.prev;
            while(temp!=null)
            {
                System.out.print("<==>");
                System.out.print(temp.val);
                temp=temp.prev;
            }
            System.out.println("<-- Head");
        }

    }






















private class Node
{
    int val;
    Node next;
    Node prev;
    public Node(int val)
    {
        this.val=val;

    }
    public Node(int val,Node next,Node prev)
    {
        this.val=val;
        this.next=next;
        this.prev=prev;
    }
}


}

