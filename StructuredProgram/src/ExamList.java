import java.util.Scanner;

public class ExamList {
    private int index;
    private Exam[] exams;

    public static void input(ExamList list) {
        Exam[] exams = list.exams;
        int index = list.index;

        int more = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("│                 성적ㅣ입력              │");
            System.out.println("└───────────────────────────────────────┘");

            Exam.input(exams[index], index);

            index++;

            System.out.println("─────────────────────────────────────────");

            System.out.print("더 입력하시겠습니까?(1or0):");
            more = scan.nextInt();
        } while(more==1);

        list.index = index;
    }

    public static void print(ExamList list) {

        System.out.println("┌───────────────────────────────────────┐");
        System.out.println("│                 성적ㅣ출력              │");
        System.out.println("└───────────────────────────────────────┘");

        for(int i=0; i<list.index; i++) {
            Exam.print(list.exams[i], i);
        }
    }

    public static void init(ExamList list, Exam[] exams, int index) {
        list.index=index;
        list.exams=exams;
    }
}
