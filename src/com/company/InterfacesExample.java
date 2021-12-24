package com.company;

public class InterfacesExample {
    public static void main(String[] args) {
       SmartPhone1 smartPhone = new SmartPhone1();
       String[] ar = smartPhone.getNetworks();
       for (String item:
            ar){
           System.out.println(item);
       }
       smartPhone.record4KVideo();
    }
}

interface Camera{
   void takeSnap();
   void recordVideo();
   private void greet(){
       System.out.println("Good Morning...");
   }
  default void record4KVideo(){
       greet();
      System.out.println("Recording in 4k....");
  }

}
interface Wifi{
    String[] getNetworks();
    void ConnectNetworks(String network);
}

class CellPhone{
void callNumber(int phoneNumber){
    System.out.println("Calling"+phoneNumber);
}
    void pickcall(){
        System.out.println("Connecting");
    }

}

class SmartPhone1 extends CellPhone implements Wifi,Camera{
   public void takeSnap(){
    System.out.println("Taking snap");
}
public void recordVideo(){
    System.out.println("Taking snap");
}
public String[] getNetworks(){
    System.out.println("Getting List of Networks");
    String[] networksList ={"rahul","pal","me"};
    return networksList;
}

    @Override
    public void ConnectNetworks(String network) {

    }

    public void connectToNetwork(){
    System.out.println("taking snap");
}
}
