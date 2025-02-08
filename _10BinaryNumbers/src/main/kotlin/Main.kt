fun main(args: Array<String>) {
    var n = readLine()!!.trim().toInt()

    var lastMod = 0
    var countConsOnes = 0

    while (n!=0){
        lastMod = n.mod(2)
        n = n.div(2)
        if (lastMod==1)countConsOnes++ else countConsOnes = 0
    }

    print(countConsOnes)
}