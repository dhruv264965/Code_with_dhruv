//package Aggregation;
//
//import java.util.List;
//
//public class Institute {
//    String instituteName;
//    private List<Department>departments;
//
//    public Institute(String instituteName, List<Department> departments) {
//        this.instituteName = instituteName;
//        this.departments = departments;
//    }
//    public int getTotalStudentsInInstitute(){
//        int no_of_Student=0;
//        List<Student> students;
//        for(Department dept:departments){
//            students=dept.getStudents();
//            for(Student s:students){
//                no_of_Student++;
//            }
//
//        }
//        return no_of_Student;
//
//    }
//}
