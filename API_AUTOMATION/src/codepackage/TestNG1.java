package codepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
@Test
public void a() {
	System.out.println("This is a method");
	
}
@BeforeTest
public void b() {
	System.out.println("This is a Beforetest method");

	
}
@BeforeSuite
public void c() {
	System.out.println("This is a BeforeSuite method");

	
}
@AfterMethod
public void d() {
	System.out.println("This is a After method");

	
}
@BeforeClass
public void e() {
	System.out.println("This is a BeforeClass method");

	
}
@AfterTest
public void f() {
	System.out.println("This is a AfterTest method");

	
}
@AfterClass
public void g() {
	System.out.println("This is a AfterClass method");

	
}
@AfterSuite
public void h() {
	System.out.println("This is a AfterSuite method");

	
}
@BeforeMethod
public void i() {
	System.out.println("This is a Beforemethod method");

	
}
@Test
public void j() {
	System.out.println("This is j method");
}


}