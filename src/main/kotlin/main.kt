import java.util.*

fun main() {
    var checker = true
    val sc = Scanner(System.`in`)
    println("Zadejte počet zelenin: ")
    val n = sc.nextInt()
    val zelenina = arrayOfNulls<String>(n)
    for (i in 0 until n) {
        println("Zadejte $i.zeleninu")
        val input = sc.nextLine()
        zelenina[i] = input
    }

    println("Zadejte počet ovoce: ")
    val m = sc.nextInt()
    sc.nextLine()
    val ovoce = arrayOfNulls<String>(m)
    for (i in 0 until m) {
        println("Zadejte $i.ovoce")
        val input = sc.nextLine()
        ovoce[i] = input
    }

    while (checker) {
        println("Zadejte hledaný název: ")
        val end = sc.nextLine()
        if (end == "END") {
            checker = false
            break
        }
        for (i in ovoce.indices) {
            if (end === ovoce[i]) {
                println(ovoce[i])
            }
        }
        for (i in zelenina.indices) {
            if (end === zelenina[i]) {
                println(zelenina[i])
            }
        }
    }
}