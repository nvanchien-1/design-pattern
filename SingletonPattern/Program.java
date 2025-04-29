public class Program {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> nameSingleton.getInstance().ChiensaysHi());
        Thread thread2 = new Thread(() -> nameSingleton.getInstance().ChiensaysHi() );

        thread1.start();
        thread2.start();
    }
}
