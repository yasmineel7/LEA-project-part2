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
        return this.balance;
    }//calcul the new amount
    
   Money getCreditLimit() {
     return this.creditLimit;
    }

    String getPersonals() {
        return owner.toString();
    }

    void charge(Money FOURTH_AMOUNT){
      
       if (){
           System.out.println("Exceeds credit limit");
           
       }
       else {
           System.out.println("Charge" + FOURTH_AMOUNT);
           
       }
       } 
        
    void payment(Money THIRD_AMOUNT) {
     double total = balance - THIRD_AMOUNT;
        System.out.println("Payment: " + THIRD_AMOUNT);
      
    }

}  
 
