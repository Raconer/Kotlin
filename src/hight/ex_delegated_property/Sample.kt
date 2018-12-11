package hight.ex_delegated_property

class Sample
{
    // 프로 퍼티 선언문 뒤에 by 객체를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.
    var number:Int by OnlyPositive()
}