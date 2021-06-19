public class Ikinci implements Runnable{

    private int sayi;

    public Ikinci(){
        sayi=50;

    }
    @Override
    public void run() {

        while (sayi>35){
            System.out.println("Geri y : "+sayi);
            sayi--;

        }


    }
}
