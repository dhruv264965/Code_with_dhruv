package Interface;

public class Test implements Interface1,Interface2{
    @Override
    public void hello() {
        Interface1.super.hello();
    }

    public static void main(String[] args) {
    Test t=new Test();
       t.hello();
       Interface1.world();
       Interface2.world();
    }


}
