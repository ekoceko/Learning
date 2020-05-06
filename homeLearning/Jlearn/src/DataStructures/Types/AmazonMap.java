package DataStructures.Types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import static java.util.Comparator.comparing;

public class AmazonMap {

    public static class Entry{
        public static final Comparator<Entry> By_Person = comparing(Entry::getPerson);
        public static final Comparator<Entry> By_Timestamp = comparing(Entry::getTimestamp);
        private Date timestamp;
        private String person;
        private String page;

        public Date getTimestamp() {
            return timestamp;
        }
        public String getPerson() {
            return person;
        }
        public String getPage() {
            return page;
        }

        public Entry(String timestamp, String person, String page) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            this.timestamp = dateFormat.parse(timestamp);
            this.person = person;
            this.page = page;
        }
        public String toString(){
            return "Time: "+this.timestamp.toString()+" Person: "+this.person+" Page: "+this.page;
        }
        public static class Pair{
            String p1;
            String p2;
            public  Pair(String p1, String p2){
                this.p1 =p1;
                this.p2 =p2;
            }
            public String toString(){
                return "{Pair1: "+this.p1+" Pair2: "+this.p2+"}";
            }
        }
    }
    public static void main(String[] args) throws ParseException {
        //Generate Data
        List<Entry> entryList = new ArrayList<>();
        entryList.add(new  Entry("24-07-2018 14:12:00","Ekrem","Page2"));
        entryList.add(new  Entry("26-07-2018 15:11:00","Alvar","Page2"));
        entryList.add(new  Entry("24-07-2018 14:10:00","Ekrem","Welcome"));
        entryList.add(new  Entry("25-07-2018 13:11:00","Bahar","Page1"));
        entryList.add(new  Entry("24-07-2018 14:11:00","Ekrem","Page1"));
        entryList.add(new  Entry("25-07-2018 13:12:00","Bahar","Page2"));
        entryList.add(new  Entry("26-07-2018 15:12:00","Alvar","Page3"));

        //Sort by Name
        entryList.sort(Entry.By_Person);

        //Sort by Timestamp
        entryList.sort(Entry.By_Timestamp);

        Set<Entry.Pair> pairSet = new HashSet<>();

        Map<Entry.Pair,Integer> transitions = new HashMap<>();
        Entry.Pair pair1 = new Entry.Pair("P1","P2");
        transitions.put(pair1,1);
        for (int i =0;i<entryList.size()-1;i++){
            String person1 = entryList.get(i).getPerson();
            String person2 = entryList.get(i+1).getPerson();
            String page1 = entryList.get(i).getPage();
            String page2 = entryList.get(i+1).getPage();
            if (person1.equals(person2)){
                Entry.Pair p = new Entry.Pair(page1,page2);
                if (!transitions.containsKey(p)){
                    transitions.put(p,1);
                }else {
                    Integer value = transitions.get(p);
                    transitions.put(p,value+1);
                }
            }
        }
        System.out.println(transitions);
    }
}
