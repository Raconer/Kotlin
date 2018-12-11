package middle.ex_any_class

/*
 * 어떤 클래스가 아무 클래스도 상속하지 않으면 자도응로 Any라는 클래스를 상속한다.
 * 다른 클래스를 사속한다고 해도 그 클래스 또한 Any클래스르 자동으로 상속하므로 간접적으로 Any 클래스를 상속하게된다.
 * 즉 모든 코틀린 클래스들은 Any 클래스를 상속한다는 것이 보장된다.
 *
 * open class Any
 * {
 *  open operator fun equals(other:Any?):Boolean    // ==연산자를 오버로딩하는 멤버 함수이다
 *  open fun hashCode():Int                         // 객체 고유의 해시 코드를 반환하는 멤버 함수이다.
 *  open fun toString():String                      // 객체의 내용을 String 타입으로 변환하는 멤버 함수이다.
 * }
 */

class Building( val name:String = "",   // 건물명
                val date: String = "",  // 건축일자
                val area:Int = 0)       // 면적
{
    override fun toString() =
            "이름:${this.name}\n" +
            "건축일자:${this.date}\n" +
            "면적:${this.area}m^2"
}