package hight.ex_sealed_class

/*
 * Sealed 클래스는 자신의 중첩 클래스에만 상속을 허용하는 클래스이다.
 */

sealed class Outer
{
    class One : Outer()
    class Two : Outer()
    class Three:Outer()
}