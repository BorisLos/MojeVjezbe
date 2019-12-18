package Vjezbe;

public class ZbrojSviSto {

	public static void main(String[] args) {
		
		int sum=0, su=0 , c=0;
		for(int i=0; i<100; i++) {
			c++;
			su+=i;
			sum=c+su;
			System.out.println((c) +" + "+ (su) +" = "+ (sum));
		}
System.out.println(sum);
	}

}
