public class main {


    public static void main(String[] args) {
        Thread t1=new Thread(new Birinci());
        t1.start();

        Thread t2=new Thread(new Ikinci());
        t2.start();



    }

}
