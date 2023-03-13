
//Tạo 2 luồng để in ra các số từ 1 đến 10000. Luồng thứ nhất sẽ in các số lẻ và luồng thứ hai sẽ in các số chẵn.
    class Thread1 implements Runnable{
        private String name;
        private int[] input;
        private int n, startIndex;

        Thread1(String name, int[] input, int n, int startIndex) {
            this.name = name;
            this.input = input;
            this.n = n;
            this.startIndex = startIndex;
        }
        @Override
        public void run() {

            for( int j = startIndex ; j<n ; j+=2){
                if ( this.input[j]%2 == 0){
                    System.out.println(this.name + "so chan : " + input[j]);
                }
                else {
                    System.out.println(this.name + "so le : " + input[j]);
                }
            }
        }
    }
    public class bai3 {
        public static  void main (String [] args){

            int[]input = new int[10001];
            int n = 10000;
            for( int i=0; i<=n; i++){
                input[i] = i + 1;
            }
            Thread1 thread1 = new Thread1("Thread-1 ", input, n,0);
            new Thread(thread1).start();

            Thread1 thread2 = new Thread1("Thread-2 ", input,n,1);
            new Thread(thread2).start();

        }
    }

