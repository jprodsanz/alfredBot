public class AlfredTest {
    public static void main(String[] args) {
        // Make instance of AlfredSays to access all its methods 
        AlfredSays alfredBot = new AlfredSays();
        // Make some test greetings, provide any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Robin");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis(
            "Alexis! Can you locate Robin for us?"
        );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "Sure but I am not sure where"
        );
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Mr Wayne won't be too happy"
        );
        // Print the greetings to test... 
        System.out.println(testGreeting);
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}