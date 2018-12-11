package hight.ex_it_identifier

// it 식별자
// 람다식 매개변수가 하나일 때는 매개 변수 선언을 생략할수 있다.
fun main(args: Array<String>) {
    val instantFunc:(Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(33)
}