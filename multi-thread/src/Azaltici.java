public class Azaltici implements Runnable{

    MevcutSayi sayiReferansi;
    int sure=0;

    public Azaltici(MevcutSayi gelenSayi){
            sayiReferansi=gelenSayi;

    }


    @Override
    public void run() {

        while (sure < 100){

            synchronized (sayiReferansi){
                sayiReferansi.sayiDegeri--;
                System.out.println("Azalttı ,sayı : "+sayiReferansi.sayiDegeri);
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
