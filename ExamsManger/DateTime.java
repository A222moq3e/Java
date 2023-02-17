public class DateTime {
    // Exam Date
    private int day, month, year;
    // Exam Hour
    private int hour, minutes;

    public DateTime() {
    }

    public DateTime(int day, int month, int year, int hour, int minutes) {
        setDate(day, month, year);
        this.hour = hour;
        this.minutes = minutes;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setTime(int hour, int minutes) {
        setHour(hour);
        setMinutes(minutes);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        System.out.println(day);
        if (day < 1 || day > 31) {
            this.day = -1;
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = -1;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (year < 0) {
            this.year = -1;
        } else {
            this.year = year;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return String.format("Date: %d/%d/%d%nTime: %02d:%02d", getDay(),
                getMonth(), getYear(), getHour(), getMinutes());
    }

}
