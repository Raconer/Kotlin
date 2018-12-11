package hight.ex_nested_class

// 클래스 안에는 또 다른 클래스를 선언 할 수 있다.

class Outer //바깥 클래스
{
    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main(args: Array<String>) {
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}

/*
 * Nested 클래스는 Nested라는 식별자만 Outer클래스에 속해 있을뿐, 실제로는 완전히
 * 분리된 장소에 있다. 다라서 Noested클래스의 멤버 함수는 Outer클래스의 프로퍼니 멤버 함수에 접근 할수 없다.
 *
 *
 */