package Compar;
//Statement: Highest 2 elements needed, since naturally pq does ascending
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class IntegerExample2 {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());
        //using lambda: put the compare function implementation as a lambda function
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        List<Integer> top2 = new ArrayList<>();
        int index=0;
        while(!pq.isEmpty())
        {
            if(index==2)
                break;
            top2.add(pq.poll());
            index++;
        }
        System.out.println(pq);
        System.out.println(top2);
    }
    //what if we wanted highest 2 elements? Change natural compareTo ordering
    
}
