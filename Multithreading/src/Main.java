//Multithreading is a process of executing multiple threads
//simultaneously. A thread is a lightweight sub-process, the smallest unit of processing.
//Both multiprocessing and multithreading are used to achieve
//multitasking. Multithreading is preferred over multiprocessing
//because: Threads share memory, reducing memory usage.
//Context switching between threads is faster than between
//processes. Uses of Multithreading in Java:
//Games (for handling multiple actions simultaneously).
//Animations (to smoothly update graphics).
//Real-time applications (e.g., chat applications, web servers)

//Example :- Gaming Applications
//In multiplayer online games, multiple tasks happen simultaneously:
//The game physics are calculated (jumping, running, shooting).
//The graphics are being rendered.
//The network communication updates the game state for
//multiple players.
//The sound effects play in the background.
//Each of these tasks is handled by different threads,
//ensuring smooth gameplay.

public class Main {
    public static void main(String[] args) {

        // Create a thread using a lambda expression
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
        });

        // Create a thread using an anonymous class
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running");
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for the threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is finished");
    }
}