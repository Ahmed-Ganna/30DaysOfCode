import java.util.Scanner

class Person(initialAge: Int) {
    private var age: Int = if (initialAge < 0) {
        println("Age is not valid, setting age to 0.")
        0
    } else {
        initialAge
    }

    fun amIOld() {
        val message = when {
            age < 13 -> "You are young."
            age < 18 -> "You are a teenager."
            else -> "You are old."
        }
        println(message)
    }

    fun yearPasses() {
        age += 1
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()

    for (i in 0 until T) {
        val age = scanner.nextInt()
        val person = Person(age)
        person.amIOld()
        repeat(3) { person.yearPasses() }
        person.amIOld()
        println()
    }
    scanner.close()
}
