package AirCondition;


import java.util.Scanner;

public class AirConditionDevice {
    public static void main(String[] args) {

    String acOnPrompt = """
            1 Turn on AC
            2 Turn off AC
            """;
        AirCon app = new AirCon("AC is On", "AC is Off", "AC Temperature is cold", "Increasing", "Decreasing", "Ac Temperature is Hot", "Increasing", "Decreasing");
        Scanner scanner = new Scanner(System.in);
        System.out.println(acOnPrompt);
        int userPick = scanner.nextInt();

        switch(userPick) {
            case 1:
                System.out.println(app.getAcOnStatus());

                System.out.println(" \n What do you want to do?");
                String tempPrompt = """
                        1. Increase Temperature
                        2. Reduce Temperature
                        3. Return to Main Menu
                        """;
                System.out.println(tempPrompt);
                int tempPick = scanner.nextInt();

                switch (tempPick) {
                    case 1:
                        System.out.println(app.getHotTemperatureStatus());

                        String hotPrompt = """
                                1. Increase Hot Temperature
                                2. Decrease Hot Temperature
                                3. Back
                                """;
                        System.out.println(hotPrompt);
                        int hotTemperatureSwitch = scanner.nextInt();
                        switch (hotTemperatureSwitch){
                            case 1:
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                break;
                            case 3: //todo recursive
                                System.out.println(tempPrompt);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println(app.getColdTemperatureStatus());
                        String coldPrompt = """
                                1. Increase Cold Temperature
                                2. Decrease Cold Temperature
                                3. Back
                                """;
                        System.out.println(coldPrompt);
                        int coldTempPick = scanner.nextInt();

                        switch (coldTempPick){
                            case 1:
                                System.out.println();
                                break;
                            case 2:
                                System.out.println();
                                break;
                            case 3:
                                System.out.println(tempPrompt);
                        }
                        break;
                }
                break;
            case 2:
                System.out.println(app.getAcOffStatus());
                break;
            default:
                System.exit(0);
        }

    }

    private static int sum(int multiple) {
        if(multiple > 0){
            return multiple + sum(multiple -1);
        } else{
            return 0;
        }
    }
}
