// Start of Node class
class Node(var data: Int) {
    var next: Node? = null
} // End of Node class

// Start of LinkedList class
class LinkedList {
    fun insert(head: Node?, data: Int): Node? {
        if (head == null) {
            return Node(data)
        }
        head.next = insert(head.next, data)
        return head
    }

    fun display(head: Node?) {
        if (head != null) {
            print("${head.data} ")
            display(head.next)
        }
    }

    // Start of function removeDuplicates
    fun removeDuplicates(head: Node?): Node? {
        if (head==null) return null
        val map = mutableMapOf<Int,Boolean>()

        var current = head
        var last : Node? = null
        while (current!=null){
            if (map[current.data]!=null){ //Duplicates found
                val next = current.next
                last?.next = next
                current = next
            }else{
                map[current.data] = true
                last = current
                current = current.next
            }
        }

        return head
    } // End of function removeDuplicates
} // End of LinkedList class

fun main() {
    var head: Node? = null
    val linkedList = LinkedList()

    val t = readLine()!!.toInt()
    repeat(t) {
        head = linkedList.insert(head, readLine()!!.toInt())
    }

    linkedList.display(linkedList.removeDuplicates(head))
}
