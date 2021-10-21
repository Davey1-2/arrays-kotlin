fun main() {

    val mince = "9095\n" +
            "8048\n" +
            "8302\n" +
            "1155\n" +
            "6467\n" +
            "1748\n" +
            "8959\n" +
            "2279\n";


    val input = mince.split("").toTypedArray()
    val bankovky = intArrayOf(5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    var count = 0

    for (i in input.indices) {
        var parsed: Int = input[i].toInt()
        var j = 0
        while (j < bankovky.size) {
            if (parsed >= bankovky[j]) {
                count++
                parsed -= bankovky[j]
                j--
            }
            j++
        }
    }
    println(count)
}