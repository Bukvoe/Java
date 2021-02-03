package by.belstu.it.kavrus.javabase;
import java.util.Random;
import static java.lang.Math.*; // Задание D

/*
* */
public class JavaTest {
    static int sint;
    // Задание C
    /** Варианты объявления констант*/
    final int ONE = 3;
    public final int TWO = 3;
    public static final int THREE = 3;

    // Задание А
    public static void main(String[] args) {
        // Задание B
        char someSymbol = '@';
        int someNumber = 64;
        short s_Number = 32;
        byte someByte = -128;
        long l_Number = Long.MAX_VALUE;
        double d_Number = Double.MIN_VALUE;
        boolean isTrue = true;
        String hello = "Hello World!";

        System.out.println(hello + someNumber);
        System.out.println(hello + someSymbol);
        System.out.println(hello + d_Number);
        System.out.println(hello + someNumber);
        someByte += someNumber;
        someNumber += d_Number;
        l_Number += someNumber + 2147483647;
        System.out.println(someByte);
        System.out.println(someNumber);
        System.out.println(l_Number);
        System.out.println(String.format("static variable without initialization %s", sint));


        isTrue = isTrue && isTrue;
        System.out.println(isTrue);
        isTrue = isTrue ^ isTrue;
        System.out.println(isTrue);
        char first = 'a';
        char second = '\u0061';
        char thrid = 97;

        System.out.println(first + second + thrid);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 % 0.0);
        System.out.println(0.0 % 0.0);
        System.out.println(log(-345));
        Float.intBitsToFloat(0x7F800000);
        Float.intBitsToFloat(0xFF800000);

        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(min(PI, E));
        System.out.println(min(PI, E));

        System.out.println(new Random().nextInt(1));

        // Задание E
        Boolean logic = true;
        Character symbol = 't';
        Integer number = 8000;
        Byte oneByte = 127;
        Short s_number = 4000;
        Long l_number = 16000L;
        Double d_number = 16000.0;

        number >>= 3;
        System.out.println(number);
        number &= s_number;
        System.out.println(number);
        d_number += oneByte;
        System.out.println(d_number);

        someNumber = new Integer(9);
        Integer packing_integer = 4;

        oneByte = new Byte((byte) 3);
        Byte packing_byte = 2;

        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.compare(3, -3));
        System.out.println(Integer.toString(123));
        System.out.println( Integer.bitCount(123));

        // Задание F
        String s34 = "2345";
        someNumber = Integer.parseInt(s34);


        byte[] arr = s34.getBytes();
        System.out.println(arr);
        hello = arr.toString();
        System.out.println(hello);

        String s1 = "string";
        String s2 = "string";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        s2 = null;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));

        hello = "hello world !";
        System.out.println(hello.split(" "));
        System.out.println(hello.contains("hello"));
        System.out.println(hello.hashCode());
        System.out.println(hello.indexOf('о'));
        System.out.println(hello.length());
        System.out.println(hello.replace("world", "BSTU"));

        // Задание G
        char[][] c1;
        char[] c2[] = {{'1', '2', '3'},{'4', '5', '6'}};
        char c3[][] = {
                {'f', 'i', 'r', 's', 't'},
                {'s', 'e', 'c', 'o', 'n', 'd'},
                {'t', 'h', 'i', 'r', 'd'}
        };

        c1 = new char[3][];
        boolean comRez = c2 == c3;
        c2 = c3;
        for(char[] word : c3)
        {
            System.out.println(word);
        }
        WrapperString securityModule = new WrapperString("anon. string") {
            @Override
            /* Замена символа на символ верхенего регистра*/
            public void replace (char oldChar, char newChar)
            {
                setLine(getLine().replace(oldChar, Character.toUpperCase(newChar)));
            }
            /* Очистка строки */
            public void delete ()
            {
                setLine("");
            }
        };
    }
}
