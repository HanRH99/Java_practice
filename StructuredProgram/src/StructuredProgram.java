import java.util.Scanner;

public class StructuredProgram {
    public static void main(String[] args) {
        int max=3;

        Exam[] exams = new Exam[3];

        exams[0] = new Exam();
        exams[1] = new Exam();
        exams[2] = new Exam();

        ExamList list = new ExamList();
        ExamList.init(list, exams, 0);
//        list.exams = exams;
//        list.index = 0;

        //int index=0;

        EXIT:while(true) {
            MainMenu menu = inputMenu();

            switch(menu) {
                case PRINT:
                    ExamList.print(list);
                    break;
                case INPUT:
                    ExamList.input(list);
                    break;
                case END:
                    break EXIT;
                default:
                    break;
            }
        }
    }

    public static MainMenu inputMenu() {
        Scanner scan = new Scanner(System.in);

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

        return menu;
    }

}