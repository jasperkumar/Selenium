package assigmentweek1;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int count =0;
		
for( int i=1;i<=num;i++)
		{
			if(num % i == 0){
			count=count+1;
			
		}
		
	}
	if(count==2){
	System.out.println("prime number");
	}
	else {
		System.out.println(" notprime number");
		
	}
	}
	
}