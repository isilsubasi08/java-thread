public class Birinci implements Runnable {

    Islem birimIslem;

    public Birinci(Islem gelenIslem){
        birimIslem=gelenIslem;
    }

    @Override
    public void run() {

        //farklı bir threadden sonuç bekliyor olacağım.
        while (!birimIslem.isTamamlandi()){//tamamlanmadığı sürece aşağıdakileri yap

            long baslangic=System.currentTimeMillis();
            try {
                System.out.println("Islem sonucu hazır değil, sistem beklemede");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long bitis=System.currentTimeMillis();
            System.out.println("Uyku süresi: "+ (bitis-baslangic));
        }
        System.out.println("Işlem sonucu hazır. Sonuc: "+birimIslem.getSonuc());

    }
}
