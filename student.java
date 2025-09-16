//class stu {
//    String name;
//    int rollN;
//
//    stu(String name, int rollN){
//        this.name=name;
//    }
//
//    void read(){
//        System.out.println("Reading");
//    }
//    void write(){
//        System.out.println();
//    }
//}
//
//public class student {
//    public static void main(String[] args) {
//        stu s1 = new stu("Krish",1);
//        s1.read();
//        s1.write();
//    }
//}

class student1{
  private   String name;
  private   int rollN;
  private   int marks;

    student1(String name, int rollN, int marks){
        this.name=name;
        this.rollN=rollN;
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks=marks;
            System.out.println("Marks updated");
        }
        else{
            System.out.println("Invslid marks");
        }
    }

    void display(){
        System.out.println("name:"+name+" "+"rollNo.:"+rollN+" "+"marks:"+marks);
    }
}
public class student{
    public static void main(String[] args) {
        student1 s1 = new student1("Krish",1 ,90);
        System.out.println(s1.getMarks());
        s1.display();
        s1.setMarks(69);
        System.out.println(s1.getMarks());
        s1.display();
    }
}