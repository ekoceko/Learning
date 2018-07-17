package DataStructures.Types;

public class BasicBinaryTree<X extends Comparable<X>>{
    private Node bigParent;
    private int size;
    private int space = 1;
    public BasicBinaryTree(){
        bigParent =null;
    }
    public int size(){
        return this.size;
    }

    public void add(X item){
        Node newNode = new Node(item);
        if (bigParent ==null){
            System.out.println("setting big parent to: "+item);
            this.bigParent = newNode;
            this.size++;
        }
        else {insert(this.bigParent,newNode);
        }
    }

    public Node<X> contains(X item){

        return compare(bigParent,item);
    }
    public Node<X> compare(Node existing, X given){
        //System.out.println("testing: "+ existing.getItemName()+ " versus "+given);
        if (existing.getItemName() == given){
            //System.out.println("equals");
            return existing;
        }else if (existing.getItemName().compareTo(given) >0)
        {
            //System.out.println("existing bigger");
            if (existing.getLeftChild()!=null){
                //System.out.println("comparing with leftchild");
            return compare(existing.getLeftChild(),given);}

        }else if (existing.getItemName().compareTo(given) <0)
        {
            //System.out.println("existing smaller");
            if (existing.getRightChild()!=null){
                //System.out.println("comparing with rightchild");
               return compare(existing.getRightChild(),given);}
        }
        System.out.println("couldnt find, will return null");
        return null;
    }
    public boolean delete(X item){
        Node nodeToDelete = contains(item);
        if (nodeToDelete==null){
            return false;
        }
        Node leftChildToLink = nodeToDelete.leftChild;
        Node rightChildToLink = nodeToDelete.rightChild;
        Node newParent = nodeToDelete.getParent();


        if (newParent==null){
            if (rightChildToLink!=null){
                this.bigParent=rightChildToLink;
                rightChildToLink.setParent(null);
            } else if (leftChildToLink!=null){
                this.bigParent=leftChildToLink;
                leftChildToLink.setParent(null);
            } else {

            }
        }else {
            if (rightChildToLink!=null){
                rightChildToLink.setParent(newParent);
                setToParent(rightChildToLink);
                if (leftChildToLink!=null){
                    leftChildToLink.setParent(getSmallest(rightChildToLink));
                    setToParent(leftChildToLink);
                }
            }
            else if (leftChildToLink!=null) {
                leftChildToLink.setParent(newParent);
                setToParent(leftChildToLink);
            }

        }

        delLink(nodeToDelete);
        return true;
    }
    private void delLink(Node nodeToDelete){
        //deleteFromParent(nodeToDelete);
        nodeToDelete.setParent(null);
        nodeToDelete.setLeftChild(null);
        nodeToDelete.setRightChild(null);
        size--;
    }
    private void deleteFromParent(Node nodeToDelete){
        Node parent = nodeToDelete.getParent();
        if (parent!=null){
        if (parent.getItemName().compareTo(nodeToDelete.getItemName())>0){
            parent.setLeftChild(null);
        }else if (parent.getItemName().compareTo(nodeToDelete.getItemName())<0){
            parent.setRightChild(null);
        }}

    }
    private void setToParent(Node noteToSet){
        Node parent = noteToSet.getParent();
        if (parent!=null){
            if (parent.getItemName().compareTo(noteToSet.getItemName())>0){
                parent.setLeftChild(noteToSet);
            }else if (parent.getItemName().compareTo(noteToSet.getItemName())<0){
                parent.setRightChild(noteToSet);
            }}

    }
    public void drawTree(){

        System.out.println("^"+bigParent.getItemName());
        drawchilds(bigParent);
        this.space=1;
        System.out.println();
        System.out.println("----");
    }
private void putSpace(int count){
    while (count>0){System.out.print(" ");
    count--;
    }

}
    private void drawchilds(Node parent) {

        if (parent.getLeftChild()!=null){
            System.out.print("<"+parent.getLeftChild().getItemName());
            putSpace(this.space);
            drawchilds(parent.getLeftChild());
        } else {
            //System.out.println();
        }
        if (parent.getRightChild()!=null){
            System.out.print(">"+parent.getRightChild().getItemName());
            putSpace(this.space);
            drawchilds(parent.getRightChild());
        }
        else {
            //System.out.println();
        }
        this.space = this.space+1;
    }

    private Node getSmallest(Node rightChildToLink){
        Node tempNode = rightChildToLink;
        while (tempNode.getLeftChild()!=null){
            tempNode = tempNode.getLeftChild();
        }

        return tempNode;
    }

    private void insert(Node parent, Node child){
        if (child.getItemName().compareTo(parent.getItemName())<0){
            //System.out.println("child "+child.getItemName()+" is smaller than parent "+parent.getItemName());
            if (parent.getLeftChild()==null){
                //System.out.println("small child is null, setting child&parent");
            child.setParent(parent);
            parent.setLeftChild(child);
                //System.out.println("small child's parent is set to: "+child.getParent().getItemName());
                //System.out.println("parent's small child is set to: "+parent.getLeftChild().getItemName());
            this.size++;
            }else {
                //System.out.println("small child is NOT null, entering recursive with small child");
                insert(parent.getLeftChild(),child);
            }
        } else if (child.getItemName().compareTo(parent.getItemName())>0){
            //System.out.println("child "+child.getItemName()+" is bigger than parent "+parent.getItemName());
            if (parent.getRightChild()==null){
                //System.out.println("big child is null, setting child&parent");
                child.setParent(parent);
                parent.setRightChild(child);
                //System.out.println("big child's parent is set to: "+child.getParent().getItemName());
                //System.out.println("parent's big child is set to: "+parent.getRightChild().getItemName());
                this.size++;
            }else {
                //System.out.println("big child is NOT null, entering recursive with big child");
                insert(parent.getRightChild(),child);
            }
        }
        else {
            System.out.println("this is equal case! wont add anything");
            //equal
        }
    }





    private class Node<X extends Comparable<X>>{

        private Node parent;
        private Node leftChild;
        private Node rightChild;
        private X itemName;

    public Node(X item){
        this.itemName = item;
    }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public X getItemName() {
            return itemName;
        }

        public void setItemName(X itemName) {
            this.itemName = itemName;
        }
    }

}

