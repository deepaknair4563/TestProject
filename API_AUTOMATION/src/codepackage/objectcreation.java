package codepackage;

public class objectcreation {
int b = 10;
static int c = 5;

public static void main(String[] args) {
	objectcreation o = new objectcreation();
	System.out.println(o.b);
	System.out.println(o.c);
	System.out.println(objectcreation.c);

}
}
