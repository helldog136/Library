package ovh.helldog136.util;

import java.util.ArrayList;

/**
 * Created by De Weireld Duncan on 19/12/14.
 */
public class SortedArrayList<T extends Comparable<T>> extends ArrayList<T> {
    private boolean noDouble = false;

    /**
     * Default constructor of the SortedArrayList
     */
    public SortedArrayList(){
        this(false);
    }

    /**
     * Constructor of the SortedArrayList
     * @param _noDouble boolean wether the ArrayList can contain duplicates objects or not
     */
    public SortedArrayList(boolean _noDouble){
        super();
        noDouble = _noDouble;
    }

    /**
     * Inserts in order the given Comparable Object in the ArrayList
     * @param object the object to insert
     * @return the index of the inserted object
     */
    public int insertSorted(T object){
        int index;
        for(index = 0 ; index<size(); index++){
            if (get(index).compareTo(object)>0){
                break;
            }
        }
        if(size()>0){
            if(get(index-1).equals(object) && noDouble){
                return index-1;
            }
        }
        super.add(index, object);
        return index;
    }
    @Override
    public boolean add(T object){
        throw new UnsupportedOperationException("add() in a SortedArrayList is deprecated, use insertSorted() instead");
    }
    @Override
    public void add(int i, T object){
        throw new UnsupportedOperationException("add() in a SortedArrayList is deprecated, use insertSorted() instead");
    }

    public static void main(String[] args){
        SortedArrayList<String> t1 = new SortedArrayList<String>();
        System.out.println(t1.insertSorted("a"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("b"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("c"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("a"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("d"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("f"));
        System.out.println(t1);
        System.out.println(t1.insertSorted("e"));
        System.out.println(t1);

        SortedArrayList<String> t2 = new SortedArrayList<String>(true);
        System.out.println(t2.insertSorted("a"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("b"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("c"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("a"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("d"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("f"));
        System.out.println(t2);
        System.out.println(t2.insertSorted("e"));
        System.out.println(t2);
    }
}
