//CHECKING IF PRIME OR NOT

class Prime_or_not{
	public static void prime_or_not(int arg)
		{
			int m=0;
			for(int i=1;i<=arg;i++)
			{
				if(arg%i==0)
					m++;
			}
			if(m==1)
			System.out.println("number is unitary");
			else if(m==2)
			System.out.println("number is prime");
			else
			System.out.println("number is composite");
		}
	public static void main(String args[]){
		prime_or_not(Integer.parseInt(args[0]));
	}
}
