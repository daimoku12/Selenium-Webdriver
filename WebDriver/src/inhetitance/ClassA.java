package inhetitance;

//Only 'non static' class members can be inherited 

/* 3 types of inheritance
 - Single (ClassB extends ClassA)
 - Multilevel (ClassB extends ClassA, ClassC extends ClassB)
 - Multiple Inheritance (Java doesn't support directly)(ClassB extends ClassA and ClassB extends ClassC)*/

//In multilevel Inheritance, priority is given to Child class over Parent class if the both the classes have same variables/methods  

public class ClassA {

int a=10;
int b=20;
public void add(){
System.out.println(a+b);	
}
	
public static void main(String[] args) {

ClassA objA = new ClassA();
System.out.println(objA.a);//10
objA.add();//30
 }
}
