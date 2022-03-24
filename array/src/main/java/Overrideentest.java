import java.io.IOException;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.concurrent.*;

public class Overrideentest {

   public static void main(String[] a)
   {
       //A x = new B();
       ExecutorService executorService= Executors.newFixedThreadPool(5);
       Future<String> submit = executorService.submit(new Callable<String>() {
           public String call() {
               return "Hello";
           }
       });
       //executorService.execute();

       Thread t1= new Thread(()->System.out.println("Hell is here"));
       t1.start();
       try {
           System.out.println(submit.get());
       } catch (InterruptedException e) {
           e.printStackTrace();
       } catch (ExecutionException e) {
           e.printStackTrace();
       }
   }

}

class A {
    private void foo() throws IOException {
    }
}

class B extends A {

    private void foo() throws SocketException {
    } // allowed

//    @Override
//    public void foo() throws SQLException {
//    } // NOT allowed
}