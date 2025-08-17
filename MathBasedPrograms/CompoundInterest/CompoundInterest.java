package MathBasedPrograms.CompoundInterest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CompoundInterest {
    public static double calculateCompoundInterest(double principal, double rate, int time, int frequency) {
        double amount = principal * Math.pow(1 + (rate / (frequency * 100.0)), frequency * time);
        return amount - principal; // Compound Interest = Final Amount - Principal
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Principal Amount (P): ");
        double principal = Double.parseDouble(br.readLine());

        System.out.print("Enter Annual Interest Rate (R%): ");
        double rate = Double.parseDouble(br.readLine());

        System.out.print("Enter Time (in years): ");
        int time = Integer.parseInt(br.readLine());

        System.out.print("Enter Compounding Frequency per year: ");
        int frequency = Integer.parseInt(br.readLine());
       
        double compoundInterest = calculateCompoundInterest(principal, rate, time, frequency);

        System.out.println("Compound Interest: ₹%.2f\n"+ compoundInterest);

    }
}
