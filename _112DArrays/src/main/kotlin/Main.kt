import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*



fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    // Reading the input into the array
    for (i in 0 until 6) {
        arr[i] = readLine()!!.split(" ").map { it.toInt() }.toTypedArray()
    }

    var maxSum = Int.MIN_VALUE  // Initialize maxSum to the smallest possible value

    // Iterate over the 2D array to check all possible hourglasses
    for (i in 1 until 5) {
        for (j in 1 until 5) {
            // Calculate the sum of the current hourglass
            val sum = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
                    arr[i][j] +
                    arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]

            // Update maxSum if the current sum is larger
            if (sum > maxSum) {
                maxSum = sum
            }
        }
    }

    // Print the maximum hourglass sum
    println(maxSum)
}



