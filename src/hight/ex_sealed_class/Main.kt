package hight.ex_sealed_class

/*
* sealed 클래스는 자신의 중첩 클래스에만 상속을 호용하는 클래스이다.
* * 중첩 클래스 : 하나의 클래스 내부에 또 다른 클래스가 내포되어 있는 상태.
*
* */
fun main(args: Array<String>) {
    val instance:Outer = Outer.Three()

    val text:String = when(instance)
    {
        is Outer.One -> "첫번째"
        is Outer.Two -> "두번째"
        is Outer.Three -> "세번째"
    }
    println(text)
}