package middle.ex_operator_overloading


// 오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
// 오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 상요한다.
// operator의 뜻은 연산자를 사용했을시 이 멤버 함수를 대신 호출해달라는 뜻이다
// plus, minus, times, div 는 정해진 이름이다
class Point(var x:Int = 0, var y:Int = 0){

    operator fun plus(other:Point):Point{
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other:Point):Point{
        return Point(x-other.x, y-other.y)
    }

    operator fun times(number:Int):Point{
        return Point(x*number, y*number)
    }
    operator fun div(number:Int):Point{
        return Point(x/number, y/number)
    }

    fun print(){
        println("x: $x, y: $y")
    }
}