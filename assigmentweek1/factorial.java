package assigmentweek1;

public class factorial {

	public static void main(String[] args) {

       
        
        int factorial = 1;
        for(int i = 1; i <= 5; i++)
        {
            factorial = factorial * i;
//            factorial *= i;
        }
        System.out.println(factorial);
    }
}