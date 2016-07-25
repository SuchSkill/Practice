package proc.stat;

import java.util.Stack;

/**
 * Created by Eugene on 22.07.2016.
 */
public class Hanoi {
    public static void main(String[] args) {
        Stack<Integer> from = new Stack<>();
        Stack<Integer> help = new Stack<>();
        Stack<Integer> to = new Stack<>();
        from.push(3);
        from.push(2);
        from.push(1);
        System.out.println(from);

        exchange(from, help, to, from.size());
        System.out.println(to);
    }

    private static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int size) {
        if (size > 0) {
            exchange(from, to, help, size - 1);

            int biggest = from.pop();
            to.push(biggest);
            exchange(help,from,to,size-1);
        }
    }
}
