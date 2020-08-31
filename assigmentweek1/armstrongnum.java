

package assigmentweek1;

public class armstrongnum {

	public static void main(String[] args)  {  
int rem,all,total=0 ;
int n=153;
all=n;
while(n>0){
rem=n%10;//3 then 5
n=n/10;//15 1 
total=total+(rem*rem*rem);
}
if(all==total)
System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}  