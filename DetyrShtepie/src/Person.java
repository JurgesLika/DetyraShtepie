public abstract class Person {
    private String name;
    private String adress;
    public Person(){
        this.adress="";
        this.name="";
    }
    public Person(String name,String adress){
        this.adress=adress;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getAdress(){
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString(){
        return name + "->" + adress;
    }
}
