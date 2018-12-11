package hight.ex_companion_object

// 동반자 객체는 클래스 안에 포함되는 이름 없는 객체이다.
// 어떤 클래스의 모든 인스턴스가 공유하는 객체를 만들고 싶을때 사용한다.
class Person private constructor()
{
    // 동반자 객체를 정의 할 때는 이름 없이 companion object 라고만 적는다
    companion object
    {
        var countCreated = 0
            private set
        // create 멤버 함수를 통해서만 Person 객체를 생성할 수 있도록 하기 위해
        // 생성자의 접근 지정자를 private로 지정했다.
        fun create(): Person
        {
            countCreated += 1
            return Person()
        }
    }
}

fun main(args: Array<String>) {
    val a= Person.create()
    val b= Person.create()
    println(Person.countCreated)
}