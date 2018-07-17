package DataStructures.Types;

public class BasicHashMap<X,Y> {
    private HashEntry[] data;
    private int capacity;
    private int size;
    public BasicHashMap(int mapSize){
        this.capacity = mapSize;
        this.data = new HashEntry[capacity];
        this.size=0;
    }
    public Y get(X key){
        int hash = calculateHash(key);
        if (data[hash]==null) {
            return null;
        }else
            return (Y) data[hash].getValue();
    }
    public void put(X key, Y value){
        int hashSlot = calculateHash(key);
        data[hashSlot] = new HashEntry(key,value);
        size++;
    }
    public void printAll(){
        StringBuilder list = new StringBuilder();
        for (int i=0;i< data.length;i++){
            if (data[i]!=null){
                list.append("(");
                list.append(data[i].getKey());
                list.append(",");
                list.append(data[i].getValue());
                list.append(") ");
                }
            }
        System.out.println(list);

    }
    private int calculateHash(X key){
        int hash = key.hashCode() % this.capacity;
        while (data[hash] != null && !data[hash].getKey().equals(key)){
            hash = (hash+1)%this.capacity;
        }
        return hash;
    }

    public Y delete(X key){
        int hashSlot = calculateHash(key);
        if (data[hashSlot]==null){
            return null;
        }
        else {
        Y deletedValue = (Y)data[hashSlot].getValue();
        data[hashSlot] = null;
        size--;
        return deletedValue;
        }
    }
    public int size(){
        return this.size;
    }

    private class HashEntry<X,Y>{
        private X key;
        private Y value;

        public HashEntry(X keyP, Y valueP){
            this.key = keyP;
            this.value = valueP;
        }
        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }


    }
}


