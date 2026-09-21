public class Course {
    private String courseName;
    private int numberOfStudents;
    private static int totalStudents = 0;

    public Course(String courseName, int numberOfStudents) {
        this.courseName = courseName;
        this.numberOfStudents = numberOfStudents;

        totalStudents += numberOfStudents;
        public double calculatePassPercentage ( int passedStudents){
            double passPercentage;
            passPercentage = ((double) passedStudents / numberOfStudents) * 100;
            return passPercentage;
            public void displayCourseStatistics ( int passedStudents){

                double passPercentage = calculatePassPercentage(passedStudents);

                System.out.println("Course: " + courseName);
                System.out.println("Registered Students: " + numberOfStudents);
                System.out.println("Pass Percentage: " + passPercentage + "%");
                System.out.println();
                public static int getTotalStudents () {
                    return totalStudents;
                }
            }
        }
    }
}
