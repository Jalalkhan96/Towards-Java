class employe{
        int id;
        int salary;
        String name;
        public void showDetailsInfo(){
            System.out.println("My Name is :" +name);
            System.out.println("My id is :" +id);
            System.out.println("my salary is: "+salary);
        }
    public int getSalary() {
        return salary;
    }
    }

    public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class :");
        employe jalal= new employe();
        jalal.id=12;
        jalal.salary=45;
        jalal.name="Jalal_khan";
        jalal.showDetailsInfo();
        int jalalSalary = jalal.getSalary();
        System.out.println("Salary retrieved using getSalary: " + jalalSalary);


    }
}