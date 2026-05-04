package CC.Collection;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String Name;
    private double gpa;

    public Student(String name, double gpa) {
        Name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}
