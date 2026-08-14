public class MultiThreadThing extends Thread{
    int tNo;

    //to check which thread prints value
    public MultiThreadThing(int threadNO){
        this.tNo = threadNO;
    }

    @Override
    public void run(){
        for(int i=1; i<=5;i++){
            System.out.println(i+" is printed by thread "+tNo);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
