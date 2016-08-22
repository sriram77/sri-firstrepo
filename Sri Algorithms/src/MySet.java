import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MySet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable {

	private HashMap<E, Object> myMap;
	
	public HashMap<E, Object> getMyMap() {
		return myMap;
	}

	public void setMyMap(HashMap<E, Object> myMap) {
		this.myMap = myMap;
	}

	public MySet(Collection<?> colObj) {
		myMap = new HashMap<E, Object>();
		Iterator<?> itr = colObj.iterator();
		while (itr.hasNext()) {
			add((E) itr.next());
		}

	}

	public boolean add(E e) {
		// TODO Auto-generated method stub
		if (myMap.size() == 0 && e != null) {
			myMap.put(e, new Object());
			return true;
		}
		for (E key : myMap.keySet()) {
			if (!key.equals(e)) {
				myMap.put(e, new Object());
				return true;
			}
		}
		return false;
	}

	public boolean contains(Object o) {
		return myMap.containsKey(o);
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
