package practice.ex_kotlin_to_java_Object;

public class main {
    public static void main(String[] args){
        System.out.println(KotlinObject.INSTANCE.getNum());
        KotlinObject.INSTANCE.setNum(0);
        KotlinObject.INSTANCE.hello();
    }
}
