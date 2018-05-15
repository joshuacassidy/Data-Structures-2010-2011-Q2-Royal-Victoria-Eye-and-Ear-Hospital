public interface IQueue<T> {
    public boolean isEmpty();
    public int size();
    public void enqueue();
    public T dequeue();
    public T peek();
}
