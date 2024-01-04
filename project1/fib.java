class Main{
	public static void main(String[] args){
		int n=10;
		int a=1,b=1,temp=0;
		while(n-->0){
			temp=b;
			b=a+b;
			a=temp;
		}
		System.out.println("fib of 10 is"+b);
	}
}

