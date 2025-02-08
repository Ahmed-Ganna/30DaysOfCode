import java.util.*
import kotlin.math.abs

class Difference(private val elements: IntArray) {
    var maximumDifference: Int = 0
        private set

    // Compute the maximum absolute difference
    fun computeDifference() {
        var min = elements[0]
        var max = elements[0]

        for (i in elements){
            if (i>max) max = i
            else if (i<min) min = i
        }

        maximumDifference= abs(max-min)
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val elements = IntArray(n) { scanner.nextInt() }
    scanner.close()

    val difference = Difference(elements)
    difference.computeDifference()

    println(difference.maximumDifference)
}
