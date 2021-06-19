public class ArtDene {


    public static void main(String[] args) {
        MevcutSayi paket=new MevcutSayi();

        Thread t1=new Thread(new Arttirici(paket));
        Thread t2=new Thread(new Azaltici(paket));

        t1.start();
        t2.start();
    }
}
