package assigmentweek1;
public class armstrongnum {

	public static void main(String[] args)  {  
int n=153;rem,all,total=0
all=n;
while(n>0){
rem=n%10;
n=n/10;
total=total+(rem*rem*rem);
}
if(all==total)
System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   
	   }  
	}  