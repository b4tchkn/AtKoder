import java.util.*

fun main(args: Array<String>) {
    val s = readLine()!!
    var count = 0
    (0..2).forEach { i ->
        if (s[i] == '1') count++
    }
    print(count)
}