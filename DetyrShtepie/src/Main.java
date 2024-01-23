public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("red",true);
        shape1.setColor("blu");
        shape1.setFilled(false);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());



        //Task 2
        /*Student student1 = new Student("Informatik-Ekonomike",3,2000);
        student1.setName("Jurges");
        student1.setAdress("Ruga JORDAN MISJA");
        System.out.println(student1.toString());
        Lecturer lecturer = new Lecturer("informatik",2344);
        lecturer.setName("Alfred");
        System.out.println(lecturer.toString());*/
    }
}