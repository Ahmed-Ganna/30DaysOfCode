import java.util.*

open class Person(
    protected val firstName: String,
    protected val lastName: String,
    protected val idNumber: Int
) {
    // Print person data
    open fun printPerson() {
        println("Name: $lastName, $firstName")
        println("ID: $idNumber")
    }
}

class Student(
    firstName: String,
    lastName: String,
    idNumber: Int,
    private val testScores: IntArray
) : Person(firstName, lastName, idNumber) {

    // Method to calculate the grade based on the average test score
    fun calculate(): Char {
        val sum = testScores.sum()
        val average = sum.toDouble() / testScores.size

        // Determine the grade based on the average score
        return when {
            average >= 90 -> 'O' // Outstanding
            average >= 80 -> 'E' // Exceeds Expectations
            average >= 70 -> 'A' // Acceptable
            average >= 55 -> 'P' // Poor
            average >= 40 -> 'D' // Distinction
            else -> 'T' // Fail
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)
    val firstName = scan.next()
    val lastName = scan.next()
    val id = scan.nextInt()
    val numScores = scan.nextInt()
    val testScores = IntArray(numScores) { scan.nextInt() }
    scan.close()

    val s = Student(firstName, lastName, id, testScores)
    s.printPerson()
    println("Grade: ${s.calculate()}")
}
