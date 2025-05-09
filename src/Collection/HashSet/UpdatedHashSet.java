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
//    @Override   If this is wriiten then it show duplicate value
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student s = (Student) o;
//        return this.id == s.id && this.name.equals(s.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }


    public boolean equals(Object o) {  // equals method is writteen as based on ID only not name that by it is allowing in this condion

        if (o instanceof Student) {    // if equals method is written based on name and ID then namit will be taken as duplicate

            Student s = (Student) o;

            return s.id == this.id ? true : false;

        }

        return false;

    }

    public int hashCode() {

        return this.id;

    }

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
