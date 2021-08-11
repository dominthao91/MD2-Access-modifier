package BuildWriteOnlyClassesInJava;

public class Student {
    private String name = "Thảo";
    private  String classs = "C06h1";


    public String getName() {
        return name;
    }

    public String getClasss() {
        return classs;
    }
    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasss(String classes) {
        this.classs = classes;
    }

}
