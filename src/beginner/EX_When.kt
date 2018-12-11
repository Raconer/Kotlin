fun main(args: Array<String>):Unit {
    var score = 64

    when(score/10){
        6 ->{println('D')}
        7 ->{println('C')}
        8 ->{println('B')}
        9, 10 ->{println('A')}
        else ->{println('F')}
    }
    println("test")
}