import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double tax = 0;
        if(ctc < 1_80_000){
            tax = 0;
        } else if(ctc <= 3_00_000){
            tax = (ctc * 10) / 100.0;
        } else if (ctc <= 5_00_000){
            tax = (ctc * 20) / 100.0;
        } else if (ctc <= 10_00_000){
            tax = (ctc * 30) / 100.0;
        }
        return tax;
    }
}

public class Assignment1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctc = sc.nextInt();
        TaxAmount ob = new TaxAmount();
        System.out.println(ob.calculateTaxAmount(ctc));
    }
}
