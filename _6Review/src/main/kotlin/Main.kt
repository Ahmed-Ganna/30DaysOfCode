fun main(args: Array<String>) {
    val testCases = readLine()!!.trim().toInt()
    val list = mutableListOf<String>()
    for(i in 1..testCases){
        val s = readLine()!!.trim()
        list.add(s)
    }

    list.forEach {s->
        var evens = ""
        var odds = ""
        s.forEachIndexed { index, c ->
            if (index %2==0) evens+=c
            else odds+=c
        }
        println("$evens $odds")
    }

}