//FACTORIAL ON JAVA, ARGUMENT FROM CMD

class Factorial{
	static int factorial(int n){
		if(n>1)
			return (n*factorial(n-1));
		else
			return 1;
	}
	
	public static void main(String args[]){
		System.out.println(factorial(Integer.parseInt(args[0])));
	}
}
