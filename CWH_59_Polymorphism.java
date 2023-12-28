interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning :");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K :");
    }
}
interface MyWifi2{
    String [] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap and video recording");
    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"JALAl", "KHAN", "IJLAL"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}


public class CWH_59_Polymorphism {

    public static void main(String[] args) {
       MyCamera2 cam1= new MySmartPhone2();
       cam1.record4KVideo();
       MySmartPhone2 s=new MySmartPhone2();
       s.getNetworks();
       s.record4KVideo();
       s.recordVideo();
       s.pickCall();
    }
}
