package hight.ex_higher_order_function

/*
 *  여러 페이지에 걸쳐 함수 리터럴을 소개했지만, 아직 구체적인 용도를 설명하지 않았다.
 *  함수 리터럴은 보통 고차 함수를 위해 사용된다.
 *  고차함수란, 인수를 함수를 받거나, 함수를 반환하는 함수를 뜻한다.
 *  고차 함수는 다음의 코드와 같은 상황에 유용하게 사용할수잇다.
 *
 *  println("===작업 시작===")
 *  val a= 10
 *  val b = 5
 *  println("$a + $b = ${a+b}")
 *  println("===작업 끝===")
 *
 *  println("===작업 시작===")
 *  println("some")
 *  println("tasks")
 *  println("===작업 끝===")
 *
 *  어떤 작업을 시작하고 끝낼때마다 "===작업 시작===" , "===작업끝==="을 출력 하려고 한다.
 *  그런데 매번 println을 호출하자니 코드가 중복되어 보기에 좋지 않다.
 *  고차 함수를 이용하여 이 코드 조각을 멋지게 고쳐보자
 */

fun decorate(task:() -> Unit){
    println("===작업 시작===")
    task()
    println("===작업 끝===")
}

fun main(args: Array<String>) {
    decorate{
        val a = 10;val b = 5
        println("$a + $b = ${a+b}")
    }
    decorate{
        println("some");println("task")
    }
}
