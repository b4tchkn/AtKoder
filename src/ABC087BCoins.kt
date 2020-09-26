import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()
    val X = scanner.nextInt()
    var count = 0
    for (a in 0..A) {
        for (b in 0..B) {
            for (c in 0..C) {
                if (X == 500 * a + 100 * b + 50 * c) count++
            }
        }
    }
    print(count)
}