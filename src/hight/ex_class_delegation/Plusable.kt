package hight.ex_class_delegation

// 인터페이스를 구현하는 클래스를 선언하고있다.
interface Plusable
{
    //operator의 뜻은 연산자를 사용했을시 이 멤버 함수를 대신 호출해달라는 뜻이다
    operator fun plus(other: Int):Int
}