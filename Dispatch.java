//Name: Bhagwat Biradar, Class: SY- 1, Roll No.: 44.
//Program To Implement Dynamic Method Dispatch:

class A {
	void Callme() {
		System.out.println("Inside A's Callme Method.");
	}
}
class B extends A {
	void Callme() {
		System.out.println("Inside B's Callme Method.");
	}
}
class C extends A {
	void Callme() {
		System.out.println("Inside 's Callme Method.");
	}
}
class Dispatch {
	public static void main(String[] abcd) {
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		r = a;
		r.Callme();
		r = b;
		r.Callme();
		r = c;
		r.Callme();
	}
}

/*
Output:

D:\44 BB>javac Dispatch.java

D:\44 BB>java Dispatch
Inside A's Callme Method.
Inside B's Callme Method.
Inside 's Callme Method.
*/