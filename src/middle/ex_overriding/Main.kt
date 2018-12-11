package middle.ex_overriding

// open 은 상속을 유무를 표시한것이다.
open class AAA
{
    open fun func()= println("AAA")
}

open class BBB:AAA(){
    // Java 에서는 @Override 어노테이션이 쓰이지만
    // Kotlin에서는 override가 붙는다
    override fun func(){
        super.func()
        println("BBB")
    }
}

fun main(args: Array<String>) {
    AAA().func()
    BBB().func()
}