class Person(var age: Int) {
    init {
        if (age < 0) {
            age = 0
            println("Age is not valid, setting age to 0.")
        }
    }

    fun amIOld() {
        when {
            age < 13 -> println("You are young.")
            age in 13..17 -> println("You are a teenager.")
            else -> println("You are old.")
        }
    }

    fun yearPasses() {
        age++
    }
}

// Example usage:
fun main() {
    val person1 = Person(-1)  // Should print "Age is not valid, setting age to 0."
    person1.amIOld()  // Should print "You are young."

    repeat(3) { person1.yearPasses() }
    person1.amIOld()  // Should print "You are a teenager."
}