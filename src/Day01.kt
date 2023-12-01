fun main() {
    fun part1(input: List<String>): Int {
        val lines: MutableList<String> = mutableListOf() // Create list for each line.
        val finalNumbers: MutableList<Int> = mutableListOf() // This is where all the combined numbers are stored.

        // add each line to the list
        for(line in input) {
            lines.add(line.trim())
        }

        for (line in lines) {
            val a = line.toSingleDigitList()
            finalNumbers.add(("${a[0]}" + "${a[a.lastIndex]}").toInt()) // joins the first number with the last
        }
        return finalNumbers.sum() // sum of all numbers
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    part1(input).println()
    //part2(input).println() todo
}

