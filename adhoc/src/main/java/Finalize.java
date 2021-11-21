public class Finalize {


        static Finalize t ;

        static int count =0;

        public static void main(String[] args) throws InterruptedException
        {
            Finalize t1 = new Finalize();

            // making t1 eligible for garbage collection
            t1 = null; // line 12

            // calling garbage collector
            System.gc(); // line 15

            // waiting for gc to complete
            Thread.sleep(1000);

            // making t eligible for garbage collection,
            t = null; // line 21

            // calling garbage collector
            System.gc(); // line 24

            // waiting for gc to complete
            Thread.sleep(1000);

            System.out.println("finalize method called "+count+" times");

        }

        public void m1()
        {
             int x;

        }


        @Override
        protected void finalize()
        {
            count++;

            System.out.println("count "+count);

           // t = this; // line 38

        }

    }


