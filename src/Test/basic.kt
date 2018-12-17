package Test

fun main(args: Array<String>) {
/*
    for(i in 1..100 step 3){
        print(" $i ")
    }
    println()
    for(i in 100 downTo 1 step 3){
        print(" $i ")
    }
    println()
    for(i in 1 until  101 step 3){
        print(" $i ")
    }
    println()
    val text:String =  "test Text Reversed"
    println(text.reversed())

    var testInt:Int = 10;
    var testDouble:Double = testInt.toDouble()
    println(testDouble)

    for(i in 9 downTo 1 step 1){
        for(j in 9 downTo 1 step 1)
        println("$i * $j = ${i*j}")
    }



    for(i in 1 until  10 step 1){
        for(j in 9 downTo 1 step 1){
            if( j > i){
                print(" ")
            }else{
                if(j === 1){
                    print("*")
                }else{
                    print("**")
                }
            }
        }
        println()
    }*/
    /*var i = 0
    while(i++ < 10){
        print("$i ")
    }
    println()
    i = 0
    do{
        print("$i ")
    }while(i++ < 10)
    */
    // continue와 break의 차이점
    // break 는 감싸고 있는 반복문 하나만 빠져 나가게 된다.
    /*for(j in 1 until 10 step 1){
        print("${j} ")
        if(j === 5)
            //continue
            break

        println("${j}_1")
    }*/
    // 레이블
    // break@"레이블 이름" 을 실행하면 그 레이블에 해당 하는 반복문을빠져 나온다.
    outer@for(j in 1 until 10 step 1){
        print("${j} ")
        for(k in 1 until 10) {
            if (j === 5){
                //break@outer
                break@outer
                //continue
            }
            println("${j}_1")
        }
    }

}