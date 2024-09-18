class FibTester{
  void fib(int n){ 
	int n1=0,n2=1,i;
	for(i=2; i<=n; i++){
		System.out.println(n1+" " );
		int n3=n2+n1;
		n1=n2;
		n2=n3;
	}
  }
}
class fibonacci{
	public static void main(String args[]){
		 FibTester f=new FibTester();
		f.fib(10);
	}
}
