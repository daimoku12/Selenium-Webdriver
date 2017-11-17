package java_selfstudy;

public class This {
	
	This()
	{
	  System.out.println("hello a");
	}  

	This(int x)
	{  	
	  this();  //should be the first statement	
	  System.out.println(x);  
	}      

	public static void main(String args[]){  
		
	This a=new This(10);		  
   }
}  


