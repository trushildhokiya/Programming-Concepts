
public class SingeltonClass {
    public static void main(String[] args) {
        Launch motorolla = Launch.loadLaunch("Motorolla");
        motorolla.startLaunch();

        Launch iphone = Launch.loadLaunch("Apple Iphone 14 pro max Ultra Gold ");
        iphone.startLaunch();
    }
}

class Launch{
    private static Launch launchProduct;
    static String name;

    private Launch(){};

    public static Launch loadLaunch(String Productname){
        if(launchProduct==null){
            launchProduct = new Launch();
            name=Productname;
        }
        return launchProduct;
    }

    public void startLaunch(){
        System.out.println(name+" has been Launched ....");
    }

}