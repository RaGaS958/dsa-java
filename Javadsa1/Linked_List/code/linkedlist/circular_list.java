package linkedlist;

public class circular_list {
    private Node head;
    private Node tail;
    private int size;
    public circular_list()
    {
        this.size=0;
    }
    public void insert(int val)
    {

        Node node=new Node(val);
        size+=1;
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;

    }
    public  void display()
    {
        if(head==null)
        {
            System.out.println("Nothing to print");
            return;
        }
        Node temp=head;
        System.out.print("HEAD -->");
        do {
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println("TAIL");

    }
    public void delete(int value)
    {
        if(head==null)
        {
            System.out.println("Empty List");
        }
        else if (size==1)
        {
            if(head.val==value)
            {
                head=null;
                tail=null;
                size-=1;

            }
        }
        else if(head.val==value)
        {
            tail.next=head.next;
            head=tail.next;
            size-=1;

        }
        else if(tail.val==value)
        {
            Node temp=head;
            while(temp.next!=tail)
            {
                temp=temp.next;
            }
            temp.next=tail.next;
            tail=temp;
            size-=1;


        }
        else
        {
            Node temp=head;
            while(temp.next!=tail)
            {
                if(temp.next.val==value)
                {
                  temp.next=temp.next.next;
                  size-=1;
                  return;
                }
                temp=temp.next;
            }
        }
    }
    private class Node
    {
        private int val;
        private Node next;
        private Node(int val)
        {
            this.val=val;
        }
        private Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
}
