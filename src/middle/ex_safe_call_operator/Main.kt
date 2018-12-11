package middle.ex_safe_call_operator

/* 안전한 호출 연산자  "?."
 * Nullable한 참조 변수의 프로퍼티와 멤버 함수에 접근 하려면 "." 대신 "?." 연산자를 반드시 사용해야한다.
 * "?."은 null값에 안전한 연산자이다. 아래와 같은 코드가 있을때, 참조 변수가 null이면 참조변수 "?."프로퍼티 표현식이 null값을 갖게 된다.
 */

// 참조 변수 일 경우
// 참조변수?.프로퍼티

// 멤버 함수 일 경우
// 참조변수?.멤버 함수()

// 멤버 함수 예제의 Building  클래스 재활용
import middle.ex_member_function.Building


fun main(args: Array<String>) {
    var obj:Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울 월드컵 경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()
}