import java.util.*

class Node(var data: Int) {
    var next: Node? = null
}

object Solution {

    fun insert(head: Node?, data: Int): Node {
        val node = Node(data)
        if (head == null) {
            return node
        }

        var current = head
        while (current?.next != null) {
            current = current?.next!!
        }
        current?.next = node

        return head
    }

    fun display(head: Node?) {
        var start = head
        while (start != null) {
            print("${start.data} ")
            start = start.next
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var head: Node? = null
        val N = sc.nextInt()

        repeat(N) {
            val ele = sc.nextInt()
            head = insert(head, ele)
        }
        display(head)
        sc.close()
    }
}
