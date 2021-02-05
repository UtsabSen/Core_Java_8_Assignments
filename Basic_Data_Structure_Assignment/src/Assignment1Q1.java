import java.util.Scanner;

public class Assignment1Q1 {
    public static boolean ArmstrongCheck(int num){
        int temp = num;
        int total = 0;
        while (num > 0){
            total += Math.pow((num % 10),3);
            num /= 10;
        }
        if(total == temp){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(ArmstrongCheck(num)){
            System.out.println("Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
