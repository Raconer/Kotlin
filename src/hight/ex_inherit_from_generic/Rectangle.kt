package hight.ex_inherit_from_generic

class Rectangle(val width: Int, val height: Int):Plusable<Rectangle>
{
    override fun plus(other: Rectangle): Rectangle =
                Rectangle(width + other.width, height + other.height)

    override fun toString() = "width:$width, heigth: $height"
}