package hight.ex_inherit_from_generic

// 제네릭이 적용된 클래스/ 인터페이스 상속*구현하기

interface Plusable<T>
{
    operator fun plus(other:T): T
}