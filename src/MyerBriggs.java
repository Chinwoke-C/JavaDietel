import java.util.Scanner;

public class MyerBriggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] personalities = {"ESTJ", "ENTJ", "ENFJ","ISTJ","ISFJ","INTJ","INFJ","ESTP","ENTP","ENFP","ISTP","ISFP","INTP","INFP"};
         int questionNumber = 1;
        System.out.println("Enter your name");
            String name = input.next();
        System.out.println("Your choices as follows");
        System.out.printf("|%5s | %3s |%3s |%3s %3s |%3s |%3s %3s |%3s |%3s %3s |%3s |%n", " ", "A","B"," ", "A","B"," ", "A","B"," ", "A","B");


        int numbering = 1;
        System.out.printf("%s%n", "_".repeat(74));




            String[] introVsExtrovertTest = {"""
            A. active, initiate.      B. reflective, deliberate.
            A. organised, orderly.     B. flexible, adaptable.
            A. candid, straight forward, frank    B. tactful, kind, encouraging.
            A. logical, thinking, questioning    B. empathetic, feeling, accommodating.
            A. facts, things, "what is",        B. ideas, dreams, "what could be", philosophical.
            """
            };

            String[] intuitionTest = {"""
                A. interpret literally.    B. look for meaning and possibilities.
                A. Practical, realistic, experiential.  B. imaginative, innovative, theoretical.
                A. standard, usual, conventional.    B. different, novel, unique.
                A. focus on "here-and-now"           B. look to the future, global perspective, "big-picture".
                A. regulated, structured.            B. easygoing, "live" and "let-live".
               
                """
            };
            String[] thinkingTest = {"""
                    A. firm, tend to criticise, hold the line.   B. gentle, tend to appreciate, conciliate.
                    A. tough minded, just.     B.tender-hearted, merciful.
                    A. matter of fact, issue-oriented B. sensitive, people-oriented, compassionate.
                    A. external, communicative, express yourself.  B. internal, reticent, keep to yourself.
                    A.more outgoing, think out loud.                B. more reserved, think to yourself.
                                      
                    """
            };
            String[] judgingTest = {"""
               A. plan, schedule  B. unplanned spontaneous.
               A. preparation, plan ahead.  B. go with the flow, adapt as you go.
               A. control govern          B. latitude, freedom.
               A. seek many tasks, public activities.  B. seek private solitary activities with quiet to concentrate.
               A. expend energy, enjoy groups. B. conserve energy, enjoy one-on-one.
                """
            };

            int [] introVsExtrovertAnswer = new int[5];
            int [] intuitionAnswer = new int[5];
            int[] thinkingAnswer = new int[5];
            int [] judgingAnswer = new int [5];

            StringBuilder result = new StringBuilder();


                iterate(introVsExtrovertTest,introVsExtrovertAnswer);
                iterate(intuitionTest, intuitionAnswer);
                iterate(thinkingTest,thinkingAnswer);
                iterate(judgingTest,judgingAnswer);

                int sumOfIntroExtrovert = sum(introVsExtrovertAnswer);
                int sumOfIntuition = sum(intuitionAnswer);
                int sumOfThinking = sum(thinkingAnswer);
                int sumOfJudging = sum(judgingAnswer);

                if (sumOfIntroExtrovert < 3) result.append("I");
                else {
                    result.append("E");
                }
                if (sumOfIntuition < 3)result.append("N");
                else {
                    result.append("S");
                }
                if (sumOfThinking < 3) result.append("F");
                else {
                    result.append("T");
                }
                if (sumOfJudging < 3) result.append("P");
                else{
                    result.append("J");
                }
        for (int i = 0; i < introVsExtrovertAnswer.length ; i++) {
            System.out.printf("\"|%5d | %3s |%3s |%3d %3s |%3s |%3d %3s |%3s |%3d %3s |%3s |%n", numbering++,
                    placeCheckmark(introVsExtrovertAnswer[i],1),
                    placeCheckmark(introVsExtrovertAnswer[i],2),
            numbering++, placeCheckmark(intuitionAnswer[i],1),
            placeCheckmark(intuitionAnswer[i],2),
            numbering++,
            placeCheckmark(thinkingAnswer[i],1),
            placeCheckmark(thinkingAnswer[i],2),
            numbering++,
            placeCheckmark(judgingAnswer[i],1),
            placeCheckmark(judgingAnswer[i],2)
            );

        }
        System.out.printf("|%5d | %3s |%3s |%3d %3s |%3s |%3d %3s |%3s |%3d %3s |%3s |%n", "TOTAL",countNumbers(introVsExtrovertAnswer,1),
              countNumbers(introVsExtrovertAnswer,0),
                " ",countNumbers(intuitionAnswer,1),countNumbers(intuitionAnswer,0),
                " ",countNumbers(thinkingAnswer,1), countNumbers(thinkingAnswer,0),
                " ",countNumbers(judgingAnswer,1), countNumbers(judgingAnswer,0)
        );
        System.out.printf("%s%n", "-".repeat(74));
        System.out.printf("|%5s | %3s |%3s |%3s %3s |%3s |%3s %3s |%3s |%3s %3s |%3s |%n", " ", "E", "I"," ", "S", "N", " ", "T", "F", " ", "J", "P");



    }

    private static int sum(int[] arrays) {
        int sum = 0;
        for (int number = 0; number < arrays.length ; number++) {
            sum += number;

        }
        return sum;
    }

    private static int countNumbers(int[] numArray, int number) {
        int count = 0;
        for (int num:numArray) {
            if (num == number) count++;
        }
        return count;
    }

    private static String placeCheckmark(int num, int position) {
        return (num == 1 && position == 1) || (num == 0 && position == 2) ? String.format("%c", '\u2713'): "";
    }

    private static void iterate(String[] questions, int[] answers) {
        Scanner input = new Scanner(System.in);
        int questionNumber = 1;
        String optionAorB;
        for (int number = 0; number < questions.length ; number++) {
            System.out.printf("Question %d%n", questionNumber++);
            System.out.println("Enter A or B");
            optionAorB = getOption(input);
            if ((optionAorB.equalsIgnoreCase("A"))){
                answers[number] = 1;
            }

        }
    }

    private static String getOption(Scanner input) {
        String option;
        while (true){
            try {
                option = input.nextLine();
                if (option.trim().equalsIgnoreCase("A".trim())||option.trim().equalsIgnoreCase("B".trim())){
                    return option;
                }else {
                    throw new IllegalArgumentException("Wrong choice; choose A or B");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
