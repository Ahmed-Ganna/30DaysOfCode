import java.util.*
import kotlin.math.max

class Node(var data: Int) {
    var left: Node? = null
    var right: Node? = null
}

object Solution {
    fun getHeight(root: Node?): Int {
        if (root == null) return -1  // Base case: empty tree has height -1
        val leftHeight = getHeight(root.left)
        val rightHeight = getHeight(root.right)
        return max(leftHeight, rightHeight) + 1
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
    println(Solution.getHeight(root!!))
}
