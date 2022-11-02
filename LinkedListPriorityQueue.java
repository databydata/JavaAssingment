package Assingment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListPriorityQueue {
	public static void main(String[] args)
	{
		Queue<MainAccount> q = new PriorityQueue<Integer>();
		
		q.offer(new MainAccount("Lala",10,20));
        q.offer(new MainAccount("Gupta",10,20));
        q.offer(new MainAccount("Dubey",10,20));
        q.offer(new MainAccount("Marathe",10,20));
        
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());
        
        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());


        //LinkedList - FIFO structure
        Queue<MainAccount> = new LinkedList<>();

        q.offer(new MainAccount("Lala",10,20));
        q.offer(new MainAccount("Gupta",10,20));
        q.offer(new MainAccount("Dubey",10,20));
        q.offer(new MainAccount("Marathe",10,20));

        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());
	}
}
