fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val result = when(a*b%2==0) {
        true -> "Even"
        else -> "Odd"
    }
    print(result)
}