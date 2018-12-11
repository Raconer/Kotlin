package middle.ex_extension_funtion

// 문자열이 숫자로만 이루어져 있는지 판단한느 확장 함수
fun String.isNumber():Boolean
{
    var i = 0
    while (i <  this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어 있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    return true
}

fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())
}
