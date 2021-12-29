public class IphoneApp extends App{

    public String iphoneSystem;

    public IphoneApp(String name, String iphoneSystem) {
        super(name);
        this.iphoneSystem = iphoneSystem;
    }

    public void runIphoneApp(){
        System.out.println("App " + name + " is working on " + iphoneSystem);
    }
}
