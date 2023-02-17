public class LabExam extends Exam {
    public LabExam(int marks, int day, int month, int year, int hour, int minutes) {
        super("Lab Exam", marks, day, month, year, hour, minutes);
    }

    @Override
    public String toString() {
        // return String.format("Exam: %s (%.2f marks)", typeExam, (double) marks);
        return String.format("Exam: %s (%.2f marks)%n%s", "Lab Exam",
                (double) getMarks(), getDateTime());
    }

}
