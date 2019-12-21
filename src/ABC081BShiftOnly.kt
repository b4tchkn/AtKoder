fun main(args: Array<String>) {
    readLine()
    var numbers = readLine()!!.split(" ").map { countEven(it.toInt()) }
    print(numbers.min())
}

fun countEven(number: Int): Int {
    return if (number % 2 == 0) 1 + countEven(number / 2)
    else 0
}