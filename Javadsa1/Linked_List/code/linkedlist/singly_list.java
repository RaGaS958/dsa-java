package linkedlist;

import org.w3c.dom.Node;

public class singly_list {

    private Node head;
    private Node tail;
    private int size;

    public singly_list()
    {
        this.size=0;
    }
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail =head;
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
        tail=node;
        size+=1;
    }
    public void insert(int val ,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        else if(index==size)
        {
            insertLast(val);
            return;
        }
        else {

             Node temp = head;
             for(int i=1;i<index;i++)
             {
                 temp=temp.next;
             }
            Node node =new Node(val,temp.next);
             temp.next=node;

        }

    }
    public void display()
    {
        Node temp =head;
        if(head==null)
        {
            System.out.println("EMPTY LINKED LIST");
            return;
        }
        System.out.print("HEAD->");
        while (temp!=null)
        {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("TAIL");
    }
   public int deleteFirst()
   {
       if(size==0)
       {
           return -1;
       }
       else if(head.next==null)
       {
           size--;
           int value=head.val;
           head=null;
           return value;
       }
       else
       {
           int value=head.val;
           head=head.next;
           size--;
           return value;
       }
   }
   public int deleteLast()
   {
       if(size<=1)
       {
           return deleteFirst();
       }
       else
       {
           Node temp=head;
           for(int i=1;i<size-1;i++)
           {
               temp=temp.next;
           }
           int value=temp.next.val;
           tail=temp;
           tail.next=null;
           size--;
           return value;
       }
   }

   public int   delete(int index)
   {
       if(index==0)
       {
           return deleteFirst();
       }
       else if (index==size)
       {
           return deleteLast();
       }
      else
       {
           Node temp=head;
           for(int i=1;i<index;i++)
           {
               temp=temp.next;
           }
           int value=temp.next.val;
           temp.next=temp.next.next;
           size--;
           return value;
       }

   }
   public void cycleCreation(int pos)
   {
       if(head==null || head.next==null)
       {
           return;
       }
       Node temp=head;
       for(int i=1;i<pos;i++)
       {
           temp=temp.next;
       }
       tail.next=temp;
   }
public int getsize()
{
    return size+1;
}
public Node get(int index)
{
    Node node = head;
    for (int i = 0; i < index; i++) {
        node = node.next;
    }
    return node;

}
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // question:-cyclic_detection
    public void cyclic_detection()
    {

        // cycle created

        Node slow=head;
        Node fast=head;

       do {
           slow=slow.next;
           fast=fast.next.next;
       }
        while( fast!=null && slow!=fast);

            if(fast!=null)
            {
                System.out.println("Cycle found");
            }
        else
            {
                System.out.println("Cycle not found");
            }

    }

// question length of cycle

    public int cycleLength()
    {

        if(head==null || head.next==null)
        {
            return 0;
        }
        Node slow=head;
        Node fast=head;

        do {
            slow=slow.next;
            fast=fast.next.next;
        }
        while( fast!=null && slow!=fast);
        int length =0;
        do {
            slow=slow.next;
            length++;
        }
        while( slow!=fast);
        return length;
    }

    public void reverseList()
    {
        Node temp=head;
       temp= reversal(temp);
    }
    private Node reversal(Node temp)
    {
        if(temp.next==null)
        {
            head=temp;
            return temp;

        }
        Node nex=reversal(temp.next);
        nex.next=temp;
        temp.next=null;
        tail=temp;
        return temp;
    }
    public void reverseList_iteration()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node prev=head;
        Node pres=head.next;
        Node next;
        while(pres!=null)
        {
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
        }
        tail=head;
        tail.next=null;
        head=prev;
    }
     public void rev_mid()
     {
         if(head == null || head.next==null)
         {
             return;
         }
         Node temp=head;
         for(int i=1;i< this.size/2;++i)
         {
             temp=temp.next;
         }
         if(this.size%2!=0) {
             temp=temp.next;
         }
         Node mid = temp;
         Node prev=temp.next;
         Node pres=temp.next.next;
         Node next;
         while(pres!=null)
         {
             next=pres.next;
             pres.next=prev;
             prev=pres;
             pres=next;
         }
         tail=mid.next;
         tail.next=null;
         mid.next=prev;

     }

    public void rev_pos(int pos)
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node temp=head;
        for(int i=1;i< pos;++i)
        {
            temp=temp.next;
        }
        Node mid = temp;
        Node prev=temp.next;
        Node pres=temp.next.next;
        Node next;
        while(pres!=null)
        {
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
        }
        tail=mid.next;
        tail.next=null;
        mid.next=prev;

    }
    public void checkPallindrome()
    {
        if(head==null  || head.next==null )
        {
            System.out.println("Pallindrome");
            return;
        }
        Node start=head;
        Node end=head;
        this.rev_mid();
        for(int i=0;i<this.size/2;i++)
        {
            end=end.next;
        }
        if(this.size %2!=0)
        {
            end=end.next;
        }
        this.display();
        while(start!=null && end!=null && start.val==end.val)
        {
            start=start.next;
            end=end.next;
        }
        if(end==null)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
        this.rev_mid();

    }

    public void bubble_sort()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        for(int i=0;i<this.size;i++)
        {
            Node prev=head;
            Node pres=head;
            Node next=head.next;
            for(int j=this.size-i;j>0;j++) {
                if(pres== head && pres.val > next.val)
                {
                    pres.next = next.next;
                    next.next = pres;
                    next = pres.next;
                }
                if (next != null && pres.val > next.val) {
                    pres.next = next.next;
                    prev.next = next;
                    next.next = pres;
                    prev = prev.next;
                    next = pres.next;
                }
            }
        }

    }

    private class Node
    {
        private int val;
        private Node next;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }

}
