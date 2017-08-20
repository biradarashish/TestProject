package com.abst;

interface A
{  
	void a();  
	void b();  
	void c();
	void d();  
}  

interface K
{  
	void a();  
	void b();  
	void c();
	void d();  
}  

interface L
{  
	void a();  
	void b();  
	void c();
	void d();  
}  


abstract class B implements A,K,L
{  
	public void c()
	{
		System.out.println("I am C");
	}  
}  

class J{
	
}

class P{
	
}

class O{
	
}
  
class M extends B implements A,K
{  
	public void a()
	{
		System.out.println("I am a");
	}  

	public void b()
	{
		System.out.println("I am b");
	}  

	public void d()
	{
		System.out.println("I am d");
	}  
}

class N implements A{
	
	public void c()
	{
		System.out.println("I am c of N class");
	}
	
	public void a()
	{
		System.out.println("I am a of N class");
	}  

	public void b()
	{
		System.out.println("I am b of N class");
	}  

	public void d()
	{
		System.out.println("I am d of N class");
	}
}
  
class TestAbstraction3
{  
	public static void main(String args[])
	{  
		A a=new M();  
	//	B b = new B();
	//	A a = new N();
		a.a();  
		a.b();  
		a.c();  
		a.d();  
	}
}  
