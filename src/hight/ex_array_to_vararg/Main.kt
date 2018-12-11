package hight.ex_array_to_vararg

fun printAll(vararg tokens: String)
{
    for(token in tokens)
        print("$token")
}

// 배열속에 들어 잇는 원소들은 가변 인수로 활용할수 있다.
// 가변 함수를 모두 출력하는 함수이다.
// 배열 앞에 *을 찍으면 배열속의 내용을 가변 인수로 활용할 수 있다.
fun main(args: Array<String>) {
    val numbers: Array<String> = arrayOf("What's", "your", "name")
    printAll(*numbers)
}