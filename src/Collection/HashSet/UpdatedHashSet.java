package Collection.HashSet;

import java.util.HashSet;
import java.util.Objects;

class Student {

    public int id;

    public String name;

    public Student(String name, int id) {

        this.name = name;

        this.id = id;

    }


    public boolean equals(Object o) {

        if (o instanceof Student) {

            Student s = (Student) o;

            return s.id == this.id ? true : false;

        }

        return false;

    }
//
//    public int hashCode() {
//
//        return this.id;
//
//    }

    public String toString() {

        return "Student: " + this.name + "@" + Integer.toHexString(hashCode());

    }

}
public class UpdatedHashSet {

    public static void main(String[] args) {

        HashSet<Student> studentList = new HashSet<>();

        Student st1 = new Student("Nimit", 1);

        Student st2 = new Student("Rahul", 3);


        Student st3 = new Student("Nimit", 2);

        studentList.add(st1);

        studentList.add(st2);

        studentList.add(st3);
        System.out.println(studentList);

        System.out.println(studentList.size());//guess the output here

        st1.id = 3;

        System.out.println(studentList.size());//guess the output here

    }

}
