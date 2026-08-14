public class MultiThreadingMain {
    static void main() {
//        MultiThreadThing thread1 = new MultiThreadThing();
//        MultiThreadThing thread2 = new MultiThreadThing();
////        thread1.run();
//
////        thread1.run(); //thread1 will execute first...sequential execution
////        thread2.run();
//
//        thread1.start(); //both thread work simultaneously to print values
//        thread2.start();

        //starting 5 threads parallel
        //All 5 threads will print numbers at the same time
        for(int i=1;i<=5;i++){
            MultiThreadThing threads = new MultiThreadThing(i);
            threads.start();
        }
    }
}
