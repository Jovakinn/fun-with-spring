package aop.model.University;

public class Student {
    private String nameSurname;
    private Integer course;
    private Double averageGrade;

    public Student(String nameSurname, Integer course, Double averageGrade) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
