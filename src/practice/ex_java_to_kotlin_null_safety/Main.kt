package practice.ex_java_to_kotlin_null_safety

class KotlinClass:JavaInterface
{
    override fun trim(str:String?):String = str?.trim() ?:""
}

/*
 * 자바의 참조 타입을 코틀린으로 불러오면 타입 이름뒤에 느낌표가 붙는다.
 * 타입 이름 뒤의 느낌표 '!'는 이 타입이 nullable인지, Not-Null인지 알수 가 없다는 뜻이다.
 * 자바의 참조 타입은 무조건 null을 허용하기 때문에 이런일이 벌어진다.
 * 반면 int와 같은 원시 타입의 경우 njll 값이 들어 갈수 없으므로 느낌표 없이 Int타입으로 인식된다.
 * 자바에 선언된 인터페이슬ㄹ 코틀린에서 구현하는 예제를 통해 타입의 Nullable이 어떻게 처리되는지 알아보자
 */
fun main(args: Array<String>) {
    val javaInterface:JavaInterface = KotlinClass()
    println(javaInterface.trim(" hi "))
}