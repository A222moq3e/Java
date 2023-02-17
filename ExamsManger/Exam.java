// import java.sql.Date;

public class Exam {
    // Exam Date
    private DateTime dateTime;
    // Exam info
    private final String typeExam;
    private final int labCounterOrder = labCounter;
    private final int midCounterOrder = midCounter;
    private int marks;
    // Counters
    public static int labCounter;
    public static int midCounter;

    // first
    public Exam(String typeExam) {
        this(typeExam, 0, 0, 0, 0, 0, 0);

    }

    // second
    public Exam(String typeExam, int marks) {
        this(typeExam, marks, 0, 0, 0, 0, 0);

    }

    // third
    public Exam(String typeExam, int marks, int day, int month, int year) {
        this(typeExam, marks, day, month, year, 0, 0);

    }

    // fourth Main
    public Exam(String typeExam, int marks, int day, int month, int year, int hour, int minutes) {

        this.typeExam = typeExam;
        setMaxMarks(marks, typeExam);
        dateTime = new DateTime(day, month, year, hour, minutes);

    }

    // fifth
    public Exam(Exam exam) {
        this(exam.typeExam, exam.marks, exam.dateTime.getDay(), exam.dateTime.getMonth(), exam.dateTime.getYear(),
                exam.dateTime.getHour(), exam.dateTime.getMinutes());
    }

    // check date
    // public void setDay(int day) {
    // if (day < 1 || day > 31) {
    // this.day = -1;
    // } else {
    // this.day = day;
    // }
    // }

    // public void setMonth(int month) {
    // if (month < 1 || month > 12) {
    // this.month = -1;
    // } else {
    // this.month = month;
    // }
    // }

    // public void setYear(int year) {
    // if (year < 0) {
    // this.year = -1;
    // } else {
    // this.year = year;
    // }
    // }

    // public void setDate(int day, int month, int year) {
    // setDay(day);
    // setMonth(month);
    // setYear(year);
    // }

    // public void setTime(int hour, int minutes) {
    // setHour(hour);
    // setMinutes(minutes);
    // }

    public DateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setDateTime(int day, int month, int year, int hour, int minutes) {
        dateTime.setDay(day);
        dateTime.setMonth(month);
        dateTime.setYear(year);
        dateTime.setHour(hour);
        dateTime.setMinutes(minutes);
    }

    // public void setHour(int hour) {
    // this.hour = hour;
    // }

    // public void setMinutes(int minutes) {
    // this.minutes = minutes;
    // }

    public void setMaxMarks(int marks, String typeExam) {
        if (typeExam.equals("Lab Exam")) {
            checkCondition(5, 10, marks, 10);
            labCounter++;
        } else if (typeExam.equals("Midterm Exam")) {
            checkCondition(15, 20, marks, 20);
            midCounter++;
        } else if (typeExam.equals("Final Exam")) {
            checkCondition(30, 40, marks, 40);
        }

    }

    public void checkCondition(int min, int max, int marks, int defaultMark) {
        if (marks < min || marks > max) {
            this.marks = defaultMark;
        } else {
            this.marks = marks;
        }
    }

    // public int getDay() {
    // return this.day;
    // }

    // public int getMonth() {
    // return this.month;
    // }

    // public int getYear() {
    // return this.year;
    // }

    // public int getHour() {
    // return this.hour;
    // }

    // public int getMinutes() {
    // return this.minutes;
    // }

    public String getTypeExam() {
        return this.typeExam;
    }

    public int getLabCounterOrder() {
        return this.labCounterOrder;
    }

    public int getMidCounterOrder() {
        return this.midCounterOrder;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        // return String.format("Exam: %s (%.2f marks)", typeExam, (double) marks);
        return String.format("Exam: %s (%.2f marks)%n%s", typeExam, (double) marks, dateTime.toString());
    }

    public static String getExamStats() {
        return String.format("Lab Exam: %d exam(s)%nMidterm Exam: %d exams(s)", labCounter, midCounter);
    }
}