package DataStructures.Types;

public interface StackInterface<X> {
    public void push(X item);
    public Object pop();
    public boolean contains(X item);
    public Object access(X item);
    public int size();

}
