class StarTriangle{
    private int width;

    public StarTriangle(int width){
            this.width = width;
    }

    public String toString(){
        StringBuilder triangle = new StringBuilder();

        for(int i = 1; i <= width; i++){
            for(int j = 0; j < i; j++){
                triangle.append("[*]");
            }
            triangle.append("\n");
        }
        return triangle.toString();
    }
}



public class task_2{
    public static void main(String[] args){
        StarTriangle small = new StarTriangle (3);

        System.out. println (small.toString ());
    }
}