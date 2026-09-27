package Lec4;

public class checkprime_using_break {

	public static void main(String[] args) {
		int n=17;
		int c=0;
		
		for(int i=2; i<n ;i++)
		{
				if(n%i==0) {
					c++;
					break;
				} 
				
		}
		if(c>=1) {
			
			System.out.println("NOT PRIME");
			}else {
				System.out.println("NOT PRIME");
			}
		// TODO Auto-generated method stub

	}

}
