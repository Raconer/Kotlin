package hight.ex_destructuring_object

data class Employee(val name:String, val age:Int, val salary:Int)

// 데이터 클래스의 인스턴스에 한해, 객체를 여러 개의 변수로 쪼개는것이 가능하다.
fun main(args: Array<String>) {
    // 사용되지 않은 변수의 이름은 '_'를 이용하여 무시할수 있다.
    val(name, _, salary) = Employee("Hohn", 30, 3300)
    println(name)
    println(salary)
}