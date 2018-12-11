package middle.ex_access_modifier

/**
 * 접근 지정자
 * 코틀린에서 선언 가능한 요소(함수, 전역 변수, 클래스, 프로퍼티, 멤버 함수 등) 중, 일부 요소에는
 * 접근(변수의 경우 변수에 값을 저장하거나 변수에 저장된 값을 읽는 행위, 함수의 경우 함수호출)
 * 권한 이라는 것을 지정할 수 있다. 이를 접근 지정자(Access Modifier)또는 가시성 지정자(Visibility Modifier)라고 한다.
 * 접근 지정자는 총 4개가 있다.
 *
 * public : 모든 곳에서 접근 가능.(default)
 * internal : 같은 모듈 안에서 접근 가능. 여기서 모듈은 Intelij 프로젝트의 모듈을 가리킨다.
 * protected : 클래스 내부와, 서브 클래스 안에서만 접근 가능하.
 * private : 프로퍼티와 멤버 함수일 경우, 해당 클래스 안에서만 접근 가능하고, 그 외의 경우 , 같은 파일 내에서만 접근 가능하다.
 **/

class Rectangle(private val width:Int, private val height:Int)
{
    val area:Int
        get() = width * height
}

fun main(args: Array<String>) {
    val rect = Rectangle(5,  7)
    //println(rect.width ) // 에러
    println(rect.area)
}

/**접근 지정자 사용 가능*/
/**
 * 접근 지정자 class 식별자 접근 지정자 constructor()
 * {
 *  접근 지정자 val 또는 var 식별자
 *      접근 지정자 get() = ..
 *      접근 지정자 set(value) =
 *
 *  접근 지정자 constructor(...): this(...)...
 *
 *  접근 지정자 fun 식별자()...
 * }
 *
 * // 전역 변수에만 접근 지정자 지정 가능
 * 접근 지정자 val 또는 var식별자...
 *
 * 접근 지정자 fun 식별자(...)...
 * */