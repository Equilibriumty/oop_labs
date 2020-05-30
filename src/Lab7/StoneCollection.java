package Lab7;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;


public class StoneCollection <T> implements Set<T> {

    private List s = new List();
    private int size = 0;

    public StoneCollection (){
    }

    public StoneCollection (Stones stn){
        add(stn);
    }

    public StoneCollection(Collection<? extends T> stn){
        addAll(stn);
    }

    @Override
    public boolean add(Object stn) {

        boolean flag = true;
        ListElement t = s.getFirstElement();
        while (t != null) {
            if (t.data==stn) {
                flag = false;
                break;
            }
            t = t.next;
        }
        if (flag) {
            s.addToEnding((Stones) stn);
            size++;
        }
        return flag;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<Object> iterator = (Iterator<Object>) c.iterator();
        boolean flag = false;
        while (iterator.hasNext()) {
            flag = add((Stones) iterator.next());
        }
        return flag;
    }

    @Override
    public void clear() {
        s = null;
        s = new List();
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = add(o);
        if (flag) {
            s.DeleteElement((Stones) o);
        } return !flag;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean flag = true;
        Iterator<Stones> iterator = (Iterator<Stones>) c.iterator();
        while (iterator.hasNext()) {
            flag = contains((Stones) iterator.next());
            if (!flag){
                break;
            }
        }
        return flag;
    }

    @Override
    public boolean isEmpty() {
        return s.getFirstElement()==null;
    }

    @Override
    public Iterator<T> iterator() {
        return new StoneIterator();
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            s.DeleteElement((Stones) o);
            size--;
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {

        boolean flag = false;
        for (Object object : c) {
            flag = remove(object);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean flag = true;
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            Stones stones = (Stones) iterator.next();
            flag = c.contains(stones);
            if (!flag)
                remove(stones);
        }
        return !flag;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        int i = 0;
        Object[] mas = new Object[size];
        Iterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            mas[i] = iterator.next();
            i++;

        }
        return mas;
    }

    @Override
    public <T> T[] toArray(T[] array) {
        int size = size();
        if (array.length < size) {
            array = (T[]) Array.newInstance(array.getClass().getComponentType(), size);
        } else if (array.length > size) {
            array[size] = null;
        }
        int i = 0;
        for (Object e: this) {
            array[i] = (T) e;
            i++;
        }
        return array;
    }

    class StoneIterator implements Iterator {

        private ListElement thisElement = s.getFirstElement();

        @Override
        public boolean hasNext() {
            return thisElement != null;
        }

        @Override
        public Stones next() {
            Stones s = thisElement.data;
            thisElement = thisElement.next;
            return s;
        }

        @Override
        public void remove() {
            s.DeleteElement(thisElement.data);
        }
    }
}