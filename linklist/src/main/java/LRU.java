import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static javax.swing.UIManager.get;

public class LRU {

    public static void main(String[] a)
    {
        LinkedList dque =new LinkedList<Integer>();
        Set referenceKey= new HashSet<Integer>();
        int capacity=5;
        for(int i=0;i<capacity;i++)
        {
            referenceKey.add(i);
        }
        get(1, dque, referenceKey);
        get(2, dque, referenceKey);
        get(3, dque, referenceKey);
        get(4, dque, referenceKey);
        get(5, dque, referenceKey);
        put(6, dque, referenceKey, capacity);
    }

    private static void put(int i, LinkedList<Integer> l, Set s , int capacity) {
        if(l.size() == capacity)
        {
            if(!s.contains(i))
            {
                l.removeFirst();
                s.add(i);
            }
        }
        else
        {
            s.add(i);

        }
    }

    private static int get(int i, List l, Set s) {
        if(!s.contains(i))
        {
            return -1;
        }
        else if(s.contains(i))
        {
            l.add(i);
        }
        return i;
    }
}
