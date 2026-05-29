import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;


    public QueueUsingStack()
    {
        this.stack1=new Stack();
        this.stack2=new Stack();
    }

    public void push(int i)
    {
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        stack1.push(i);
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
    }

    public void pop()
    {
        System.out.println(stack2.pop());
    }
    public void peek()
    {
        System.out.println(stack2.peek());
    }

}
