import java.lang.StringBuilder

fun main(args: Array<String>) {
    var n = 0
    while (true) {
        val screen = render(n)
        display(screen)
        n += 1
        Thread.sleep(14)
    }
}

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