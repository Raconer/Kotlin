package Test.TEST.Cont

import Test.TEST.Model.User

fun main(args: Array<String>) {

    /*var user:User = User()

    user.pId = 13
    user.id = "UserTest_Id"
    user.name = "테스트 이름"

    user.print()*/
    // 내용이 빈 배열을 선언 할때는 ?를 붙여서 작성을 한다.

    /*var data1:Array<User?> = arrayOfNulls(3)
    println(data1.size)
    for(i in 0 until 3){

        var user:User = User()
        user.name = "${i}"
        user.id = "id_${i}"
        user.pId = i

        data1.set(i, user)
    }

    println(data1[0]?.id)
    println(data1.get(1)?.id)
    println(data1.get(2)?.id)
    */

    var testItem:Int = 5
    println("${testItem is Int}")
    println("${testItem is Any}")

    /*var data2:ArrayList<User> = ArrayList()
    for(i in 1 until 10){
       var user:User = User()
        user.name = "${i}"
        user.id = "id_${i}"
        user.pId = i

        data2.add(user)
        user.print()
    }

    println(data2.size)
    */
}