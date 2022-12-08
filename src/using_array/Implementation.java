package using_array;

public class Implementation {
    int size;
    int [] array;
    int top;

    public void push(int element){
        if(!isFull()){
            top++;
            array[top] = element;
            System.out.println("Element inserted : " + array[top]);
        }

        else {
            System.out.println("Array is full...");
        }
    }

    public void pop(){
        if(!isEmpty()){
            int pickedElement = array[top];
            System.out.println("The popped element is "  + array[top]);
            top--;
        }

        else{
            System.out.println("The array is Empty....");
        }
    }

    public Implementation(int size) {
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public int peek(){
        if(!isEmpty())
            return array[top];
        else{
            System.out.println("Empty Array not have any peek...");
            return -1;
        }
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (top == size-1);
    }

    public static void main(String[] args) {
        Implementation impl = new Implementation(2);
        impl.push(69);
        System.out.println(impl.isEmpty());
        impl.pop();
        System.out.println(impl.isEmpty());
    }
}
