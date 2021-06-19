public class Ikinci implements Runnable{


    Islem birimIslem;
    int sayi,index,sonIfade;

    public Ikinci(Islem gelenIslem){
        birimIslem=gelenIslem;
        sayi=10;
        index=2;

    }
    @Override
    public void run() {

        sonIfade=1;
        birimIslem.setSonuc(1);
        while (index < sayi){

            int eskiYeni=birimIslem.getSonuc();
            birimIslem.setSonuc(sonIfade+ birimIslem.getSonuc());
            sonIfade=eskiYeni;
            index++;
            try {
                System.out.println("Fibonacci hesaplanıyor, beklemede");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        System.out.println("Fibonacci hesaplandı, sonuç gönderiliyor....");
        birimIslem.setTamamlandi(true);



    }
}
