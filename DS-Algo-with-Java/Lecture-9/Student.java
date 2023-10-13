class Task{
    String name;
    int roll_no;
}


public class Student {
    public static void main(String[] args) {
        Task obj = new Task();
        obj.name = "John";
        obj.roll_no = 2;
        System.out.println("Name of student obj is: " + obj.name + " and roll number is: " + obj.roll_no);
    }
}
