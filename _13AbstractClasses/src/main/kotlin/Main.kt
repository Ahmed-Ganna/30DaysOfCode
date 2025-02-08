import java.util.*

// Abstract Book class
abstract class Book(
    protected val title: String,
    protected val author: String
) {
    abstract fun display()
}

// MyBook class that extends Book
class MyBook(
    title: String,
    author: String,
    private val price: Int
) : Book(title, author) {

    override fun display() {
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
    }
}

// Main function to test the implementation
fun main() {
    val scan = Scanner(System.`in`)
    val title = scan.nextLine()
    val author = scan.nextLine()
    val price = scan.nextInt()
    scan.close()

    val myBook = MyBook(title, author, price)
    myBook.display()
}
