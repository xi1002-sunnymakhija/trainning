package demo.test;

public class PrintOddEven {

    public static void main(String[] a)
    {
        OddEven o1= new OddEven();
        Thread evenThread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    o1.printEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread oddThread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    o1.printOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        evenThread.start();
        oddThread.start();

    }
}

class OddEven
{
    static int x=20;
    int counter=1;

    public void printOdd() throws InterruptedException {
        synchronized (this) {
            while (counter < x) {

                while (counter % 2 == 0) {
                    wait();
                }
            }
            System.out.println(counter + "");
           counter++;
            notify();
        }
    }

    public void printEven() throws InterruptedException {
        synchronized (this) {
            while (counter < x) {

                while (counter % 2 == 1) {
                    wait();
                }
            }
            System.out.println(counter + "");
            counter++;
            notify();
        }
    }

    }



