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
    val width = 80
    val height = 40
    val screen = StringBuilder()
    for (y in 0 until height) {
        for (x in 0 until width) {
            if (x == 0 && y == 0) {
                screen.append("┌")
            } else if (x == 0 && y == height-1) {
                screen.append("└")
            } else if (x == width - 1 && y == 0) {
                screen.append("┐")
            } else if (x == width - 1 && y == height - 1) {
                screen.append("┘")
            } else if (x == width - 1 && y in 1 until height - 1) {
                screen.append("│")
            } else if (x == 0 && y in 1 until height - 1) {
                screen.append("│")
            } else if (y == 0) {
                screen.append("─")
            } else if (y == height - 1) {
                screen.append("─")
            } else if (x == n % width && y == (n / width) % height) {
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
//─, │, ┌, ┐, └, ┘