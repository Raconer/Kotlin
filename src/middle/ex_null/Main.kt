package middle.ex_null

import middle.ex_upcasting.Person

// 업캐스팅 예제의 Person 클래스 재활용

fun main(args: Array<String>) {
    // 타입 이름 뒤에 ?를 붙이면 변수를 Nullable하게 만들수 있다.
    // Nullable이란 null값을 지정할 수 있는 변수를 뜻한다.
    // null은 참조 변수가 어떠한 객체도 가리키지 않고 있음을 나타내는 키워드이다.
    var person:Person? = Person("K",30)
    person = null

    var num:Int? = null
    num = 10
}