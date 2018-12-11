package hight.ex_the_diamond_problem

/*
 * 인터페이스를 여러개 상속할 때 발생할 수 있는 문제를 이해한다.
 * 다이아몬드 구조의 interface
 * interface Parent{fun follow(): Unit}
 *
 * interface Mother:Parent
 * {
 *  override fun follow() = println("follow his mother")
 * }
 *
 * interface Father : Parent
 * {
 *  override fun follow() = println("follow his father")
 * }
 *
 * class Child:Mother, Father
 * {
 *  override fun follow()
 *  {
 *      println("A child decided to")
 *      super.follow()
 *  }
 * }
 */

//  Child follow가 Fother와 Mother의 둘중의 어느것을 호출하는지 모르므로
//  super<Mother> 이런식으로 원하는 인터페이스의 super를 호출 할수 있는 기능을 제공한다.
interface Parent{ fun follow():Unit }
interface Mother:Parent
{
    override fun follow() = println("follow his mother")
}

interface Father:Parent
{
    override fun follow() = println("follow his father")
}

class Child:Mother, Father
{
    override fun follow() {
        println("A child decided to")
        super<Mother>.follow()
    }
}

fun main(args: Array<String>) {
    Child().follow()
}