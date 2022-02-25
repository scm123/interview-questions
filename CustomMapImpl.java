package collections;

import java.util.LinkedList;
import java.util.Objects;

public class CustomMapImpl<T, Q> implements CustomMap<T, Q> {
   
	LinkedList<Q>[] map;
	int map_size=100;
	
	public CustomMapImpl() {
		super();
		this.map = new LinkedList[100];
		for(int i=0 ; i< 100 ; i++) this.map[i]=new LinkedList<>();
	}

	public int generateHashCode(T key) {
		
		return Objects.hash(key);
	}
	@Override
	public void put(T key, Q value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Q get(T key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean containsKey(T Key) {
		// TODO Auto-generated method stub
		return false;
	}

}
