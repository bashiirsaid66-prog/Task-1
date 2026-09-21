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
        }
    }
}
