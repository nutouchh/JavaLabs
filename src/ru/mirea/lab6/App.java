package ru.mirea.lab6;

public class App {
    private static int separation(Student[] arr, int left, int right) {
        Student pivot = arr[right];
        int wall = (left - 1);

        Student temp;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j].getSortingByGPA().compare(arr[j], pivot) != 1) {
                wall++;
                temp = arr[wall];
                arr[wall] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[wall + 1];
        arr[wall + 1] = arr[right];
        arr[right] = temp;
        return (wall + 1);
    }

    public static void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int pivot = separation(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Anna", "Ivanova", 106);
        students[1] = new Student("Kate", "Petrova", 25);
        students[2] = new Student("Olga", "Mukhina", 34);
        students[3] = new Student("Sasha", "Qwerty", 120);
        students[4] = new Student("Petya", "Popppp", 99);
        students[5] = new Student("Vasya", "Basechkin", 105);

        quickSort(students, 0, students.length - 1);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}