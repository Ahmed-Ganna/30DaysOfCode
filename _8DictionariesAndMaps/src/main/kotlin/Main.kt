import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // Reading the number of entries in the phone book
    val n = scanner.nextInt()
    val phoneBook = mutableMapOf<String, String>()

    // Reading the entries (name and phone number) into the phone book
    for (i in 0 until n) {
        val name = scanner.next()
        val phone = scanner.next()
        phoneBook[name] = phone
    }

    // Handling queries
    while (scanner.hasNext()) {
        val query = scanner.next()
        // If the query exists in the phone book, print the name and phone number; otherwise, print "Not found"
        if (phoneBook.containsKey(query)) {
            println("$query=${phoneBook[query]}")
        } else {
            println("Not found")
        }
    }

    scanner.close()
}