package codepackage;
public class Operators {
public static void main(String[] args) {
	int v = 5;
	int u = 6;
	int x = 7;
System.out.println(u<v && v<u + u++);
System.out.println(u);
u/=2;
System.out.println(u);
if (u!=v) {
	System.out.println("this");
	
}
	else {
		System.out.println("that");
	}
}

}