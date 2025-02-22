import java.util.*
import kotlin.math.max

class Node(var data: Int) {
    var left: Node? = null
    var right: Node? = null
}

object Solution {
    fun levelOrder(root: Node?) {
        if (root == null) return

        val queue: Queue<Node> = LinkedList()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            print("${current.data} ")

            current.left?.let { queue.add(it) }
            current.right?.let { queue.add(it) }
        }
        println()
    }

    fun insert(root: Node?, data: Int): Node {
        return if (root == null) {
            Node(data)
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data)
            } else {
                root.right = insert(root.right, data)
            }
            root
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var root: Node? = null
    val T = scanner.nextInt()
    repeat(T) {
        val data = scanner.nextInt()
        root = Solution.insert(root, data)
    }
    Solution.levelOrder(root!!)
}
