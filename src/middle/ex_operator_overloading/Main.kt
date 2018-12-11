package middle.ex_operator_overloading

// 오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
// 오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 상요한다.
fun main(args: Array<String>) {
    val pt1 = Point(3,7)
    val pt2 = Point(2,-6)

    val pt3 = pt1 + pt2 // 5, 1
    val pt4 = pt3*6
    val pt5 = pt4/3

    pt3.print()
    pt4.print()
    pt5.print()
}