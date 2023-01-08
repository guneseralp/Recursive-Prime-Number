import java.util.Scanner;

public class Main {

    static boolean isPrime(int n,int i){
        if(n <= 2){
            return (n == 2);
        }else if(n % i == 0){
            return false;
        }else if(i * i > n){
            return true;
        }
        return isPrime(n,i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Sayıyı giriniz: ");
        int number = input.nextInt();

        if(isPrime(number,2)){
            System.out.print(number + " Sayısı asaldır.");
        }else{
            System.out.print(number + " Sayısı asal değildir.");
        }
    }
}