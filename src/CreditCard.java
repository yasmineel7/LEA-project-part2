/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
/**
 *
 * @author yasmi
 */
public class CreditCard {
    private  Money balance;
    private Money creditLimit;
    private Person owner;
    
    public CreditCard (Person t , Money r){
     
     this.owner = t ;
     this.creditLimit = r;
     this.balance = new Money(0); 
     //have to pass it to zero and use the copy constructer in the money class
     
 }
    Money getBalance() {
        return new Money(balance);
    }//calcul the new amount
    
   Money getCreditLimit() {
     return new Money(creditLimit);
    }

    String getPersonals() {
        return owner.toString();
    }

    boolean charge(Money FOURTH_AMOUNT){
        Money newbalance = balance.add(FOURTH_AMOUNT);
       if (newbalance.compareTo(creditLimit) > 0){
           System.out.println("Exceeds credit limit");
           return false;
       }
       else {
           balance = newbalance;
           System.out.println("Charge: " + FOURTH_AMOUNT);
           return true;
       }
       } 
        
   public  void payment(Money THIRD_AMOUNT) {
     Money newbalance = balance.subtract(THIRD_AMOUNT);
     balance = newbalance;
        System.out.println("Payment: " + THIRD_AMOUNT);
      
    }

}  
 
