package day36lambda;

public class Course {

    /*
    Icinde
    1) private variable lar;
    2) Parametreli ve parametresiz constructorlar
    3) getterlar
    4) setterlar
    5) toString() methodu
    barindiran class lara "POJO" class denir ==> POJO (Plain Old Java Object)
     */

    private String season;
    private String courseName;
    private int avarageScore;
    private int numberOfStudents;

    public Course() {
    }

    public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }
}
