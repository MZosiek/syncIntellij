public class AppTest {
    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("AndroidApplication", "Anroid");

       android.describe();
       android.runAndroidApp();

       IphoneApp iphone = new IphoneApp("IphoneApplication","iphone");

       iphone.describe();
       iphone.runIphoneApp();


    }
}
