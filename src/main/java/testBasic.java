import java.util.*;

/**
 * Created by user on 2016/10/12.
 */
public class testBasic {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("a");
        hashSet.add("b");
        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("hashSet"+iterator.next());
        }
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("a");
        linkedHashSet.add("b");
        Iterator iterator1=linkedHashSet.iterator();
        while(iterator1.hasNext()){
            System.out.println("linkedHashSet:"+iterator1.next());
        }
        TreeSet treeSet=new TreeSet();
        treeSet.add("1");
        treeSet.add("2");
        Iterator iterator2=treeSet.iterator();
        while(iterator2.hasNext()){
            System.out.println("treeSet；"+iterator2.next());
        }
        TreeSet treeSetObject=new TreeSet();
        treeSetObject.add(new Student(1,"a"));
        treeSetObject.add(new Student(2,"b"));
        Iterator iterator3=treeSetObject.iterator();
        while(iterator3.hasNext()){
            System.out.println("treeSet；"+iterator3.next());
        }
        HashMap hashMap=new HashMap();
        hashMap.put("0","a");
        hashMap.put("1","b");
        System.out.println(hashMap);
        Set set=hashMap.keySet();
        Iterator iterator4=set.iterator();
        while (iterator4.hasNext()){
            System.out.println("HashMap:"+hashMap.get(iterator4.next()));
        }

        List
                list=new ArrayList();
        list.add("a");
        list.add(1);
        Iterator iterator5=list.iterator();
        while (iterator5.hasNext()){
            System.out.println(iterator5.next());
        }

    }
}
