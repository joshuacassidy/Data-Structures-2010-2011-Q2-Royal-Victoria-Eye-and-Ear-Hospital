public class Main {

    public static void main(String[] args) {
        Queue<Patient> queue = new Queue<>();
        queue.enqueue(new Patient("a", "a", "a"));
        queue.enqueue(new Patient("b", "b", "b"));
        queue.enqueue(new Patient("c", "c", "c"));
        queue.enqueue(new Patient("d", "d", "d"));
        queue.dequeue();
        System.out.println(queue);
    }

}
