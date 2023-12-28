public class cwh_15video_prt {
    public static void main(String[] args) {
        //Problem 01
        String name = "Jalal khan";
        name    = name.toLowerCase();
        System.out.println(name);
        name=name.toUpperCase();
        System.out.println(name);
        //Problem  2
        String text = "This is Jalal Khan Program :";
        text=text.replace(" ", "_");
        System.out.println(text);

        //Problem 04
        String letter= "Dear </Name/> Thanks alot :";
        letter=letter.replace("</Name/>", "JALAL KHAN");
        System.out.println(letter);

        //Problem 05
        String myLetter="This is me jalal  khan   .The One man Army  :";
        System.out.println(myLetter.indexOf(" "));
        System.out.println(myLetter.indexOf("  "));
        System.out.println(myLetter.indexOf("   "));

        //Problem 06
        String letter2= "Dear Jalal Khan, \n  Thanks alot for this.\n \t Nice! ";
        System.out.println(letter2);
    }
}
