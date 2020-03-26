import java.util.LinkedList;
import java.util.Queue;

//ptoblema1

public class Coada {
    private int[] queue;
    private int nr_elem;

    public Coada() {
        queue = new int[0];
        nr_elem = 0;
    }

    public Coada(int a) {
        nr_elem = a;
        queue = new int[nr_elem];

    }


    public void push(int element) {
        nr_elem++;
        queue = resize(queue, nr_elem, element);

    }

    public int[] resize(int[] temp, int capacity, int element) {
        int[] copy;
        copy = new int[capacity];
        for (int i = 0; i <capacity-1; i++) {
            copy[i] = temp[i];
        }
        copy[capacity-1] = element;
        return copy;
    }

    public int pop() {
        if(isEmpty()==true) {

            System.out.println("pop error empty");

            return -1;


        }
        nr_elem--;
        int a = queue[nr_elem];
        int[] copy = new int[nr_elem];
        for (int i = 0; i < nr_elem; i++) {
            copy[i] = queue[i];
        }
        queue = copy;
        return a;


    }

    public boolean isEmpty() {
        if (nr_elem == 0) return true;
        return false;
    }

    public String toString() {

        StringBuilder b = new StringBuilder();

        b.append(String.valueOf(nr_elem));
        b.append('[');
        for (int i = 0; i < nr_elem; i++) {
            b.append(String.valueOf(queue[i]));
            b.append(' ');
        }

        return b.append(']').toString();
    }


    public static void main(String[] arg) {

        Coada ob = new Coada();
        ob.push(2);

        ob.pop();
        ob.pop();
        System.out.print(ob.toString());
    }
}