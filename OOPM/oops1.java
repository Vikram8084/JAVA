class Pen{
    String color;
    String type; //ballpoint;gel
    public void write(){
        System.out.println("writing something");

    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age); 
    }
}
public class oops1{
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";
        
        pen1.printColor();

        pen2.printColor();


        pen1.write();
    }
}