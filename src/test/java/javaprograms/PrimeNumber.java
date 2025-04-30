package javaprograms;

public class PrimeNumber {

        public static void primeRange(int low, int high) {
            while(low<high){
                boolean flag=false;
                for(int i=2;i<low/2;i++){
                    if (low%i==0) {
                        flag=true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.println(low +" ");
                }
                low++;
            }

        }
        public static void primeNumber( int num) {
            boolean flag=false;

            for(int i=2;i<=num/2;i++) {
                if(num %i==0) {
                    flag =true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(num + " is a prime number ");
            }
            else
                System.out.println(num+ "  not a prime number");
        }

        public static void main(String[] args) {
            int low=20;
            int high=50;
            primeRange(20, 50);

            primeNumber(14);

        }

    }


