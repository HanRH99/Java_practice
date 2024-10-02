import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int kor=0, eng=0, math=0;
        int max=3;

        int kors[] = new int[max];
        int engs[] = new int[max];
        int maths[] = new int[max];

        int index = 0;

        Scanner scan = new Scanner(System.in);

        EXIT: while(true) {

            MainMenu menu;

//            final int INPUT_MENU = 1;
//            final int PRINT_MENU = 2;
//            final int EXIT_MENU = 3;

            System.out.println("┌───────────────────────────────────────┐");
            System.out.println("│                 메인ㅣ메뉴              │");
            System.out.println("└───────────────────────────────────────┘");
            System.out.print(" 1. 성적 입력\n");
            System.out.print(" 2. 성적 출력\n");
            System.out.print(" 3. 프로그램 종료\n");
            System.out.print(" 선택 >> \n");
            menu = MainMenu.values()[scan.nextInt()-1];

            switch(menu) {
                case INPUT: {

                    int more = 0;

                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("│                 성적ㅣ입력              │");
                    System.out.println("└───────────────────────────────────────┘");

                    do {
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

                        kors[index] = kor;
                        engs[index] = eng;
                        maths[index] = math;
                        index++;

                        System.out.println("─────────────────────────────────────────");

                        System.out.print("더 입력하시겠습니까?(1or0):");
                        more = scan.nextInt();
                    } while (more == 1);
                    break;
                }

                case PRINT: {
                    int total;
                    float avg;

                    System.out.println("┌───────────────────────────────────────┐");
                    System.out.println("│                 성적ㅣ출력              │");
                    System.out.println("└───────────────────────────────────────┘");

                    for (int i = 0; i < index; i++) {

                        kor = kors[i];
                        eng = engs[i];
                        math = maths[i];

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

                case END:
                    break EXIT;
                default:
                    System.out.println("입력이 잘못되었습니다. 입력 ... 다시 입력해주세요.");
            }
        }
    }
}