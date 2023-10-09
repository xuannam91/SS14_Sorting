package ra.bt02;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 90.5),
                new Student(2, "Bob", 78.2),
                new Student(3, "Charlie", 88.9),
                new Student(4, "David", 76.7)

        };

        System.out.println("Danh sách học viên ban đầu:");
        printStudents(students);

        Student[] sortedStudents;


        sortedStudents = SortingStudent.insertionSort(students.clone());
        System.out.println("\nDanh sách học viên sau sắp xếp bằng Insertion Sort:");
        printStudents(sortedStudents);


        sortedStudents = SortingStudent.selectionSort(students.clone());
        System.out.println("\nDanh sách học viên sau sắp xếp bằng Selection Sort:");
        printStudents(sortedStudents);

        sortedStudents = SortingStudent.bubbleSort(students.clone());
        System.out.println("\nDanh sách học viên sau sắp xếp bằng Bubble Sort:");
        printStudents(sortedStudents);
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
