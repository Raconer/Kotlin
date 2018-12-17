package hight.ex_abstract_class

/*
 *  상속을 사용하다 보면 단순히 여러 타입을 하나의 타입으로 묶는 용도로 쓸 때가 많다.
 *  // 학생, 교수, 지구언 클래스를 하나의 타입으로 묶어주는 클래스
 *  open class Person
 *  {
 *      open fun getSalary() = 0
 *  }
 *
 *  // 학생 클래스. tuituin는 한 학기 등록금
 *  class Student(private val tuition: Int) : Person()
 *  {
 *      // 학생은 등록금을 납부하므로 salary를 음수처러
 *      override fun getSalary() = classCount * 120
 *  }
 *
 *  // 학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
 *  class Employee(private val initial:Int, private val years:Int):{Persion()
 *  {
 *      override fun getSalary() = initial * (1.0 + years/ 10.0).toInt
 *  }
 *
 *  여기서 Person은 단순히 Student, Professor, Employee 클래스를 Person 타입으로 묶기 위한
 *  클래스 이며, 각 서브클래스에 getSalary라는 멤버 함수를 전파 시키고 있다.
 *  Person처럼 여러 클래스를 한 타입로 묶어주고, 공통되는 멤버를 전파하는 용도로 쓰는 클래스는 추상 클래스로 선언 하는 것이 좋다.
 */

// 예1
// 단순히 학생, 교수 ,직원 클래스를 하나의 타입으로 묵어주는 클래스
abstract class Person
{
    abstract fun getSalary():Int
}
// 학생 클래스. tuition는 한 학기 등록금
class Student(private val tuition:Int):Person()
{
    // 학생은 등록금을 납부 하므로 salary를 음수 처리
    override fun getSalary() = - tuition
}
// 교수 클래스. classCount는 진행하는 수업의수
class Professor(private val classCount:Int):Person()
{
    override fun getSalary() = classCount * 200
}
// 학교 직원 클래스. initial은 초봉(반기), year는 경력(년)
class Employee(private val initial:Int, private val years:Int):Person()
{
    override  fun getSalary() = initial * (1.0 + years/10.0).toInt()
}
// 구성원으로부터 학교의 재정을 구한다.
// vararg 여러개의 인수를 받을수 있다.
fun getFinance(vararg  persons:Person):Int
{
    var i = 0
    var finance = 0
    while(i < persons.size)
    {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(330), Student(330), Professor(1), Professor(2), Employee(1300, 2))
    println("학교 재정 :  ${finance} 원")
}