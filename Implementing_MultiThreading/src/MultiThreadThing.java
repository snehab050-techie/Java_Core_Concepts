public class MultiThreadThing implements Runnable{
    int tNo;

    //to check which thread prints value
    public MultiThreadThing(int threadNO){
        this.tNo = threadNO;
    }

    @Override
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println(i+" is printed by thread "+tNo);

            //Exception from one thread won't make other threads stop working - threads work independently
//            if(tNo == 3){
//                throw new RuntimeException();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
