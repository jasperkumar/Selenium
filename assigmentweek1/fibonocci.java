package assigmentweek1;

public class fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, b = 1, c = 1;
		k=0;
		System.out.print("0,1,1,");
		while(k<=8) {
			k=b+c;
			System.out.print(k + ",");
			b=c;
			c=k;
			
		}
		
		

	}

}
