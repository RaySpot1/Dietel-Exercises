//oludare david
package chapterFour;

import java.util.Scanner;

public class PhoneNavigate {
    public static void main(String[] args) {
        String prompt = """
                1. PhoneBook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim Services
                14. Create Profile
                15. Mingle with others
                """;
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int select = scanner.nextInt();

        switch(select){
            case 1:
                System.out.println("PhoneBook Selected");
                prompt = """
                        1. Search
                        2. Service Nos.
                        3. Add Name
                        4. Erase
                        5. Edit
                        6. Assign Tone
                        7. Send bcard
                        8. Options
                        9. Speed Dials
                        10. Voice tags
                        """;
                System.out.println(prompt);
                int phoneBookOp = scanner.nextInt();
                switch (phoneBookOp){
                    case 1:
                        System.out.println("Search Selected");
                        break;
                    case 2:
                        System.out.println("Service Nos Selected");
                        break;
                    case 3:
                        System.out.println("Add Name Selected");
                        break;
                    case 4:
                        System.out.println("Erase Selected");
                        break;
                    case 5:
                        System.out.println("Edit Selected");
                        break;
                    case 6:
                        System.out.println("Assign Tone Selected");
                        break;
                    case 7:
                        System.out.println("Send bcard Selected");
                        break;
                    case 8:
                        System.out.println("Options Selected");
                        prompt = """
                                1. Type of View
                                2. Memory status
                                """;
                        System.out.println(prompt);
                        int ops = scanner.nextInt();
                        switch(ops){
                            case 1:
                                System.out.println("Type of view Selected");
                                break;
                            case 2:
                                System.out.println("Memory status Selected");
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                        break;
                    case 9:
                        System.out.println("Speed Dials Selected");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case 2:
                System.out.println("Messages Selected");
                prompt = """
                        1. Write Messages
                        2. Inbox
                        3. Outbox
                        4. Picture Message
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info Service
                        9. Voice Mailbox number
                        10. Service command editor
                        """;
                System.out.println(prompt);
                int msg = scanner.nextInt();
                switch (msg){
                    case 1:
                        System.out.println("Write Messages Selected");
                        break;
                    case 2:
                        System.out.println("Inbox Selected");
                        break;
                    case 3:
                        System.out.println("Outbox Selected");
                        break;
                    case 4:
                        System.out.println("Picture Message Selected");
                        break;
                    case 5:
                        System.out.println("Templates Selected");
                        break;
                    case 6:
                        System.out.println("Smileys Selected");
                        break;
                    case 7:
                        System.out.println("Message Settings Selected");
                        prompt = """
                                1. Set 1
                                2. Common
                                """;
                        System.out.println(prompt);
                        int ms = scanner.nextInt();
                        switch(ms){
                            case 1:
                                System.out.println("Set 1 Selected");
                                prompt = """
                                        1. Message Center Number
                                        2. Message sent as
                                        3. Message validity
                                        """;
                                System.out.println(prompt);
                                int set1 = scanner.nextInt();
                                switch (set1){
                                    case 1:
                                        System.out.println("Message Center Number Selected");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as Selected");
                                        break;
                                    case 3:
                                        System.out.println("Message validity Selected");
                                    default:
                                        System.out.println("Invalid!!!");
                                }
                                break;
                            case 2:
                                System.out.println("Common Selected");
                                prompt = """
                                        1. Delivery Options
                                        2. Reply Via same center
                                        3. Character support 
                                        """;
                                System.out.println(prompt);
                                int cs = scanner.nextInt();
                                switch(cs){
                                    case 1:
                                        System.out.println("Delivery options Selected");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same center Selected");
                                        break;
                                    case 3:
                                        System.out.println("Character support selected");
                                        break;
                                    default:
                                        System.out.println("Invalid!!!");
                                }
                                break;
                            case 8:
                                System.out.println("Info Service Selected");
                                break;
                            case 9:
                                System.out.println("Voice mailbox number Selected");
                                break;
                            case 10:
                                System.out.println("Service command editor Selected");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;
            case 3:
                System.out.println("Chat Selected");
                break;
            case 4:
                System.out.println("Call Register Selected");
                prompt = """
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call costs settings
                        8. Prepaid credit
                        """;
                System.out.println(prompt);
                int cr = scanner.nextInt();
                switch (cr){
                    case 1:
                        System.out.println("Missed calls Selected");
                        break;
                    case 2:
                        System.out.println("Received calls Selected");
                        break;
                    case 3:
                        System.out.println("Dialled numbers selected");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists Selected");
                        break;
                    case 5:
                        System.out.println("Show call duration selected");
                        prompt = """
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """;
                        System.out.println(prompt);
                        int scd = scanner.nextInt();
                        switch (scd){
                            case 1:
                                System.out.println("Last call duration Selected");
                                break;
                            case 2:
                                System.out.println("All calls' duration Selected");
                                break;
                            case 3:
                                System.out.println("Received calls' duration Selected");
                                break;
                            case 4:
                                System.out.println("Dialled calls' duration Selected");
                                break;
                            case 5:
                                System.out.println("Clear timers Selected");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 6:
                        System.out.println("Show call costs Selected");
                        prompt = """
                                1. Last call cost
                                2. All calls' cost
                                3. Clear counters
                                """;
                        System.out.println(prompt);
                        int scc = scanner.nextInt();
                        switch (scc){
                            case 1:
                                System.out.println("Last call costs Selected");
                                break;
                            case 2:
                                System.out.println("All calls' cost Selected");
                                break;
                            case 3:
                                System.out.println("Clear counters Selected");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 7:
                        System.out.println("Call costs settings");
                        prompt = """
                                1. Call cost limit
                                2. Show costs in
                                """;
                        System.out.println(prompt);
                        int cc = scanner.nextInt();
                        switch (cc){
                            case 1:
                                System.out.println("Call cost limit Selected");
                                break;
                            case 2:
                                System.out.println("Show costs in Selected");
                                break;
                            case 3:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                    default:
                        System.out.println("Invalid!!!");
                }
                break;
            case 5:
                System.out.println("Tones Selected");
                prompt = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert Tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """;
                System.out.println(prompt);
                int ts = scanner.nextInt();
                switch (ts){
                    case 1:
                        System.out.println("Ringing tone Selected");
                        break;
                    case 2:
                        System.out.println("Ringing volume Selected");
                        break;
                    case 3:
                        System.out.println("Incoming call alert Selected");
                        break;
                    case 4:
                        System.out.println("Composer Selected");
                        break;
                    case 5:
                        System.out.println("Message alert tone Selected");
                        break;
                    case 6:
                        System.out.println("Keypad tones Selected");
                        break;
                    case 7:
                        System.out.println("Warning and game tone Selected");
                        break;
                    case 8:
                        System.out.println("Vibrating alert Selected");
                        break;
                    case 9:
                        System.out.println("Screen saver Selected");
                        break;
                    default:
                        System.out.println("Invalid!!!");
                }
                break;
            case 6:
                System.out.println("Settings Selected");
                prompt = """
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        """;
                System.out.println(prompt);
                int ss = scanner.nextInt();
                switch (ss){
                    case 1:
                        System.out.println("Call settings Selected");
                        prompt = """
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                """;
                        System.out.println(prompt);
                        int cs = scanner.nextInt();
                        switch (cs){
                            case 1:
                                System.out.println("Automatic redial Selected");
                                break;
                            case 2:
                                System.out.println("Speed dialling Selected");
                                break;
                            case 3:
                                System.out.println("Call waiting options Selected");
                                break;
                            case 4:
                                System.out.println("Own number sending Selected");
                                break;
                            case 5:
                                System.out.println("Phone line in use Selected");
                                break;
                            case 6:
                                System.out.println("Automatic answer Selected");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 2:
                        System.out.println("Phone Settings Selected");
                        prompt = """
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                """;
                        System.out.println(prompt);
                        int ps = scanner.nextInt();
                        switch (ps){
                            case 1:
                                System.out.println("Language Selected");
                                break;
                            case 2:
                                System.out.println("Cell info display Selected");
                                break;
                            case 3:
                                System.out.println("Welcome note Selected");
                                break;
                            case 4:
                                System.out.println("Network selection Selected");
                                break;
                            case 5:
                                System.out.println("Lights Selected");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions Selected");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 3:
                        System.out.println("Security settings Selected");
                        prompt = """
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                """;
                        System.out.println(prompt);
                        int sss = scanner.nextInt();
                        switch (sss){
                            case 1:
                                System.out.println("PIN code request Selected");
                                break;
                            case 2:
                                System.out.println("Call barring service Selected");
                                break;
                            case 3:
                                System.out.println("Fixed dialling Selected");
                                break;
                            case 4:
                                System.out.println("Closed user group Selected");
                                break;
                            case 5:
                                System.out.println("Phone security Selected");
                                break;
                            case 6:
                                System.out.println("change access codes");
                                break;
                            default:
                                System.out.println("Invalid!!!");
                        }
                        break;
                    case 4:
                        System.out.println("Restore factory settings Selected");
                        break;
                    default:
                        System.out.println("Invalid!!!");
                }
                break;
            case 7:
                System.out.println("Call Divert Selected");
                break;
            case 8:
                System.out.println("Games Selected");
                break;
            case 9:
                System.out.println("Calculator Selected");
                break;
            case 10:
                System.out.println("Reminders Selected");
                break;
            case 11:
                System.out.println("Clock Selected");
                prompt = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date settings
                        4. Stopwatch
                        5. Countdown
                        6. Auto update of date and time 
                        """;
                System.out.println(prompt);
                int cs = scanner.nextInt();
                switch (cs){
                    case 1:
                        System.out.println("Alarm clock Selected");
                        break;
                    case 2:
                        System.out.println("Clock settings Selected");
                        break;
                    case 3:
                        System.out.println("Date settings Selected");
                        break;
                    case 4:
                        System.out.println("Stopwatch Selected");
                        break;
                    case 5:
                        System.out.println("Countdown Selected");
                        break;
                    case 6:
                        System.out.println("Auto update of date and time Selected");
                        break;
                    default:
                        System.out.println("Invalid!!!");
                }
                break;
            case 12:
                System.out.println("Profiles Selected");
                break;
            case 13:
                System.out.println("Sim Services Selected");
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}
