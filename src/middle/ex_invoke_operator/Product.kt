package middle.ex_invoke_operator

// 생성자가 아닌 생성한 후에
// 변수명을통해 기본 product(데이터)등을 생성할수 잇다.
class Product(val id:Int, val name:String)
{
    operator fun invoke(value:Int)
    {
        println(value)
        println("id:$id\nname::$name")
    }
}