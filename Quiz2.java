import java.util.*;

public class Interest {
    
    private double total;
    private double payment;
    
    public double compound(double rate, double length, double amount) {
        
        total = amount;
        
        for (int i = 0; i < length; i++){
            
            total = total * (1 + rate);
            
        }
        
        System.out.println("The total interest is $" + (total - amount));
        return total - amount;
        
    }
    
    public double Payment(double length) {
        
        payment = total/length;
        System.out.println("Your monthly payments are $" + payment);
        return payment;
        
    }
}
