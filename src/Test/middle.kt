package Test

fun main(args: Array<String>) {
    val person = object {
        // 초기화
        init {
            this.age = 0
            this.name = ""
        }
        var age:Int
        get() {return field}
            set(value) {field = value}
        var name:String
            get() {return field}
            set(value) {field = value}
    }

    person.age = 10
    person.name = "dhokim"

    println("$person.age / $person.name")
}