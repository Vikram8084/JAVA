class Sbank{ 
 int id;//instance variable 
 String name; 
 static String Bname ="SBI";//static variable 
 Sbank(int i, String n) 
{ id = i; 
 name = n; 
 } 
 //method to display the values 
 void display () 
{ 
System.out.println(id+" "+name+ " "+Bname); 
} } 
 class Static1{ 
 public static void main(String args[]){ 
 Sbank s1 = new Sbank(101,"abc"); 
 Sbank s2 = new Sbank(102,"xyz"); 
 //we can change the college of all objects by the single line of code 
 s1.display(); 
 s2.display(); 
 } }