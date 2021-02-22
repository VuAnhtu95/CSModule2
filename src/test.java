public class test {
    public static void main(String[] args) {
        run2 run1 = new run2();
        run2 run2 = (run2) run1;
    }
}
class run1{
    void display(){
        System.out.println("1");
    }
}
class run2{
    void display(){
        System.out.println("1");
    }
    void display2(){
        System.out.println("2");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}