
class MyMainEmployee{
    private int id;
    private String name;
    private int name1;

    public MyMainEmployee(int myID, int myid){
        id=myid;
        name1= myID;
        name= "Your name Here:";

    }
    public MyMainEmployee(String myname){
        name=myname;
    }

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
    public class cwh_42_Constructor{
        public static void main(String[] args) {
            MyMainEmployee JALAL= new MyMainEmployee(45,34);

        // JALAL.setName("JALAL KHAN ");
         //  JALAL.setId(23);
            System.out.println(JALAL.getName());
            System.out.println(JALAL.getId());
            System.out.println(JALAL.getId());


        }
    }
}