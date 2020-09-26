fun main(args: Array<String>) {
    var numb = readLine()!!.split(" ").map { it.toInt() }
    var result = 0
    for (i in numb[1]..numb[0]) {
        var s = 0
        i.toString().forEach {
            val a = it.toInt()
            println("i = $i, a = $a")
        }
        if (s >= numb[1] && s <= numb[2]) {
            result += s
            println(s)
        }
    }
}