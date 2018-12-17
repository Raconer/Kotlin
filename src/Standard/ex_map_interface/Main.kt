package Standard.ex_map_interface

/**
 * Map 인터페이스 살펴보기
 *
 * Map 인터페이스는 다음과 같이 선언 되어 있다.
 * interface Map<K, out V>
 *
 * Map 인터페이스는 아래와 같은 멤버를 갖는다.
 * interface Entry<out K, out V>
 *      Entry는 키와 값 한 쌍을 표현하는 중첩 인터페이스 이다.
 *
 * abstract val size:Int
 *      size는 Map에 들어있는 키와 값 쌍의 개수를 갖는 프로퍼티이다.
 *
 * abstract val keys: Set<K>
 *      keys는 Map의 키들만 갖는 프로퍼티이다. Map의 키는 중복 되지 않기 때문에 Set타입으로 되어 있다.
 *
 *  abstract val values:Collection<V>
 *      values는 Map의 값들만 갖는 프로퍼티이다. Map의 값은 중복 될수 있기 때문에 Collection타입으로 되어있다.
 *
 *  abstract val entries:Set<Map.Entry<K, V>>
 *      entries는 Map에 들어 잇는 모든 키와 값 쌍들을 갖는 프로퍼티이다. 키와 값은 Entry 타입으로 감싸여 있다.
 *
 *  abstract fun isEmpty(): Boolean
 *      isEmpty 멤버 함수는 Map이 비어 있는지 여부를 반환한다.
 *
 *  abstract fun containsKey(key:K): Boolean
 *      containsKey 멤버 함수는 Map에 Key에 해당하는 키가 들어 잇는지 여부를 반환한다.
 *
 *  abstract fun containsValue(valueLV):Boolean
 *      containsValue 멤버 함수는 Map에 Value에 해당하는 값이 들어 있는지 여부를 반환하다.
 *
 *  abstract operator fun get(key: K):V?
 *      get은 key에 해당하는 값을 반환하는 연산자 멤버 함수이다. 만약 key에 해당하는 값이 없으면 null이 반환한다.
 *      rmfotj 반환 타입이 V?이다
 *
 *      get은 Map타입에 []연산자를 사용할 수 있도록 하는 역활도 한다.
 *
 *   open fun getOrDefault(key:K, defaultValue:V)V
 *      getOrDefault 멤버 함수는 key에 해당하는 값을 반환하되, key에 해당하는 값이 없으면 defaultValue를 대신 반환한다.
 **/

fun main(args: Array<String>) {
    val map:Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa","코코아"))
}