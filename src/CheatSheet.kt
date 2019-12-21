import java.util.*

fun main() {
    // https://qiita.com/naoppy/items/e9064b297efae1a89642#n%E5%80%8B%E3%81%AE%E6%95%B0%E5%AD%97%E3%81%8C%E4%B8%80%E8%A1%8C%E3%81%AB%E3%81%82%E3%82%8B%E5%85%A5%E5%8A%9B
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