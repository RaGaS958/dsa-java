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
    } public void insertFirstnotail(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
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
    public void insertLast_notail(int val)
    {
        if(head==null)
        {
            insertFirstnotail(val);
            return;
        }
        Node node=new Node(val);
       Node temp=head;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp.next=node;
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
    }public void displays()
    {
        Node temp =head;
        if(head==null)
        {
            System.out.println("EMPTY LINKED LIST");
            return;
        }
        System.out.print("HEAD");
        while (temp!=null)
        {
            System.out.print("->");
            System.out.print(temp.val);
            temp=temp.next;
        }
        System.out.println();
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
   }public void cycleCreation_notail(int pos)
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
       Node end=head;
       while(end.next!=null)
       {
           end=end.next;
       }
       end.next=temp;
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
    }public void reverseList_iteration_notail()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node prev=head;
        Node pres=head.next;
        Node next;
        prev.next=null;
        while(pres!=null)
        {
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
        }
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

    public void bubble_sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;

            for (int i = 0; i < this.size; i++) {
                swapped = false;
                Node prev = null;
                Node pres = head;
                for (int j = 0; j < this.size - i - 1; j++) {
                    if (pres.next!=null && pres.val > pres.next.val) {
                        Node next=pres.next;
                        pres.next=next.next;
                        next.next=pres;
                        if(prev==null)
                        {
                            head=next;
                        }
                        else
                        {
                            prev.next=next;
                        }
                        prev=next;
                        swapped=true;
                    }
                    else
                    {
                        prev=pres;
                        pres=pres.next;
                    }
                }
                if(!swapped)
                {
                    break;
                }
            }


    }
public void rem_dup()
{
    if(head==null || head.next==null)
    {
        return;
    }
    Node temp=head;
    while(temp.next!=null)
    {
        if(temp.next.val==temp.val)
        {
            temp.next=temp.next.next;
        }
        else {
            temp = temp.next;
        }
    }

}

public singly_list merge(singly_list list2)
{
    Node temp1=this.head;
    Node temp2=list2.head;
    singly_list list_merge=new singly_list();
    while(temp1 !=null && temp2 !=null)
    {
        if(temp1.val<=temp2.val)
        {

                list_merge.insertLast_notail(temp1.val);
                temp1=temp1.next;
        }
        else
        {
            list_merge.insertLast_notail(temp2.val);
            temp2=temp2.next;
        }
    }
    while(temp1!=null)
    {
        list_merge.insertLast_notail(temp1.val);
        temp1=temp1.next;
    } while(temp2!=null)
    {
        list_merge.insertLast_notail(temp2.val);
        temp2=temp2.next;
    }
    return list_merge;
}
public int findCircleStart()
    {
        int start=1;
        Node slow=head;
        Node fast=head;

        do {
            slow=slow.next;
            fast=fast.next.next;
        }
        while( fast!=null && slow!=fast);
        Node temp=head;
        while(temp.next!=slow)
        {
            temp=temp.next;
            start++;
        }
        for(int i=0;i<size-start+1;i++)
        {
            fast=fast.next;
        }
        temp=head;
        start=1;
        while(temp.next!=fast)
        {
            temp=temp.next;
            start++;
        }
        return start;
    }
    public boolean found(int sum)
    {
        if(head==null || head.next==null)
        {
            return false;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.val==sum)
            {
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void magicBuild(int sum)
    {
        if(head==null || head.next==null)
        {
            return ;
        }
        this.reverseList_iteration_notail();
        Node temp=head;
        int pos=1;
        while(temp.val!=sum)
        {
            temp=temp.next;
            pos++;
        }
        this.cycleCreation_notail(pos);

    }

    public int mid()
    {
        if(head==null )
        {
            return -1;
        }
        else if(head.next==null)
        {
            return head.val;
        }
        else
        {
            Node sing=head;
            Node dou=head;
            while(dou!=null && dou.next!=null)
            {

                    dou = dou.next.next;

                sing=sing.next;
            }
            return sing.val;
        }
    }

    public void reverse_range(int l,int r)
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node L=head;
        Node R=head;
        Node start=head;
        Node End=null;

        for(int i=1;i<l;i++)
        {
            start=L;
            L=L.next;
        }
        for(int i=1;i<r;i++)
        {

            R=R.next;
        }
        if(R.next!=null)
        {
            End = R.next;
        }
        R.next=null;
        Node pres=L.next;
        Node prev=L;
       while(pres!=null)
       {
           Node next=pres.next;
           pres.next=prev;
           prev=pres;
           pres=next;
       }
       if(l!=1) {
           start.next = R;
           L.next = End;
       }
       else
       {
           L.next = End;
           this.head=R;
       }

    }

public void reorder()
{
    if(head==null || head.next==null)
    {
        return ;
    }
    Node temp=head;
    while(temp!=null)
    {
        Node start=temp;
        while(start.next.next!=null)
        {
            start=start.next;
        }
        Node tar=start.next;
        start.next=null;
        tar.next=temp.next;
        temp.next=tar;
        temp=tar.next;
    }
}

public void kNodesReverse(int n)
{
    if(head==null || head.next==null)
    {
        return;
    }
    Node prev=null;
    Node pres=head;
    Node last=prev;
    Node newLast=pres;
    while(pres!=null )
   {
       for (int i = 0;pres !=null && i < n; i++)
       {
           Node next = pres.next;
           pres.next = prev;
           prev = pres;
           pres = next;
           if (next != null) {
               next = next.next;
           }


       }
       if (last != null) {
           last.next = prev;
       } else {
           head = prev;
       }
       newLast.next=pres;
       last=newLast;
       newLast=pres;

   }

}public void kNodesAlternateReverse(int n)
{
    if(head==null || head.next==null)
    {
        return;
    }
    Node prev=null;
    Node pres=head;
    Node last=prev;
    Node newLast=pres;
    while(pres!=null )
   {
       for (int i = 0;pres !=null && i < n; i++)
       {
           Node next = pres.next;
           pres.next = prev;
           prev = pres;
           pres = next;
           if (next != null) {
               next = next.next;
           }


       }
       if (last != null) {
           last.next = prev;
       } else {
           head = prev;
       }
          newLast.next=pres;
          for(int i=0;pres!=null && i<n;i++) {
              prev = pres;
              pres=pres.next;
          }
          last=prev;
          newLast=pres;

   }

}
    public void rotateLeft(int n)
    {
      if(n==this.size || head==null )
      {
          return;
      }

      for(int i=0;i<n;i++)
      {
          Node pres=head;
          Node prev=null;
          Node start=head;
          while(pres.next!=null)
          {
              prev=pres;
              pres=pres.next;
          }
          prev.next=null;
          pres.next=start;
          head=pres;

      }
    }
public void rotateRight(int n)
    {
      if(n==this.size || head==null || head.next ==null)
      {
          return;
      }

      for(int i=0;i<n;i++)
      {
          Node pres=head;
          Node start=head;
          Node newStart=head.next;
          while(pres.next!=null)
          {
              pres=pres.next;
          }
          start.next=null;
          pres.next=start;
          head=newStart;

      }
    }

    public int listBinary()
    {
        if(head == null)
        {
            return -1;
        }
        int val=0;
        this.reverseList_iteration_notail();
        Node temp=head;
        for(int i=0;temp!=null;i++)
        {
            val+=((int)(Math.pow(2,i)))*temp.val;
            temp=temp.next;
        }

        return val;
    }
     public void uniqueList(singly_list list2, singly_list list3)
     {
         Node tempA=this.head;
         Node tempB=list2.head;
         while(tempA.next!=null)
         {
             tempA=tempA.next;
         }
         while(tempB.next!=null)
         {
             tempB=tempB.next;
         }
         tempA.next=list3.head;
         tempB.next=list3.head;
     }

     public int intersectionFound(singly_list list2)
     {
         Node tempA=this.head;
         Node tempB=list2.head;
         while(tempA!=null)
         {
             while(tempB!=null)
             {
                 if(tempB == tempA)
                 {
                     return tempB.val;
                 }
                 tempB=tempB.next;
             }
             tempB=list2.head;
             tempA=tempA.next;
         }


         return -1;
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
