fun main(args: Array<String>) {
fun render(n: Int): String {
    val width = 40
    val height = 80
    val screen = StringBuilder()
    for (y in 0 until width) {
        for (x in 0 until height) {
            screen.append(".")
        }
        screen.append("\n")
    }
    return screen.toString()
}

fun display(screen: String) {
    println(screen)
}