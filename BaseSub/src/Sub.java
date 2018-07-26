
 class Sub extends Base1{
	 int j,k;
	Sub()
	{}
	 Sub(int i)  				//parameterised constructor with 1 parameter
	 {
		 super(i);
		 System.out.println(i);
	 }
	 Sub(int j,int k)			//parameterised constructor with 2 parameters 
	 {
	 this.j=j;
	 this.k=k;
	 System.out.println(j);
	 System.out.println(k);
	 }
	

}
