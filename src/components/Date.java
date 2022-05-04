package components;

public class Date {
    private long day, month, year;

    public Date() {}

    public Date(long day, long month, long year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public long getDay() {
        return day;
    }

    public void setDay(long day) {
        this.day = day;
    }

    public long getMonth() {
        return month;
    }

    public void setMonth(long month) {
        this.month = month;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
}
