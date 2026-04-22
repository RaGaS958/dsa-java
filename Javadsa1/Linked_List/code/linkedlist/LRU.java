package linkedlist;

public class LRU {
     private Node  head;
     private int capacity;
     private int size;

     public  LRU(int capacity)
     {
         this.capacity=capacity;
         this.size=0;
     }
     public void put(int key,int value)
     {

         Node temp=head;
         while(temp!=null)
         {
             if(temp.key==key)
             {
                 temp.value=value;
                 return;
             }
             temp=temp.next;
         }
         Node node=new Node(value,key);

         if(size<capacity)
         {
             if(head==null)
             {
                 head=node;
             }
             else {
                 Node temp1 = head;
                 while (temp1.next != null) {
                     temp1 = temp1.next;
                 }
                 temp1.next = node;
             }
             size++;
             return;
         }
          else
          {
              head=head.next;
              Node temp1 = head;
              while (temp1.next != null) {
                  temp1 = temp1.next;
              }
              temp1.next = node;
          }

     }
     public int get(int key)
     {
         if(head==null)
         {
             return -1;
         }
         else
         {
             Node temp=head;
             while(temp!=null)
             {
                 if(temp.key==key)
                 {
                     return temp.value;
                 }
                 temp=temp.next;
             }
         }
         return -1;
     }
     public void displays()
     {
         if(head==null)
         {
             System.out.println("empty");
             return;
         }
         Node temp=head;
         System.out.println("HEAD ");
         while (temp!=null)
         {
             System.out.print("--> [[key="+temp.key+"][Value="+temp.value+"]] ");
             temp=temp.next;

         }
         System.out.println();
     }





     private class Node
     {
         private Node next;
         private int value;
         private int key;



         public  Node(int value,int key)
         {
             this.value=value;
             this.key=key;
         }
         public  Node(int value,Node next,int key)
         {
             this.value=value;
             this.next=next;
             this.key=key;

         }
     }
}
