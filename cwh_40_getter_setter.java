class MyEmployee{
    private int id;
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
//class myEmployee{
//    private int ID;
//    private String Name;
//
//
//    public void setName(String name) {
//        this.Name = name;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public int getID() {
//        return ID;
//    }
//}
//


public class cwh_40_getter_setter {
    public static void main(String[] args) {

        MyEmployee jalal=new MyEmployee();

//        myEmployee JALAL=new myEmployee();
//        JALAL.setID(345);
//        JALAL.setName("JALAL --KHAN :");
//        System.out.println(JALAL.getID());
//        System.out.println(JALAL.getName());
//        jalal.id=45;
//        jalal.name="JALAL KHAN :";
        //throw error-->
        jalal.setName("Jalal khan");
        jalal.setId(34);
        System.out.println(jalal.getId());
        System.out.println(jalal.getName());
    }

}
