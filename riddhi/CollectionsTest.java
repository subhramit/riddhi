package riddhi;

import java.util.Iterator;

public class CollectionsTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //can iterate over an array or an instance of java.lang.Iterate
        //method 1: make the array part of the list (items) public, so that list.items canbe iterated over
        //but that would cause breach of encapsulation principle
        //wrked

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

    }
}
