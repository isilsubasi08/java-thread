public class main {

    public static void main(String[] args) {

        //Birinci threadimiz bir girdi bekliyor,
        //Bu girdi de mevcut işlemin içerisinden gelecek,
        //İkinci threadimizde bir çıktı verecek,
        //Bu çıktıyıda mevcut işlem taşıyacak. İki thread arasında iletişim için kullanıyoruz.
        Islem mevcutIslem=new Islem();

        Thread t1=new Thread(new Birinci(mevcutIslem));
        t1.start();

        Thread t2=new Thread(new Ikinci(mevcutIslem));
        t2.start();

    }

}
