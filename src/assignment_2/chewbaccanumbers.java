package assignment_2;


import java.util.*;

public class chewbaccanumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mul=1;
      
        while(n>0) {
        	long rem=n%10;
        	long min = Math.min(rem, 9-rem);
        	n=n/10;
        	if(n==0 && min==0) {
        		min=rem;
        	}
        	n+=min*mul;
        	mul*=10;
        	
        }
        System.out.println(n);
		// TODO Auto-generated method stub

	}

}
