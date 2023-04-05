package pique;
//Statement: Physics based sorting
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudentTester2 {
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
        PriorityQueue<StudentMarks> spq = new PriorityQueue<>((s1,s2)->s2.getPhysics()-s1.getPhysics());
        /*
         * PriorityQueue<StudentMarks> spq = new PriorityQueue<>((s1,s2)->
         * {
         * sysout("Comparator's compare called")
         * return s2.getPhysics()-s1.getPhysics();
         * });
         */

        for(StudentMarks sm:stMarks)
            spq.add(sm);

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
