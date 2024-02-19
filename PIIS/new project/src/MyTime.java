public class MyTime {
    private int seconds;
    private int minutes;
    private int hours;

    public MyTime(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public MyTime(int seconds)
    {
        this.hours = seconds / 3600;
        seconds -= this.hours*3600;
        this.minutes = seconds / 60;
        seconds -= this.minutes*60;
        this.seconds = seconds;
    }

    public int GetAllSeconds() {
        return seconds + minutes*60 + hours*3600;
    }

    public void PrintSeconds()  {
        System.out.println(GetAllSeconds());
    }

    public int CompareSeconds(MyTime time) {
        return GetAllSeconds() - time.GetAllSeconds();
    }
}
