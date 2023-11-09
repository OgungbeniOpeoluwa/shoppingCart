package ShoppingCheckOutProgram;

public class MultiThreading extends Thread{
    @Override
    public void run(){
        for(int count = 0; count < 50; count++) {
            System.out.print("=");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

    }
}
