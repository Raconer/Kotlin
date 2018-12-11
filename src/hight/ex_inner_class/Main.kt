package hight.ex_inner_class

/*
 * 중첩 클래스(Nested class)가 단순히 식별자 만 바깥 클래스에 속해 있는 것이 었다면,
 * 내부 클래스(Inner class)는 인스턴스가 바깥 클래스의 인스턴스에 완전히 소속된다.
 */

class Outer(private val value: Int) // value 프로퍼티와, print() 멤버 함수를 선언 하였다
{
    fun print()
    {
        println(this.value)
    }

    // innerValue 프로퍼티와 print 멤버 함수를 갖는 Inner내부 클래스를 선언하고있다.
    // 내부 클래스를 선언 할때는 선언문 앞에 inner 키워드를 붙인다.
    inner class Inner(private val innerValue : Int)
    {
        fun print()
        {
            this@Outer.print()
            println(this.innerValue + this@Outer.value)
        }
    }
}

fun main(args: Array<String>) {
    val instance : Outer = Outer(610)
    val innerInstance:Outer.Inner = instance.Inner(40)
    innerInstance.print()
}
