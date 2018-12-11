package hight.ex_class_delegation


// 인터페이스를 구현하면서 뒤에 by객체를 지정하면 인터페이스의 구현을 해당 객체로 위임한다.
// 이때 객체는 대리할 인터페이스를 구현하고 있어야한다.
// 앞으로 Sample의 plus 연산자 멤버 함수를 호출하면 classDelegator의 plus가 호출된다.
class Sample:Plusable by ClassDelegator()
