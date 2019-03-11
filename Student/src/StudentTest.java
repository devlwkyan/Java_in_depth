import java.math.BigDecimal;

public class StudentTest {
    private static void Stud(){
        Students s = new Students();
        s.id = 123456;
        s.gender = "male";
        s.name = "Çokian";

        System.out.println(s.id + " " + s.gender + " " + s.name);
        s.updateName( "Lucas" );
        System.out.println(s.id + " " + s.gender + " " + s.name);
    }

    private static void Numberrs(){
        System.out.println("Fucking primitives\n");
        int intHex = 0x0041;
        int intBinary = 0b01000001;
        int intUnderscore = 1_23_456;
        System.out.printf("IntHex: %s", intHex);
        System.out.printf( "\nintBinary: %s", intBinary );
        System.out.printf( "\nintUnderscore: %s", intUnderscore );

        char charA = 'A', charInt = 65, charUnidoe1 = '\u0041', charUnicode2 = 0x41, charBinary = 0b01000001;
        int intChar = 'A';

        System.out.printf( "\n\nCharA: %s, \nCharInt: %s \nCharUnicode1: %s \nCharUnicode2: %s \ncharBinary: %s \nIntchar: %s", charA, charInt, charUnidoe1, charUnicode2, charBinary, intChar );
    }









    public static void main( String[] args ) {
//        Stud();
        Numberrs();
    }
}
