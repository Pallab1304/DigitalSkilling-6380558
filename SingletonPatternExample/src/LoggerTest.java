public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second");

        if (logger1 == logger2) {
            System.out.println("One instance of Logger.");
        } else {
            System.out.println("Different instances of Logger.");
        }
    }
}

