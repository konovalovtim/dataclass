fun main() {
    val anythingList: ArrayList<Anything> = arrayListOf()
    println("please enter your car and model in format: '[car] [model]'")
    while (true) {
        val line = readLine()

        if (line.equals("return"))
            break
        val lines = line?.split(" ")
        if (lines != null && lines.size != 2)
            println("Please enter 2 arguments")
        else {
            val anything = Anything(lines?.get(0), lines?.get(1))
            anythingList.add(anything)
        }

    }

    var i = 0
    while (i < anythingList.size) {
        val (car, model) = anythingList.get(i)
        println("$car $model")
        i++
    }

}