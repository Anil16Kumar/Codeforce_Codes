package CC.Multithreading;

public class Mutiplethreading {
    public static void main(String[] args) {
        ThreasClass threasClass=new ThreasClass();
        ThreasClass threasClass1=new ThreasClass();

//        threasClass.run();//calling this don't create any saprate thread
        threasClass.start();
        threasClass1.start();

        // we can even create more multiple threads using for loops:

        for(int i=0;i<=3;i++){
            ThreasClass threasClass3=new ThreasClass();// and all threads will run sepratlly..
            threasClass3.start();



//            CPU (Central Processing Unit)
//The brain of the computer
//Executes instructions (runs your programs)
//Example: Intel i5, AMD Ryzen

            //Core
            //A single processing unit inside a CPU
            //More cores = more tasks can run at the same time
            //Example: Quad-core = 4 tasks can run in parallel

            //Process
            //A running program
            //Each process has its own memory space
            //Example: Opening Chrome = one process

            //Thread
            //A small unit of a process
            //Multiple threads can run inside one process
            //Threads share memory of the process

            //Multithreading means running multiple threads inside a single process at the same time.
            //Multithreading is a way to execute multiple threads concurrently within a single process to improve performance and responsiveness.

            //Single-core CPUs handle one task at a time, while multi-core CPUs execute multiple tasks simultaneously using multiple cores.

            //Time slicing: it is a technique where the CPU gives a small time slot (time quantum) to each process/thread one by one.
            //Time slicing is a scheduling technique where CPU time is divided into small intervals and shared among multiple processes or threads.

            //Context switching is when the CPU stops one process/thread and switches to another, saving the current state and resuming later.
            //Context switching is the process of saving the state of one thread/process and restoring another so the CPU can switch between them.
            //Relation with time slicing
            //Time slicing decides WHEN to switch
            //Context switching is the ACT of switching

            //Multitasking is the ability of an operating system (like Windows or Linux) to run multiple programs (processes) at the same time by efficiently sharing the CPU.
            //On a single-core system, it uses time slicing (giving each task a small time slot) and context switching (saving and switching between tasks) to create the illusion of parallel execution,
            //while on a multi-core system, tasks can actually run in parallel on different cores. This ensures smooth performance, better CPU utilization, and allows users to do multiple activities simultaneously without system lag.


            //Multitasking is when an operating system (like Windows or Linux) runs multiple processes (programs) at the same time,
            // while multithreading is when a single process runs multiple threads (smaller tasks) concurrently to perform work faster.

            //when java program starts one thread begins running immediatly called the main thread, this main thread is responsible for executing the main method of program.

            // to create new thread in java, we can either extends the Thread class or runnable interface...

        }
    }
}
