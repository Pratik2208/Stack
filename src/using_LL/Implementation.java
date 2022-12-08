package using_LL;
public class Implementation {
    Node top;

    public void push(int x)
    {
        Node temp = new Node();

        if (top == null) {
            System.out.println("Heap overflow...");
        }

        temp.data = x;
        temp.previous = top;
        top = temp;
    }

    public void pop()
    {
        if (top == null){
            System.out.println("Stack Underflow...");
        }

        else{
            System.out.println("Removed element is :" + top.data);
            top = (top).previous;
        }
    }

    public void display(){
        Node temp = top;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.previous;
        }
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation();
        impl.push(9);
        impl.push(10);
        impl.push(11);
        impl.pop();
        impl.pop();
        impl.pop();
        impl.display();

    }

}

