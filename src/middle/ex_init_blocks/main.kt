package middle.ex_init_blocks

class Size(height:Int, width:Int)
{
    var width:Int
    var height:Int
    val area:Int

    init{// 초기화
        this.width = width
        this.height = height
        this.area = this.width * this.height
        println("2 : ${this.width} , ${this.height}")
    }

    /*init {
        this.height = height
    }*/

    /*init {
        area = width * height
    }*/

}

fun main(args: Array<String>) {
    val size = Size(10,50)
    //println("1 : ${size.width} , ${size.height}")
    println(size.area)
}