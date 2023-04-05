package pique;
//should implement a natural ordering if used in priority queue
public class StudentMarks implements Comparable<StudentMarks>{
    private int maths;
    private int physics;
    @Override
    public String toString() {
        return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
    }
    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }
    public int getMaths() {
        return maths;
    }
    public int getPhysics() {
        return physics;
    }
    @Override
    public int compareTo(StudentMarks o) {
        System.out.println("CompareTo called");
        return o.maths-this.maths; //since naturally pq returns ascending elements
    }
    
}
//Integer implements Comparable and thus has a natural ordering
//see how comparable makes us change the base class?
