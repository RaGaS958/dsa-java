import java.util.Arrays;

public class CustomCircularQueue {

    protected  int first;
    protected int end;
    protected int [] data;
    private static final int Default_size=10;
    protected int size;
    protected int items=0;


    public CustomCircularQueue()
    {
        this(Default_size);
    }
    public CustomCircularQueue(int size)
    {
        this.size=size;
        this.data=new int[size];
        this.first=0;
        this.end=0;
    }

    protected boolean isFull()
    {
        return items==size;
    }
    protected boolean isEmpty()
    {
        return items==0;
    }

    public void insert(int item)throws CustomQueueException
    {
      if(isFull())
      {
          throw new CustomQueueException("Queue is full!!!");
      }
      data[end]=item;
      end=(end+1)%size;
      items++;
        System.out.println("Item "+item+" Inserted" );
    }

    public void pop() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is Empty");
        }
        int val=data[first];
        first=(first+1)%size;
        items=items-1;
        System.out.println("POPED :-"+val);
    }
    public void display() throws CustomQueueException
    {
        if(isEmpty())
        {
            throw new CustomQueueException("Queue is Empty");
        }

        int temp = first;

        System.out.print("START -> ");

        do
        {
            System.out.print(data[temp] + " -> ");
            temp = (temp + 1) % size;

        } while(temp != end);

        System.out.println("END");
    }

}
