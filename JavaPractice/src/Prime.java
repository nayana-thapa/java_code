import java.util.Scanner;
public class Prime {
    static boolean isPrime(int a){
        if(a<=3){
            return true;
        }
        for(int i = 2; i*i<=a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        }

    }

