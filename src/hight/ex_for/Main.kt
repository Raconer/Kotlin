package hight.ex_for

/*
 * for도 while문과 같이 코드를 반복하는 반복문의 일종이다.
 * 그러나 for은 특수한 상황에만 쓰이고, 알아야 할 사전 지식도 많기 때문에 불가피하게 중급 파트에서 소개하게 되었다.
 * for은 다음의 형태로 쓴다.
 *
 * for(변수 이름: 타입 in 표현식)
 * {...}
 *
 * 코틀린의 for은 for-each 스타일만 지원한다.
 * C 스타일의 전통적인 for은 지원하지 않는다.
 *
 * for문의 소괄호 안에 선언된 변수는 스코프가 for문 안으로 한정되며, in우측 표현식 속의 데이터를 하나식 받는데 사용한다.
 *
 * in 우측의 표현식에는 다음과 같은 연산자 멤버 함수를 갖는 객체만 지정할수 있다.
 * operator fun iterator():Iterator<자유타입>
 *
 * 만약 for(변수이름:Double in 표현식) 형태로 사용하려 한다면, 표현식이 operator fun iterator():Iterator<Double>
 * 형태의 연산자 멤버 함수를 갖고 있어야한다. 즉, for문 속의 변수 타입과 Iterator의 타입인수가 같아야한다.
 */

// for 문 속의 in 연산자는 iterator 연산자 멤버 함수만 있으면 지원되기 때문에
// 제너릭의 in과 감찬가지로 동음 이의 키워드로 생각하면된다.
fun main(args: Array<String>) {
    for(i:Int in 1..10)
        print("$i ")
    println()

    for(i:Int in 1..10)
    {
        if(i > 5)
            break

        print("$i ")
    }
   /*
    * // itera는 1..10구간 속의 특정원소를 가리키고있다.
    * val iter:Iterator<Int> = (1..10).iterator()
    *  while(iter.hasNext())
    *  {
    *   val i = iter.next //  매 반복마다 i에는 1,2,3,...10의 값이 들어간다.
    *   print(i)
    *  }
    */
}