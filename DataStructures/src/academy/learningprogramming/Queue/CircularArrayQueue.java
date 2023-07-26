package academy.learningprogramming.Queue;

import academy.learningprogramming.list.Employee;

import java.util.NoSuchElementException;

public class CircularArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public CircularArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    //add
    public void add(Employee employee){
        if(size() == queue.length -1 ){
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        //circular need reserve 1 empty position
        //for "back" pointer to indicate next element input position

        //example1
        //before resize the queue, current size is 4 and equal to queue.length(5)-1=4
        //due to back pointer always point to next available position
        //so current queue size == queue.length-1 is already full need to resize
        // 0 - jane --front
        // 1 - john
        // 2 - mary
        // 3 - mike
        // 4 - bill
        // 5        --back

        //after resize the queue
        //unwarping the queue and reset the front of the queue to 0
        // 0 - jane --front
        // 1 - john
        // 2 - mary
        // 3 - mike
        // 4 - bill
        // 5 - ian
        // 6        --back
        // 7
        // 8
        // 9

        // circular queue the index of back pointer will be less than front pointer
        // so when we are doing the resize, need to unwarp the queue
        // put the fornt pointer to index 0 again

        //example2
        // before resize
        // 0 -jane
        // 1 -john
        // 2       --back
        // 3 -mike --front
        // 4 -bill

        //after resize
        // 0 -mike --front
        // 1 -bill
        // 2 -jane
        // 3 -john
        // 4       --back
        // 5
        // 6
        // 7
        // 8
        // 9


        queue[back] = employee;
        if( back < queue.length -1){
            back++;
        }else{
            back = 0;
        }
    }

    //remove
    public Employee remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            back = 0;
        }else if(front == queue.length){
            //front pointer wrap back to the beginning
            front = 0;
        }

        return employee;
    }


    //peek
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }


    //size
    public int size(){
        if(front <= back){
            return back - front;
        }else{
            return back - front + queue.length;
        }
    }

    //print queue
    public void printQueue() {
        if(front <= back){
            for (int i = front; i< back; i++)
            {
                System.out.println(queue[i]);
            }
        }else{
            //queue wrap condition
            //print front to end of queue first, then print beginning to back-1
            for (int i = front; i<queue.length; i++){
                System.out.println(queue[i]);
            }
            for (int i = 0; i<back; i++){
                System.out.println(queue[i]);
            }
        }
    }
}
