package DataStructures.Types;

public class BasicQueue<X> {
    private X[] data;
    private int queueFirstItem = 0;
    private int queueLastItem = 0;
    
    public BasicQueue(){
        this(1000);
    }
    public BasicQueue(int size){
        data = (X[]) new Object[size];
    }

    public void enqueue(X itemToAdd){

        if (data.length<queueLastItem+1){
            throw new Error("queue is full");
        }
        else {data[queueLastItem++] = itemToAdd;}


    }
    public X dequeue(){
        X item = null;
        if (size()==0){
            throw new Error("No item  in queue");
        }
        else {
        item = data[queueFirstItem++];
        data[queueFirstItem-1] = null;}

        if (size()==0){
            System.out.println("resetted the queue");
            queueFirstItem=0;
            queueLastItem=0;
        }
        return item;
    }

    public boolean contains(X item){
        boolean found = false;
        if (size()==0){
            return false;
        }
        for (int i = queueFirstItem; i < queueLastItem;i++){
            System.out.println("data i "+ data[i] + " item: "+ item);
            if (data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }
    public X access(int position){
       if (position>size()){
       throw new Error("List is smaller than the requested position");
       }
       else {
           System.out.println("the value in the position "+position+" is: "+data[position+queueFirstItem]);
           return data[position+queueFirstItem];
       }
    }
    public int size(){

        return queueLastItem-queueFirstItem;
    }
}
// 1 2 3 4 5