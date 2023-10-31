import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToStringConversion {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();

        // Create a SimpleDateFormat object with the desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Use the SimpleDateFormat to format the date as a string
        String formattedDate = dateFormat.format(date);

        // Display the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }
}

