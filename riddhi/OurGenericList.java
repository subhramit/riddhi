package riddhi;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable {
    private T[] items; //the colletion
    private int size; //to store length

    //create constuctor
    public OurGenericList() {
        size = 0;
        items = (T[]) (new Object[100]);

    }

    //add items
    public void add(T item) {
        items[size++] = item;
    }

    //retrieve items
    public T getItemAtIndex(int index) {
        return items[index];
    }

    //implementing iterable, return an iterator to use on this collection
    @Override
    public Iterator iterator() {
        return new OurGenericListIterator(this);
    }

    //private inner class implementing Iterator
    private class OurGenericListIterator implements Iterator<T> {
        //instace of outer object needed to iterate over
        private OurGenericList<T> list;
        private int index = 0; //to keep track if elements left

        //create constructor
        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index<list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
        
    }
}