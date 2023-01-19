public class Conditions {
    public static void main(String[] args) {

         /* Toan tu so sanh
        ==, !=
        <, >
        >=, <=
        */

        /* Phep toan ve logic
        && (AND)
        || (OR)
        ^ (XOR)
        ! (NOT)
        */

        int a;
        a = -10;
        if (a > 0) {
            System.out.println("So A > 0");
        }

        System.out.println("So A > 0");

        a = 10;
        if (a > 0) {
            System.out.println("So A > 0");
        } else {
            System.out.println("So A < 0");
        }

        System.out.println("So A > 0");

        a = -20;
        if (a > 0) {
            System.out.println("So A > 0");
        } else if (a > -15) {
            System.out.println("So A > -15");
        } else if (a == -20) {
            System.out.println("So A = -20");
        } else {
            System.out.println("So A rat be");
        }

        System.out.println("So A > 0");


        a = 11;
        switch (a) {
            case 10:
                System.out.println("A = 10");
                break;
            case 11:
                System.out.println("A = 11");
                break;
            default:
                System.out.println("A = default");
        }

        System.out.println("So A > 0");
    }
}
