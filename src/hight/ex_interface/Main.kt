package hight.ex_interface

// 인터페이스는 클래스에 어떤 멤버 함수와 프로퍼티가 반드시 존재한다는 것을 보장하기 위한 장치이다.
// 인터 페이스는 멤버 함수, 추상 멤버 함수, 추상 프로퍼티를 가질수있다.
// 일반 프로퍼티와 생성자는 가질수 없다.
interface Printable
{
    // :Unit은 Int 등 으로 작성할수 있으며 java에서 void와 같다고 생각하면된다.
    // 인터페이스의 멤버 함수는 내용이 비었으면 자동으로 abstract가 붙는다.
    fun print():Unit
}

class AAA:Printable
{
    // 인터페이스를 상속이 아닌 구현하고 있다.
    override fun print()
    {
        println("Hello")
    }
}

fun print(anything:Printable)
{
    anything.print()
}

fun main(args: Array<String>) {
    print(AAA())
}