public class Operators {
    public static void main(String[] args) {
        /* Toan tu so hoc
        +, -, *, /, %
        ++, --
        +=, -=,*=
        /=,%=
         */

        int a = 10;
        int b = 3;


        System.out.println("a%b = " + a%b);
        System.out.println("a++ = " + ++a);
        System.out.println("a-- = " + --a);

        /* Toan tu so sanh
        ==, !=
        <, >
        >=, <=
        */

        System.out.println("(a == b) = " + (a==b));
        System.out.println("(a != b) = " + (a!=b));

        /* Phep toan ve logic
        && (AND)
        || (OR)
        ^ (XOR)
        ! (NOT)
        */

        boolean a1 = false;
        boolean b1 = true;

        boolean c1 = false;

        System.out.println("(a1 && b1) = " + (a1 && b1 && c1));
        System.out.println("(a1 || b1) = " + (a1 || b1));
        System.out.println("(a1 ^ b1) = " + (a1 ^ b1));
        System.out.println("(!a1) = " + (!a1));

    }
}
