package javaprograms;

public class staticDemo {
    staticDemo(){
        System.out.println("cinstructor");
    }
    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        staticDemo a=new staticDemo();

    }
}
