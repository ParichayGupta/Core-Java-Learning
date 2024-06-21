package ProblemSolving.Heaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(44,562,678,311,200,21);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(list);

        for(int i = 0; i < list.size(); i++){
            System.out.println(priorityQueue.poll());
        }
    }
}
