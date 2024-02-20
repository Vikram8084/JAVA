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
    Student(){
        System.out.println("constructor called");
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class oops2{
    public static void main(String args[]){
        Student s1=new Student("vikram",20);
        Student s2=new Student("chetan",22);
    

        s1.printInfo();
        s2.printInfo();

    }
}