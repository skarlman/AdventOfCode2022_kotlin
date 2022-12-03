import java.io.File

// Problem:
// https://adventofcode.com/2022/day/3

// More solutions:
// https://www.competitivecoders.com/ProgrammingCompetitions/advent-of-code/advent-of-code/2022/day-3/

fun main() {


    fun part1(input: List<String>): Int {

        return input.map { row ->
            val parts = row.chunked(row.length / 2)
            for (c in parts[0]) {
                if (parts[1].contains(c)) {
                    return@map if (c.code > 96) c.code - 96 else c.code - 64 + 26
                }
            }
            return@map 0
        }.sum()

    }

    fun part2(input: List<String>): Int {

        return input.chunked(3).map {

            for (c in it[0]) {

               if (it[1].contains(c) && it[2].contains(c)){
                   return@map if (c.code > 96) c.code - 96 else c.code - 64 + 26
               }

            }
           return@map 0
       }.sum()
    }

    val input = readInput("Day03")
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

private fun readInput(name: String) = File("src", "$name.txt")
    .readLines()