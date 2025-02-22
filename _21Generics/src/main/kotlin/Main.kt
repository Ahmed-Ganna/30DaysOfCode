import java.util.*

class Printer {
    /**
     *    Name: printArray
     *    Print each element of the generic array on a new line. Do not return anything.
     *    @param A generic array
     **/
    fun <T> printArray(array: Array<T>) {
        for (item in array) {
            println(item)
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()
    val intArray = Array(n) { scanner.nextInt() }

    n = scanner.nextInt()
    val stringArray = Array(n) { scanner.next() }

    val printer = Printer()
    printer.printArray(intArray)
    printer.printArray(stringArray)
}