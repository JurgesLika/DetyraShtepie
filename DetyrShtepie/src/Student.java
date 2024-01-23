public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double studyPrice;
    public Student(String typeOfStudy,int yearOfStudy,double studyPrice){
        this.typeOfStudy=typeOfStudy;
        this.yearOfStudy=yearOfStudy;
        this.studyPrice=studyPrice;
    }
    public String getTypeOfStudy(){
        return typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public double getStudyPrice(){
        return studyPrice;
    }
    public void setTypeOfStudy(String typeOfStudy){
        this.typeOfStudy=typeOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setStudyPrice(double studyPrice) {
        this.studyPrice = studyPrice;
    }
    public String toString(){
        return " Studenti " + super.toString() + " studjon per " + typeOfStudy + " eshte ne vitin e " + yearOfStudy + " dhe paguan " + studyPrice + " euro ne vit.";
    }
}
