package data;

import java.util.Objects;

public class Student {
    private String name;
    private int rollNO;
    private double cpi;

    public Student(String name, int rollNO, double cpi) {
        this.name = name;
        this.rollNO = rollNO;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNO=" + rollNO +
                ", cpi=" + cpi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNO == student.rollNO && Double.compare(student.cpi, cpi) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNO, cpi);
    }
}
