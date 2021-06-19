public class Birinci implements Runnable {

    private int sayi;

    public Birinci(){
        sayi=0;
    }


    @Override
    public void run() {

        while (sayi<5){
            System.out.println("İleri x:"+sayi);
            sayi++;

        }
    }
}
