class First
{
	static void myFun()
	{
		System.out.println("myFun of First method");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of First method");
	}
	
	//code
}

class Second extends First
{
	static void myFun()	//Method hiding
	{
		System.out.println("myFun of Second method");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second method");
	}
	
	//code
}

class MethodCalling

{
	public static void main(String args[])
	{
		First f = new Second();
		f.myFun();
		f.anotherFun();
	}
}
