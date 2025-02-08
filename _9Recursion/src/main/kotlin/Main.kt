/*
 * Complete the 'factorial' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER n as parameter.
 */

fun factorial(n: Int): Int {
    var result = 1
    if (n>1){
        result = n * factorial(n-1)
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = factorial(n)

    println(result)
}