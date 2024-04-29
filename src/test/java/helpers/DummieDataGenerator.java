package helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DummieDataGenerator {

    public static String generateDummyEmail() {
        String dummyEmailPrefix = "dummiemail";
        String domain = "@fake.com";

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMddHHmmss");
        String datePart = dateFormat.format(new Date());

        String dummyEmail = dummyEmailPrefix + datePart + domain;

        return dummyEmail;
    }

    public static String generateDummieDNI() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddHHmmss");
        return dateFormat.format(new Date());
    }
}
