public class Lecturer extends Person{
    private String specialization;
    private double salary;
    public Lecturer(String specialization,double salary){
        this.salary=salary;
        this.specialization=specialization;
    }
    public String getSpecialization(){
        return specialization;
    }

    public double getSalary() {
        return salary;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        return "Lektori " + super.toString() + " me specializim ne " + specialization + " ka page " + salary;
    }
}
