import java.util.Arrays;

public class DynamicCustomCircularQueue extends CustomCircularQueue{

    public DynamicCustomCircularQueue()
    {
        super();
    }
    public DynamicCustomCircularQueue(int size)
    {
        super(size);
    }

    @Override
    public void insert(int item)
    {
        if(isFull())
        {
            System.out.println("Queue size increased");
            int data_ex []=new int[size*2];
            int temp =first;
            int count=0;
             do
             {
                 data_ex[count]=data[temp];
                 count=count+1;
                 temp=(temp+1)%size;
             } while(temp!=end);
             data=data_ex;
             this.first=0;
             this.end=count;
             size=size*2;
        }
        data[end]=item;
        end=(end+1)%size;
        items++;
        System.out.println("Item "+item+ " Inserted ");
    }

}
