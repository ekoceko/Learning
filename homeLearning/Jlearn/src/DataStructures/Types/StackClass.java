package DataStructures.Types;

public class StackClass<X> implements StackInterface<X> {
    private X[] data;
    private int stackPointer;
    public  StackClass(){
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    @Override
    public void push(X item) {
        data[stackPointer++] = item;
    }

    @Override
    public Object pop() {
        if (stackPointer==0){
            throw new IllegalStateException("No items in stack");
        }
        return data[--stackPointer];
    }

    @Override
    public boolean contains(X item) {
        boolean found = false;
        for (int i = 0; i < data.length  ;i++ ){
            if (data[i].equals(item)){
                found=true;
                break;
            }
        }
        return found;
    }

    @Override
    public Object access(X item) {
        while (stackPointer >0){
            if (item.equals(pop())){
                return item;
            }
        }
        throw new IllegalStateException("Stack does not contain item "+ item);
    }
    @Override
    public int size(){
        return stackPointer;
    }
}
