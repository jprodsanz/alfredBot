import java.util.Date;
import java.util.Calendar;

public class AlfredSays {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return 
        "Mr. Wayne... Things Always Get Worse Before They Get Better.";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guestGreeting = String.format("Hey there %s, master Wayne is not available at this time", name);
        return guestGreeting;

    }
    public String dateAnnouncement() {
        // YOUR CODE HERE 
        Date today = Calendar.getInstance().getTime();
        String dateAnnouncement = String.format("Attention! Today is %s.", today);
        return dateAnnouncement;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.indexOf("Alexis") > -1) {
            return 
            "Where do you find Robin";
    }
        if (conversation.indexOf("Alfred") > -1) {
            return 
            "Where is cat woman?";
    }
        return "These are all good questions";
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}
}




