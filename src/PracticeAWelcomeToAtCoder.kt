fun main(args: Array<String>) {
    var a = 0
    (0..2).forEach {
        val input = readLine()
        a += when (it) {
            0 -> input!!.toInt()
            1 -> {
                val values = input!!.split(" ").map(String::toInt)
                values[0] + values[1]
            }
            else -> {
                println("$a $input")
                0
            }
        }
    }
}