package Test

class Building
{
    var name = "" // 건물명
    var date = "" // 건축일자
    var area = 0  // 면적(m^2)

    fun print(){
        println("이름:"+this.name)
        println("건축일자:"+this.date)
        println("면적 :${this.area}m^2")
    }
}

open class Person2(val name:String, val age:Int){
    override fun toString(): String {
        return "Person : $name / $age"
    }
}

class Student(name: String, age:Int, val id:Int):Person2(name, age){
    override fun toString(): String {
        return "Student : $name / $age / $id"
    }
}

class Professor(name: String, age:Int, val id:Int):Person2(name, age){
    override fun toString(): String {
        return "Proffesor : $name / $age / $id"
    }
}

fun main(args: Array<String>) {
    // upcasting
    val person2:Person2 = Student("John", 32, 20171218)
    /*println(person2.toString())

    var obj:Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울 월드컵 경기장"
    obj?.date = "2001년11월10일"
    obj?.area = 21_6712
    obj?.print()

    // obj = null
    obj!!.print()

    println("Person2? : ${person2 is Person2}")
    println("Student : ${person2 is Student}")
    println("Student : ${person2 is Professor}")
    */
    // down casting
    val person:Person2 = Student("John", 32, 20171218)
    var person3:Person2 = Person2("john", 32)
    val person4:Student = person as Student
    person3 = person4 as Student
    println(person3.toString())

    /*try {
        var str ="abcd"
        //val num = str.toInt()
        //println(num)
    }catch (e:Exception){
        println("에러")
    }finally {
        println("끝")
    }*/

    /*try {
        something()
    }
    catch (e:Exception){
        println(e.message)
    }*/

    // Nothing type ex
    /*
    * fun throwing():Nothing = throw Exception
    *
    * fun main(args: Array<String>)
    * {
    *   println("start")
    *   val i:Int = throwing()
    * }
    * */
    //println(validate(10))


}

fun something(){
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

fun div(a:Int, b:Int):Int{
    if(b==0)
        throw Exception("안쪼개진다.")

    return a/b
}

// Nothing 타입 사용방법
fun validate(num:Int):Int{
    val result:Int =
            if(num >= 0) num
            else throw Exception("num이 음수 입니다.")

    return result
}