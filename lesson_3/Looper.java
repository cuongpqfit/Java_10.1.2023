public class Looper {
    public static void main(String[] args) {

//        //For buoc nhay = 1
//        for(int i=0; i<10; i++) {
//            System.out.println(i);
//        }
//
//        for(int i=0; i<10; i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }
//
//        //For buoc nhay = 2
//        for(int i=0; i<10; i=i+2) {
//            System.out.println(i);
//        }
//
//        //For lui
//        for(int i=10; i>=0; i--) {
//            System.out.println(i);
//        }
//
//
//        for(int i=0; i<3; i=i+1) {
//            for (int j=0; j<3; j++) {
//                for (int k=0; k<3; k++) {
//                    System.out.print(i + j + " ");
//                }
//            }
//            System.out.println();
//        }


        int j = 1;
//        while (j<10) {
//            System.out.println("Hello");
//            j = j + 1;
//        }

        j = 1;
        do {
            for (int i=1; i<5; i++) {
                System.out.println("Hello");
                if (i == 2) break;
            }
            j = j + 1;
        } while (j<3);
    }
}
