package chapterTen;

import java.util.Scanner;

public class MyerBriggs {
    private int totalHays = 0;
    private  int totalBees = 0;




    String[] questions = {
            "Question 1: a. expend energy, enjoy groups or b. conserve energy, enjoy one-on-one",
            "Question 2: a. interpret literally or b. look for meaning and possibilities",
            "Question 3: a. logical, thinking, questioning or b. empathetic, feeling, accommodating",
            "Question 4: a. organized, orderly or b. flexible, adaptable",
            "Question 5: a. more outgoing, think out loud or b. more reserved, think to yourself",
            "Question 6: a. practical, realistic, experiential or b. imaginative, innovative, theoretical",
            "Question 7: a. candid, straight forward, frank or b. tactful, kind, encouraging",
            "Question 8: a. plan, schedule or b. unplanned, spontaneous",
            "Question 9: a. seek many tasks, public activities, interaction with others\nb. seek private, solitary activities with quiet to concentrate",
            "Question 10: standard, usual, conventional or b. different, novel, unique",
            "Question 11: a. firm, tend to criticize, hold the line or b. gentle, tend to appreciate, conciliate",
            "Question 12: a. regulated, structured or b. easygoing, 'live' and 'let live'",
            "Question 13: a. external, communicative, express yourself or b. internal, reticent, keep to yourself",
            "Question 14: a. focus on here-and-now or b. look to the future, global perspective, 'big picture'",
            "Question 15: a. tough-minded, just or b. tender-hearted, merciful",
            "Question 16: a. preparation, plan ahead or b. go with the flow, adapt as you go",
            "Question 17: a. active, initiate or b. reflective, deliberate",
            "Question 18: a. facts, things, “what is” or b. ideas, dreams, “what could be,” philosophical",
            "Question 19: a. matter of fact, issue-oriented or b. sensitive, people-oriented, compassionate",
            "Question 20: a. control, govern or b. latitude, freedom"
    };

    private static Scanner scanner = new Scanner(System.in);

    public void introvertExtrovertUsers(){

        int introvertCounter = 0;
        int extrovertCounter = 0;
        for (int i = 0; i < questions.length; i += 4) {
//            Scanner scanner = new Scanner(System.in);
            System.out.println(questions[i]);
            String input = scanner.nextLine();

            if(!input.equals("a") && !input.equals("b")){
                System.out.println("Wrong input");
                input = scanner.nextLine();
            }

            if(input.equals("a")){
                extrovertCounter++;
            }else if (input.equals("b")){
                introvertCounter++;
            }

        }

        if(introvertCounter > extrovertCounter){
            System.out.println("User is an Introvert");
        } else{
            System.out.println("User is an Extrovert");
        }
        System.out.println("");
    }


    public void sensitiveIntuitiveUsers(){
        int sensitiveCounter = 0;
        int intuitiveCounter = 0;

        for (int i = 1; i < questions.length; i += 4) {
            System.out.println(questions[i]);
            String input = scanner.nextLine();

            if(!input.equals("a") && !input.equals("b")){
                System.out.println("Wrong input");
                input = scanner.nextLine();
            }

            if(input.equals("a")){
                intuitiveCounter++;
            }else if (input.equals("b")){
                sensitiveCounter++;
            }

        }

        if(sensitiveCounter > intuitiveCounter){
            System.out.println("User is Sensitive");
        } else{
            System.out.println("User is an Intuitive Person");
        }
        System.out.println("");
    }

    public void thinkingFeelingUsers(){
        int thinkerCounter = 0;
        int feelingsCounter = 0;

        for (int i = 2; i < questions.length; i += 4) {
            System.out.println(questions[i]);
            String input = scanner.nextLine();

            if(!input.equals("a") && !input.equals("b")){
                System.out.println("Wrong input");
                input = scanner.nextLine();
            }

            if(input.equals("a")){
                feelingsCounter++;
            }else if (input.equals("b")){
                thinkerCounter++;
            }

        }

        if(thinkerCounter > feelingsCounter){
            System.out.println("User is good at Thinking");
        } else{
            System.out.println("User has a good sense of Feelings");
        }
    }

    public void judgingPerspectiveUser(){
        int judgingCounter = 0;
        int perspectiveCounter = 0;

        for(int i = 3; i < questions.length; i += 4){
            System.out.println(questions[i]);
            String input = scanner.nextLine();

            if(!input.equals("a") && !input.equals("b")){
                System.out.println("Wrong Input!!!");
            }

            if(input.equals("a")){
                judgingCounter++;
            }else if(input.equals("b")){
                perspectiveCounter++;
            }
        }

        if(judgingCounter > perspectiveCounter){
            System.out.println("User has a good Judging character");
        }else{
            System.out.println("User has a good Perspective");
        }


    }
}
