package Collection.Compator_And_Comparing;


import java.util.*;

class Student implements Comparator<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa  = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }
}

public class Compartorr  {

    public static void main(String[] args) {
//        List<String> list= Arrays.asList("banana","apple","date");
//        System.out.println(list);
//        list.sort((a,b)->a.length()-b.length());
//        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Akshit", 3.9));
        Comparator<Student> studentComparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
//        students.sort((o1, o2) -> {
//            if (o2.getGpa() - o1.getGpa() > 0) {
//                return 1;
//            } else if (o2.getGpa() - o1.getGpa() < 0) {
//                return -1;
//            } else {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });
        students.sort(studentComparator);
        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
        //Collections.sort(students, comparator);


    }
}
