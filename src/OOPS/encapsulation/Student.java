package OOPS.encapsulation;

public class Student {
    private String name;
    private  int rollNumber;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){

            System.out.println("invalid age");
        }
        else {
            this.age=age;
        }
    }
}