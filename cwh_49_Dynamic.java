import javax.swing.plaf.ToolBarUI;

class Phone{
    public void showTime(){
        System.out.println("ShowTime ... :");
    }
    public  void on (){
        System.out.println("Turning On Phone  :");
    }
}
class smartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music : ");
    }
    public void on(){
        System.out.println("Turning On SmartPhone  :");
    }
}


public class cwh_49_Dynamic {
    public static void main(String[] args) {
//     Phone obj = new Phone();
//     obj.on();
//     smartPhone techno= new smartPhone();
//     techno.on();
     Phone tecno18=new smartPhone();
     tecno18.on();
     tecno18.showTime();
     

    }
}
