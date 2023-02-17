public class ExamTest {
    public static void main(String[] args) {

        // Create Objects From Exam(Test Constructors)
        Exam exam1 = new Exam("Lab Exam");
        System.out.println(exam1);// call toString by default
        Exam exam2 = new Exam("Midterm Exam", 20);
        System.out.println(exam2);
        Exam exam3 = new Exam("Midterm Exam", 20, 26, 1, 2023);
        System.out.println(exam3);
        Exam exam4 = new Exam("Midterm Exam", 20, 26, 1, 2023, 8, 30);
        System.out.println(exam4);
        Exam exam5 = new Exam(exam4);
        System.out.println(exam5);
        Exam exam6 = new Exam("Final Exam", 100, 100, 100, -100, 7, 30);
        System.out.println(exam6);

        // Test set and get methods
        System.out.println(exam5.getDateTime().getDay());
        System.out.println(exam5.getDateTime().getMinutes());
        System.out.println(exam5.getTypeExam());
        exam5.setMarks(10);
        System.out.println(exam5.getMarks());
        System.out.println(exam5);
        // Test other Methods
        exam1.getDateTime().setDate(10, 2, 2022);
        exam1.getDateTime().setTime(12, 30);
        System.out.println(exam1);
        System.out.println(Exam.getExamStats());
        // New Testers
        MidtermExam exam40 = new MidtermExam(20, 26, 1, 2023, 8, 30);
        System.out.println(exam40);
        LabExam exam50 = new LabExam(20, 26, 1, 2023, 8, 30);
        System.out.println(exam50);
        FinalExam exam60 = new FinalExam(20, 26, 1, 2023, 8, 30);
        System.out.println(exam60);
    }
}
