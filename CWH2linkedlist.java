import java.util.*;

public class CWH2linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.addLast(50);

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
