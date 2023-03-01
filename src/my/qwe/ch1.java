public class TestClass {

    public static void main(String[] args) {
        musicOn musicPlayer = new musicOn();
        musicPlayer.musicOn(); // play music once
        
        // play music every 3 seconds
        while (true) {
            try {
                Thread.sleep(3000);
                musicPlayer.musicOn();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
