fun main(args: Array<String>) {
    val index = arrayOf(1, 3, 4, 2)
    val fruit = arrayOf("apple", "banana", "cherry", "blueberry", "pomegranate")
    var x = 0

    while (x < 4) {
        var y: Int
        y = index[x]


        println("Fruit = ${fruit[y]}")

        x = x + 1
    }

}



