package DataStructures.Types;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList(){
        first = null;
        last = null;
        nodeCount = 0;
    }
    public void add(X item){
        if (first==null){
        first = new Node(item);
        last = first;}
        else {
            Node newLastNode = new Node(item);
            last.setNextnode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }
    public X remove(){
        if (first ==null){
            throw new Error("List does not have any items");
        }
        X removedNode = first.getNodeItem();
        first = first.getNextnode();
        nodeCount--;
        return removedNode;
    }
    public void insert(X item, int position){
        Node nodeBeforePosition;
        Node nodeAfterPosition;
        if (position>size()+1) {
           throw new Error("position is bigger then the size");
       }
        Node newNode = new Node(item);
       if (position==1){
           newNode.setNextnode(first);
           first = newNode;

       } else if (position==size()+1){
           last.setNextnode(newNode);
           last = newNode;
           System.out.println("adding to last");
       }
       else {
           nodeBeforePosition = getNodeBeforePosition(position);
           nodeAfterPosition = nodeBeforePosition.getNextnode();

           nodeBeforePosition.setNextnode(newNode);
           newNode.setNextnode(nodeAfterPosition);

       }
        nodeCount++;
    }
    public void removeAt(int position){
        if (size()==0){
            throw new Error("list is empty");
        }
        Node nodeBeforePosition;
        Node nodeToRemove;
        Node nodeAfterRemove;
        if (position==1){
            first = first.getNextnode();

        }else if (position==size()){
            last = getNodeBeforePosition(position);
            last.setNextnode(null);


        }
        else {
            nodeBeforePosition = getNodeBeforePosition(position);
            System.out.println("node before position: "+nodeBeforePosition.getNodeItem());
            nodeToRemove = nodeBeforePosition.getNextnode();
            System.out.println("nodeToRemove : "+nodeToRemove.getNodeItem());
            nodeAfterRemove = nodeToRemove.nextnode;
//            System.out.println("nodeAfterRemove : "+nodeAfterRemove.getNodeItem());
            nodeBeforePosition.setNextnode(nodeAfterRemove);
            nodeToRemove.setNextnode(null);

        }
        nodeCount--;
    }
    public X get(int position){
        if (size()==0){
            throw new Error("list is empty");
        }
        Node tempNode = first;
        for (int i = 1; i < position; i++){
            tempNode = tempNode.getNextnode();
        }

        return tempNode.getNodeItem();
    }
    public boolean find(X item){
        boolean found = false;
        Node tempNode = first;
        for (int k = 0; k< size();k++){
            if (tempNode.getNodeItem().equals(item)){
                found = true;
                break;
            }
            else tempNode = tempNode.getNextnode();
        }

        return found;
    }
    public String toString(){
        if (size()==0){
            throw new Error("no item to print");
        }
        StringBuilder list = new StringBuilder();
        Node currentNode = first;
        int i = 0;
        while (currentNode!=null){
            System.out.println("counting: "+i);
            list.append(currentNode.getNodeItem());
            if (currentNode.getNextnode()!=null){
                list.append(", ");
            }
            //System.out.print(currentNode.getNodeItem()+", ")
            currentNode = currentNode.getNextnode();
            i++;
        };
        System.out.println(list);
        return list.toString();
    }
/// 1 2 4 5  position 3 index 2, node before position index 1, node after index 2
    public int size(){

        return nodeCount;
    }
    private Node getNodeBeforePosition(int position){
        Node tempnode = first;
        for (int i = 0; i < position-2; i++){
            tempnode = tempnode.getNextnode();
        }
        return tempnode;
    }
    /*
        private Node getNodeAfterPosition(int position){
        Node tempnode = first;
        for (int i = 1; i == position-1; i++){
            tempnode = tempnode.getNextnode();
        }
        return tempnode;
    }*/
    private class Node {
        private X nodeItem;
        private Node nextnode;
        private Node(X item){
            this.nextnode = null;
            this.nodeItem = item;
        }

        public void setNextnode(Node nextnode) {
            this.nextnode = nextnode;
        }

        public Node getNextnode() {
            return nextnode;
        }

        public X getNodeItem() {
            return nodeItem;
        }

        private boolean hasNext(){
            boolean hasNext = false;
            if (getNextnode()!=null){
                hasNext = true;
            }
                return hasNext;
        }

    }
}
