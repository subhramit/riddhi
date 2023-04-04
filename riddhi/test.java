
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //can iterate over an array or an instance of java.lang.Iterate
        //method 1: make the array part of the list (items) public, so that list.items canbe iterated over
        //but that would cause breach of encapsulation principle
        //wrked

        // Iterator<Integer> itr = list.iterator();
        // while(itr.hasNext())
        //     System.out.println(itr.next());

        for(int x: list)
            System.out.println(x);
    }
}
