fun main() {
    fun parseInputIntoList(input: List<String>): MutableList<Int> {
        var all = mutableListOf<Int>()

        var curr = 0

        for (line in input) {
            if (line == "") {
                all.add(curr)
                curr = 0
            } else {
                curr += line.toInt()
            }
        }

        if (curr != 0) {
            all.add(curr)
        }

        return all
    }

    fun part1(input: List<String>): Int = parseInputIntoList(input).max()

    fun part2(input: List<String>): Int = parseInputIntoList(input).sortedDescending().take(3).sum()

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
