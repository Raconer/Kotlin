package Test

class Car(name:String)
{
    var name:String = ""
        get() = field
        set(value) {field = value}
    var speed:Double = 0.0

    init {
        this.name = name
    }

    constructor(name:String, speed:Double):this(name){
        this.name = name
        this.speed = speed
    }
}

fun main(args: Array<String>) {
    val car:Car = Car("")
}