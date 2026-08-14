public class MultiThreadingMain {
    static void main() {
        MultiThreadThing thread1 = new MultiThreadThing();
        MultiThreadThing thread2 = new MultiThreadThing();
//        thread1.run();

//        thread1.run(); //thread1 will execute first...sequential execution
//        thread2.run();

        thread1.start(); //both thread work simultaneously to print values
        thread2.start();
    }
}
