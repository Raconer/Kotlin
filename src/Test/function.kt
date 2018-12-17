package Test

// 숫자로만 이루어져 있는지 확인
fun String.isNumber():Boolean{
    var i = 0
    while(i < this.length){
        if(!('0' <= this[i]&& this[i] <= '9'))
            return false

        i++
    }
    return true
}

fun main(args: Array<String>) {

}