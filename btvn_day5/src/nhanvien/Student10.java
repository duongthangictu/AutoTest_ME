package nhanvien;

public class Student10 {
    int id;
    String name;
 
    Student10(int id, String name) {
        this.id = id;
        this.name = name;
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        Student10 s1 = new Student10(111, "Viet");
        Student10 s2 = new Student10(222, "Nam");
        s1.display();
        s2.display();
    }
}