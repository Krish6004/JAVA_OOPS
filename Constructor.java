//class student {
//    String name;
//    int rollno;
//
//    // student() {
//    //     name = "Unknown";
//    //     rollno = 0;
//    // }
//
//    student(String name, int rollno) {
//        this.name = name;
//        this.rollno = rollno;
//    }
//    void display() {
//        System.out.println(name + " " + rollno);
//    }
//}
//
//public class Basic {
//    public static void main(String[] args) {
//        student s1= new student("Rahul", 1);
//        student s2 = new student("Raj", 2);
//        s1.display();
//        s2.display();
//    }




class basic{
    String name;
    int rollN;

    basic(String name, int rollN){
        this.name=name;
        this.rollN=rollN;
    }
    basic(basic s){
        name=s.name;
        rollN= s.rollN;
    }
    void display(){
        System.out.println(name+" "+ rollN);
    }

}
public class Constructor{
    public static void main(String[] args) {
        basic s1=new basic("Babe",1);
        basic s2=new basic(s1);
        s2.display();
    }
}
