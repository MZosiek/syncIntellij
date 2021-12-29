public class AndroidApp extends App{

    public String androidSystem;

    public AndroidApp(String name,String androidSystem) {
        super(name);
        this.androidSystem= androidSystem;
    }

    public void runAndroidApp(){
        System.out.println("App "+ name + " is working on "+ androidSystem);
    }

}
