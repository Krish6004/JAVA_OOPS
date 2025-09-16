package Package1;

 class s1 {
    protected String name = "Krish";
    protected int rollN = 69;

    void display(){
        System.out.println("Class Student");
    }
}

public class student {
    public static void main(String[] args) {
        s1 s = new s1();
        System.out.println(s.name);
        System.out.println(s.rollN);
    }
}