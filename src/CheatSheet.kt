import java.util.*

fun main() {
    // n行の入力を受け付ける
//    val n = readLine()!!.toInt()
//    val d = (1..n).map {
//        return@map readLine()!!.toLong()
//    }
//    print(d)

    // 一行で複数の入力を受け付ける
//    val (b, c) = readLine()!!.split(" ")
    // 一行で複数の入力を受け付けてintに変換
//    val (b, c) = readLine()!!.split(" ").map(String::toInt)
//    val (b, c) = readLine()!!.split(" ").map { it.toInt() }
//    print("$b, $c")

    // Scannerを使って標準入力
    val scan = Scanner(System.`in`)
    val scana = scan.nextInt()
    val scanb  = scan.nextInt()
    val scanc = scan.nextInt()
    var s: String
    s = try {
        scan.next()
    } catch (e: Throwable) {
        print(e.toString())
        ""
    }
    print("${(scana+scanb+scanc)} $s")
}