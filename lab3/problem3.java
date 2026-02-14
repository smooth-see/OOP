public class problem3 {
    private double tempValue;
    private char scale;

    problem3(){
        tempValue = 0;
        scale = 'C';
    }

    problem3(double tempValue){
        this.tempValue = tempValue;
        scale = 'C';
    }

    problem3(char scale){
        this.scale = scale;
        tempValue = 0;
    }

    problem3(double tempValue, char scale){
        this.tempValue = tempValue;
        this.scale = scale;
    }

    public double returnTempCel(){
        if(scale == 'C' || scale == 'c')return tempValue;
        return 5*(tempValue - 32)/9;
    }

    public double returnTempFar(){
        if(scale == 'F' || scale == 'f')return tempValue;
        return 9*(tempValue/5)+32;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemp(double tempValue){
        this.tempValue = tempValue;
    }

    public void setTempScale(char scale, double tempValue){
        this.scale = scale;
        this.tempValue = tempValue;
    }

    public char returnScale(){
        return scale;
    }

    public static void main(String[] args) {
        problem3 t = new problem3(98,'F');

        System.out.println(t.returnTempCel());
        System.out.println(t.returnScale());
    }

}