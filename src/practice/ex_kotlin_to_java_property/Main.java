package practice.ex_kotlin_to_java_property;

// Java에서 코틀린 코드 접근하기: 프로퍼티
public class Main {
    public static void main(String[] args){
      KotlinClass kotlin = new KotlinClass();
      kotlin.setNum(16);
      System.out.println(kotlin.getNum());
    }
}
