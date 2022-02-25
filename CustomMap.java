package collections;

public interface CustomMap<T, Q> {
  public void put(T key,Q value);
  public Q get(T key);
  public boolean remove(T key);
  public int size();
  public boolean containsKey(T Key);
}
