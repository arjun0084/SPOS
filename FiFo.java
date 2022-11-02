/*  Sinhgad Academy of Engineering, Kondhwa */
/*	Name :- Pawar Sumit Vikas               */		
/*  Roll No:- COTB38 	Div:- B			    */

// package FiFo;

import java.util.LinkedList;		
import java.util.Queue;
public class FiFo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("486");		/// adding values
        queue.add("294");
        queue.add("352");
        queue.add("965");
        queue.add("169");
        System.out.println("Created Queue: " + queue);
        String value = (String) queue.remove();		
        //   removing start element of queue 
        System.out.println("The element deleted from the head is: " + value);
        System.out.println("The queue after deletion: " + queue);	
        ///printing the queue after removing 1st element
        String head = (String) queue.peek();
        System.out.println("The head of the present queue is: " + head);		
        // queue start element
        int size = queue.size();
        System.out.println("The size of the queue is: " + size);		// printing queue size
    }
}

/*
 * Output:- 
 Created Queue: [486, 294, 352, 965, 169]
The element deleted from the head is: 486
The queue after deletion: [294, 352, 965, 169]
The head of the present queue is: 294
The size of the queue is: 4
 */