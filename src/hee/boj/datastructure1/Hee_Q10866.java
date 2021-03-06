package hee.boj.datastructure1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//            덱(Deque, Double ended queue)
public class Hee_Q10866 {
    static Scanner scanner = new Scanner(System.in);

    public static void run(){
        int N = scanner.nextInt();
        Deque deque = new LinkedList();

        while (N > 0){
            String command = scanner.next();

            switch (command){
                case "push_front":
                    deque.offerFirst(scanner.nextInt());
                    break;

                case "push_back":
                    deque.offerLast(scanner.nextInt());
                    break;

                case "pop_front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollFirst());
                    break;

                case "pop_back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollLast());
                    break;

                case "size":
                    System.out.println(deque.size());
                    break;

                case "empty":
                    System.out.println(deque.isEmpty() ? "1" : "0");
                    break;

                case "front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.peekFirst());
                    break;

                case "back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.peekLast());
                    break;

                default:
                    break;
            }
            N--;
        }
    }
}

