public class Arttirici implements Runnable{


    MevcutSayi sayiReferansi;
    int sure=0;


    public Arttirici(MevcutSayi gelenSayi){
        sayiReferansi=gelenSayi;


    }

    @Override
    public void run() {

        while (sure < 100){

            synchronized (sayiReferansi){
                sayiReferansi.sayiDegeri++;
                System.out.println("Artırdı ,sayı : "+sayiReferansi.sayiDegeri);
            }
            sure++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
