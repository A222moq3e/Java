public class FinalExam extends Exam {
    // Final Exam
    public FinalExam(int marks, int day, int month, int year, int hour, int minutes) {
        super("Final Exam", marks, day, month, year, hour, minutes);
    }

    @Override
    public String toString() {
        // return String.format("Exam: %s (%.2f marks)", typeExam, (double) marks);
        return String.format("Exam: %s (%.2f marks)%n%s", "Final Exam",
                (double) getMarks(), getDateTime());
    }
}
