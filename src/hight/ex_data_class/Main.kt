package hight.ex_data_class


/*
 *  클래스에는 크게 데이터 자체의 역활만 하는 클래스와, 데이터를 다루는 역할을 하는 클래스가 있다.
 *  사원 데이터 자체만 속성으로 갖고 있는 Employee 클래스와,
 *  Employee의 인스턴스들을 관리 하는 EmployeeManager 클래스 같은 식으로 말이다.
 *
 *  데이터 클래스를 선언 하기 위해서는 클래스문 앞에 data 키워드를 붙인다.
 *
 *  클래스를 data 클래스로 선언 하면 다음과 같은 이점이 생긴다.
 *  - any 클래스에 들어있는 equals, hashCode, toString 멤버 함수가 자동으로 오버라이딩 된다.
 *      - equals 멤버 함수는 각 프로퍼티의 값이 서로 모두 같으면 true, 하나라도 다르면 flaseㄹ르 반환하게 오버라이딩 된다.
 *  - toString 멤버 함수는  "Employee(name = ..., age=...,salary..."형태로 문자열을 반환하도록 오버라이딩된다.
 *  - 객체를 복사하는 copy  함수가 자동으로 선언된다.
 *
 *  copy와 똑같은 멤버 함수를 데이터 클래스에서 선언하면 충돌 오류가된다. equals, hashCode, toString멤버 함수는 선언해되 괜찮다.
 *  이들을 이직접 선언하면 직ㅂ 선언한 멤버 함수로 오버라이딩된다.
 *
 *  참고.copy 멤버 함수는 모든 매개변수가 디폴트 인수를 갖고 있기 때문에,
 *  first.copy(name = "Jang") 형식으로 원하는 프로퍼티만 다른 값으로 지정한채 복사할수있다.
 *
 */
data class Employee(val name:String,
                    val age:Int,
                    val salary:Int)

fun main(args: Array<String>) {
    val first = Employee("John",30 , 3000)
    val second = Employee("Page",24 , 5300)
    val third = first.copy()

    println(first.toString())
    println(third.toString())
    println(first == second)
    println(first == third)
}