import java.util.Scanner;

class SiCi{
    public double simpleInterest(double principleAmount, int time, double interestRate){
        return ((principleAmount * time * interestRate) / 100);
    }

    public double compoundInterest(double principleAmount, int time, double interestRate){
        return ((principleAmount * Math.pow((1+interestRate),time)) - principleAmount);
    }

}

public class Assignment1Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principleAmount = sc.nextDouble();
        int time = sc.nextInt();
        double interestRate = sc.nextDouble();
        SiCi ob = new SiCi();

        System.out.println(ob.simpleInterest(principleAmount, time, interestRate));
        System.out.println(ob.compoundInterest(principleAmount, time, interestRate));
    }
}
