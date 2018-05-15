public class Queue<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return count;
    }

    public void enqueue(T newData){
        count++;
        Node<T> oldLast = last;
        last = new Node<>(newData);
        last.setNext(null);

        if (isEmpty()){
            first = last;
        } else {
            oldLast.setNext(last);
        }
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        count--;
        T oldFirst = first.getData();
        first = first.getNext();
        return oldFirst;
    }

    public T peek(){
        return first.getData();
    }

    @Override
    public String toString() {
        String str = "";
        for (Node temp = first; temp != null; temp=temp.getNext()) {
            str += temp.getData() + (temp.getNext() != null ? ", " : "");
        }
        return str;
    }
}
