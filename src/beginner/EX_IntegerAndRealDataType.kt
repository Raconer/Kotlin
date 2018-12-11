// 7
fun main(args: Array<String>):Unit {
    /**
     * 정수 타입
     * 타입 이름    / 용량(단위: Byte) /  저장 가능 범위
     *  Byte                1               -128~127
     *  Short               2               -3만2768~3만2768
     *  Int                 4               -21억 4748만 3648
     *                                          ~ 21억 4748만 3648
     *  Long                8               -922경 3372조 0368억 5477만 5808
     *                                          ~ 922경 3372조 0368억 5477만 5807
     * 실수 타입
     * 타입 이름    / 용량(단위: Byte) /  저장 가능 범위
     *  Float               4                1.410-45
     *                                          ~ 3.40282351038
     *  Double              8                4.910-324
     *                                          ~ 1.797693134862315710308
     *  실수 타입은 저장 가능 범위가 아니라 소수점 정밀도이다.
     **/

    var a:Byte = 125
    var b:Short = (100 + 200) * 100
    var c:Int = 12_4354_6538
    // println("c_1 : $c")
    c = 0xff_88_88 // 정수 리터럴이 0x 로 시작하면 뒤에오는 수가 16진수로 인식된다.
    // println("c_2 : $c")
    c = 0b01010010_01100011_01110101_01000101 // 정수 리터럴이 0b로 시작하면, 뒤이어 오는수가 2진수로 인식된다.
    // println("c_3 : $c")
    var d:Long = -543_7847_3984_7238_4723

    c= a + b
    d = c + 10L

    var e:Float = 67.6f
    val f:Double = 658.456
    e= (e + f).toFloat()
    // println("a : $a")
    // println("b : $b")
    // println("c_4 : $c")
    // println("d : $d")
    println("e : $e")
    // println("f : $f")

    /*var a:Byte =125
    var b:Short = (100 + 200) * 100
    var c:Int = 12_4354_6538
    c = 0xFF_88_88
    c = 0b01010010_01100011_01110101_01000101
    var d:Long = -543_7847_3984_7238_4723

    c = a + b
    d = c + 10L

    var e:Float = 67.6f
    val f:Double = 658.456
    e = (e + f).toFloat()
    println(e)*/
}