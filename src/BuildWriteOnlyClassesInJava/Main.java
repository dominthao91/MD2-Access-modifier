package BuildWriteOnlyClassesInJava;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Default : ");
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasss() + "\n");
        System.out.println("Update : ");
        student.setName("John Wick");
        student.setClasss("C02");
        System.out.println("Name : " + student.getName());
        System.out.println("Class : " + student.getClasss() + "\n");
    }
}
