package ru.mirea.lab6;

public class Student implements Comparable<Student> {

    private String name;
    private String Surname;
    private int finalScore;
    private SortingStudentsByGPA sortingByGPA = new SortingStudentsByGPA();

    public Student(String name, String surname, int finalScore) {
        this.name = name;
        Surname = surname;
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public SortingStudentsByGPA getSortingByGPA() {
        return sortingByGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", finalScore=" + finalScore +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (finalScore == o.finalScore) {
            return 0;
        } else if (finalScore > o.finalScore) {
            return 1;
        } else {
            return -1;
        }
    }
}
