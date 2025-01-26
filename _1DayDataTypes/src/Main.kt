object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "

        // Read inputs
        val inputInt = readLine()!!.toInt()
        val inputDouble = readLine()!!.toDouble()
        val inputString = readLine()!!

        // Print results
        println(inputInt + i)
        println(inputDouble + d)
        println(s + inputString)
    }
}