class Time{
    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else{
            System.out.println("Invalid time");
        }
    }

    public String toUniversal(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandart(){
        int h;
        String am_pm;

        if(hour < 12){
            am_pm = "AM";
        } else {
            am_pm = "PM";
        }

        if(hour == 0){
            h = 12;
        } else if(hour > 12){
            h = hour - 12;
        } else{
            h = hour;
        }

        return String.format("%02d:%02d:%02d %s", h, minute, second, am_pm);
    }

    public void add(Time t2){
        this.second += t2.second;
        this.minute += t2.minute + (this.second / 60);
        this.hour += t2.hour + (this.minute / 60);

        this.second %= 60;
        this.minute %= 60;
        this.hour %= 24;
    }
}


public class task_3 {
    public static void main(String[] args){
        Time t = new Time(23, 5, 6);
        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standart: " + t.toStandart());

        Time t2 = new Time(4, 24, 33);

        System.out.println("\n");
        
        t.add(t2);
        System.out.println("After final addition: " + t.toUniversal());
    }
}