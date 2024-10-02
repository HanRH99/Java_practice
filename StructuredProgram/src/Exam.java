import java.util.Scanner;

public class Exam {
    int kor;
    int eng;
    int math;

    public static void  input(Exam exam, int index) {
        int kor, eng, math;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(" 국어:");
            kor = scan.nextInt();

            if (kor < 0 || kor > 100)
                System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요.");
        } while (kor < 0 || kor > 100);

        do {
            System.out.print(" 영어:");
            eng = scan.nextInt();

            if (eng < 0 || eng > 100)
                System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요.");
        } while (eng < 0 || eng > 100);

        do {
            System.out.print(" 수학:");
            math = scan.nextInt();

            if (math < 0 || math > 100)
                System.out.println("성적의 범위(0~100)를 벗어났습니다. 재입력하세요.");
        } while (math < 0 || math > 100);

        exam.kor = kor;
        exam.eng = eng;
        exam.math = math;
    }

    public static void print(Exam exam, int i) {
        int kor = exam.kor;
        int eng = exam.eng;
        int math = exam.math;

        int total;
        float avg;

        total = kor + eng + math;
        avg = total / 3.0f;

        System.out.printf(" 시험:%d\n---------------------------\n", i + 1);
        System.out.printf(" 국어:%d\n", kor);
        System.out.printf(" 영어:%d\n", eng);
        System.out.printf(" 수학:%d\n", math);
        System.out.printf(" 총점:%d\n", total);
        System.out.printf(" 평균:%2f\n", avg);
        System.out.println("─────────────────────────────────────────");
    }
}
