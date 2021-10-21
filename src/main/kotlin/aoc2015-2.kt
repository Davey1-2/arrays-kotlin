fun main() {
    val a = """
        4x23x21
        22x29x19
        11x4x11
        8x10x5
        24x18x16
        11x25x22
        2x13x20
        24x15x14
        14x22x2
        30x7x3
        30x22x25
        29x9x9
        29x29x26
        14x3x16
        1x10x26
        29x2x30
        30x10x25
        """.trimIndent()

    val array = a.split("\n".toRegex()).toTypedArray()
    var total = 0

    for (i in array.indices) {
        val line = array[i].split("x".toRegex()).toTypedArray()
        val length = line[0].toInt()
        val width = line[1].toInt()
        val height = line[2].toInt()
        val side1 = 2 * length * width
        val side2 = 2 * width * height
        val side3 = 2 * height * length
        if (side1 < side2 && side1 < side3) {
            total += side1
        }
        if (side2 < side1 && side2 < side3) {
            total += side2
        }
        if (side3 < side2 && side3 < side1) {
            total += side3
        }
        val finals = side1 + side2 + side3
        total += finals
    }
    println(total)
}
