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
    
    CreditCard (CreditCard s){
    
     this.owner = s.owner ;
     this.creditLimit = s.creditLimit;
     //have to pass it to zero and use the copy constructer in the money class
     
 }
    
    

    void CreditCard(Person owner, Money CREDIT_LIMIT) {
        return  owner && creditLimit; 
    }//credicard and credit limit
    
    Money getBalance() {
        return (this.balance);
    }//calcul the new amount
    
  

    void charge(Money FOURTH_AMOUNT){ 
        if (Money FOURTH_AMOUNT > this.creditLimit){
        return System.out.println("Exceeds credit limit"));
    }
        else 
        return getBalance();
    
    }

    Money payment(Money THIRD_AMOUNT) {
       return getBalance();

    }

    Money getCreditLimit(Money creditLimit) {
     return creditLimit;
    }

    Person getPersonals() {
        return owner;
    }
   
   
}
