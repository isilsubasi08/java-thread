public class Birinci implements Runnable{

    int sayi;

    public Birinci(){

        sayi=0;

    }

    @Override
    public void run() {

        while (sayi<5){
            System.out.println("İleri x : "+sayi);
            sayi++;
        }

    }
}
