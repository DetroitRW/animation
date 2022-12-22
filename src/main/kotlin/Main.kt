import java.lang.StringBuilder

fun main(args: Array<String>) {
    var n = 0
    while (true) {
        val screen = render(n)
        display(screen)
        n += 1
        Thread.sleep(300)
    }
}

fun render(n: Int): String {
    val width = 12
    val height = 6
    val screen = StringBuilder()
    for (y in 0 until height) {
        for (x in 0 until width) {
            if (x == (n * 2) % width && y == n % height) {
                screen.append("*")
            } else {
                screen.append(".")
            }
        }
        screen.append("\n")
    }
    return screen.toString()
}

fun display(screen: String) {
    println(screen)
}