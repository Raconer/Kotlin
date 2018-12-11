package middle.ex_notnull_assertion_operator

import middle.ex_member_function.Building

// !! 연산자는 Nullable 타입을 Not_null 타입으로 장제로 캐스팅한다.
fun main(args: Array<String>) {
    var obj:Building? = Building()
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
 //   obj!!.print()
}