public class Cwh_grade_Casting {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        //(deconding gadees back to origional)

        grade =(char) (grade-8 );
        System.out.println(grade);
    }
}
