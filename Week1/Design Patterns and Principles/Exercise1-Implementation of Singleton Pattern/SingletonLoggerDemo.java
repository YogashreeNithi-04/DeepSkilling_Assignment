public class SingletonLoggerDemo {

    
    static class Logger {
        private static Logger singleInstance;

        private Logger() {
            System.out.println(">> Logger instance has been initialized.");
        }

        public static Logger getInstance() {
            if (singleInstance == null) {
                singleInstance = new Logger();
            }
            return singleInstance;
        }

        public void log(String message) {
            System.out.println("[LOG] " + message);
        }
    }

    // Main method to test the singleton
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Running another task...");

        if (logger1 == logger2) {
            System.out.println("✔ Singleton works: both references are the same.");
        } else {
            System.out.println("✘ Singleton failed: different instances detected.");
        }
    }
}
