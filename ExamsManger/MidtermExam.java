/**
 * MidtermExam
 */
public class MidtermExam extends Exam {

    public MidtermExam(int marks, int day, int month, int year, int hour, int minutes) {
        super("Midterm Exam", marks, day, month, year, hour, minutes);
    }

    @Override
    public String toString() {
        // return String.format("Exam: %s (%.2f marks)", typeExam, (double) marks);
        return String.format("Exam: %s (%.2f marks)%n%s", "Midterm Exam",
                (double) getMarks(), getDateTime());
    }

}