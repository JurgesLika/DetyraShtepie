public class Shape {
    private String color;
    private boolean isFilled;

    public Shape(){
        this.color="unknow";
        this.isFilled=false;
    }
    public Shape(String color,boolean isFilled){
        this.color=color;
        this.isFilled=isFilled;
    }
    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    public String toString(){
        String filledStatus;
        if (isFilled) {
            filledStatus = "Filled";
        } else {
            filledStatus = "NotFilled";
        }

        return "Shape with color of " + color + " and " + filledStatus;
    }
}
