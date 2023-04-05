package pique;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudentTester {
    public static void main(String[] args) {

        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70,80));
        stMarks.add(new StudentMarks(38,10));
        stMarks.add(new StudentMarks(100,38));
        stMarks.add(new StudentMarks(40,88));
        stMarks.add(new StudentMarks(97,19));
        //Statement: Get top 3 students according to maths marks
        //PriorityQueue<StudentMarks> spq = new PriorityQueue<>();
        //To add to sp: M1: Travecd piquerse through arraylist and add to spq
        //M2: constuctor
        PriorityQueue<StudentMarks> spq = new PriorityQueue<>(stMarks);

        List<StudentMarks> top3 = new ArrayList<>();
        int index=0;
        while(!spq.isEmpty())
        {
            if(index==3)
                break;
            top3.add(spq.poll());
            index++;
        }
        // System.out.println(pq);
        System.out.println(top3);
    }
}
