package hight.ex_closure

fun returnFunc(num:Int):() -> Unit = { println(num)}
// f() 가 실행될때 num매개 변수는 이미 사라지고 없다.
// returnFunc 함수가 끝나는 순간  num  매개변수는 소멸하기 때문이다.
// 하지만 함수 리터럴이 자신이 만들어 질때의 상황을 기억하고 있다.
// 5~7번 줄의 함수 리터럴이 만들어 지는 순간, 함수 리터럴은 자기 주변의 상황을 함께 저장한다.
// 즉 함수가 만들어 질때 num 매개 변수의 값을 복사해 갖고 있다. 이렇게 함수가 만들어 질때 주변상황을
// 기억하는 함수를 클로저 라고 부른다.
fun main(args: Array<String>) {
    val f:() -> Unit = returnFunc(30)
    f()
}