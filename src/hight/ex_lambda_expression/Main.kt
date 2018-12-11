package hight.ex_lambda_expression

fun main(args: Array<String>) {
    // (Int) -> Unit 은 매개 변수가 Int타입이고 반환 타입이 Unit인 함수를 저장할수 있는 타입이다.
    // 이처럼 함수를 저장할 수 있는 타입을 함수 타입이라고 하낟.
    // 매개변수가 Int고 return 값이 Unit
    val instantFunc:(Int) -> Unit

    // 이부분이 함수 리터럴이다.
    // number:Int 부분은 함수 리터럴의 매개변수를 나타낸다.
    // -> 를 경계로, 매개 변수와 함수의 내용이 분리된다. 만약 매개 변수가 없는 함수 리터럴을 만들고 싶다면, "number:Int ->" 부분 없이 함수의 내용만 나오면된다.
    // 함수 리터럴에는 return 을 적지 않는다. 함수 리터럴의 반환 값은 함수 내용의 맨 마지막 표현식이된다.
    // 즉 다음과 같이 적으면 마지막 표현식이 a + 10이므로, 반환값이 a+10이 된다
    // 코틀린 에서는 함수 리터럴을 두가지 형태로 만들 수 있다.
    // 이번에 배운 {매개변수 -> 반환 값}
    // 형태가 그중 하나이며, 이를 람다 식이라고 부른다.
    instantFunc = { number:Int -> println("Hellow $number")}

    instantFunc(33)
    instantFunc.invoke(33)
}