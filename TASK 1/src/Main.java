public class Main {
    public static void main(String[] args) {
        Course java = new Course("Java Programming", 40);
        Course database = new Course("Database Systems", 35);
        Course networking = new Course("Computer Networking", 30);
        java.displayCourseStatistics(34);
        database.displayCourseStatistics(28);
        networking.displayCourseStatistics(25);
    }
    }
