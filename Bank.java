package Session6;

//eg program
public class Bank {  
private float amount;   
  
void withdrawal(float amount) {  
this.amount -= amount;  

}  
  
void credit(float amount) {  
this.amount = amount;  

}  
  
float getAmount() {  
return amount;  
}  
  
public static void main(String[] args) {  
Bank b = new Bank();  
System.out.println("initial amount: "+b.getAmount());  
b.credit(9002020);  
System.out.println("amount after credit     "   +           b.getAmount());  
b.withdrawal(2020);  
System.out.println("amount after debit  "   +     
		b.getAmount()); 
  
}  
}  