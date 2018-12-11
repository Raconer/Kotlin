/*
 * 가변인수 vararg
 * 1. 가변인수는 일반 인수와 함께 쓸수도 있다.
 * ex) fun function(someThing:Char, vararg numbers:Int):Int
 *  -> function(Char 타입 인수, N개의 Int 타입인수)
 *
 *  2. 일반 인수가 가변인수보다 오른쪽에 있으면 호출시 인수에 매개변수 이름을 붙여야 한다.
 *  ex) fun function(vararg numbers:Int, something:char):Int
 *   -> function(N개의 Int타입인수, something = Char 타입인수)
 *
 */
fun main(args: Array<String>):Unit {
    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32,57,12))
    println(getSumOf())
}

fun getSumOf(vararg numbers:Int):Int
{
    var count = numbers.size
    var i = 0; var sum = 0
    while(i < count){
        sum += numbers[i]
        i += 1
    }
    return sum
}