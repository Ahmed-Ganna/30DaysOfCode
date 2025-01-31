fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    for (i in 1..10){
        println("$n x $i = ${n*i}")
    }
}