package practice.ex_java_to_kotlin_sam_conversion

fun main(args: Array<String>) {

    /*
     *SAM인란 단일 추상 메서드(Single Abstract Method)의 줄임말로, 메서드를 한 개만 갖고 있는 인터 페이스를 뜨한다.
     */
    val runnable:Runnable = Runnable{println("SAM")}
    runnable.run()
}