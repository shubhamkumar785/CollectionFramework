// // import java.util.*;

// // public class CWH1arrayList {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> l1 = new ArrayList<>(); // first we create a arrayList and to store a integer/ String to declare and create a object of an array then used a method of arrayList
// //         ArrayList<Integer> l2 = new ArrayList<>(5);
// //         l2.add(15);
// //         l2.add(18);
// //         l2.add(19);

// //         l1.add(6);
// //         l1.add(7);
// //         l1.add(4);
// //         l1.add(6);
// //         l1.add(0, 5);
// //         l1.addAll(0, l2); // add a array_l2 with a index 0
// //         l1.addAll(l2);  // add a array_l2 with a last index of l2_array
// //         l1.clear(); // clear all the data in an arrayList
// //         for(int i=0; i<l1.size(); i++){
// //             System.out.println(l1.get(i));
// //         }
// //     }
// // }


// import java.util.*;

// public class CWH1arrayList {
//     public static void main(String[] args) {
//         ArrayList<Integer> l1 = new ArrayList<>();
//         ArrayList<Integer> l2 = new ArrayList<>(5);
//         l2.add(15);
//         l2.add(18);
//         l2.add(19);

//         l1.add(10);
//         // l1.add(0,20); // add a 20 with index 0 and shift the data
//         l1.add(20);
//         // l1.addAll(0,l2);   // add L2 array with index 0 in an L1 array
//         l1.addAll(l2);  // add L2 array with a last index of L1 array
//     //    l1.clear();
//         System.out.println(l1.contains(l2)); // 12 in an array true/false
//         System.out.println(l1.indexOf(20)); // return index of 28
//         System.out.println(l1.lastIndexOf(20)); // return a last index of 28
//         l1.set(0, 7);  // set 7 with a index 0
        
        
//         for(int i=0; i<l1.size(); i++){
//             System.out.print(l1.get(i));
//             System.out.print(", ");
//         }
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class CWH1arrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the ArrayList:");
        int n = sc.nextInt();
        
        System.out.println("Enter " + n + "element");
        for(int i=0; i<n; i++){
            int element = sc.nextInt();
            l1.add(element);
        }
        System.out.println("Elements in the ArrayList: ");
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}