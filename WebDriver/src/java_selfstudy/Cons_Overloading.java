package java_selfstudy;

public class Cons_Overloading {

int c;	
	
Cons_Overloading(int a, int b){
c = a+b;
System.out.println(c);
}

Cons_Overloading(){
System.out.println("Constructor overloading");	
}

public static void main(String[] args) {
		
Cons_Overloading obj = new Cons_Overloading(1,2);
Cons_Overloading obj1 = new Cons_Overloading();
}
}
