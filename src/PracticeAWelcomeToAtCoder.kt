fun main() {
    println("> Please input your name.")
    val a = readLine()?.toInt()
    val inputBc = readLine()
    val bc = inputBc!!.split(" ").map(String::toInt)
    val b = bc[0]
    val c = bc[1]
    val s = readLine()
    print("a = $a, b = $b, c = $c")
}