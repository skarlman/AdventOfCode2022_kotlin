import java.io.File

// Problem:
// https://adventofcode.com/2022/day/1

// More solutions:
// https://www.competitivecoders.com/ProgrammingCompetitions/advent-of-code/advent-of-code/2022/day-1/

fun main() {


    fun part1(input: List<String>): Int {
        val scores = mapOf(
            Pair("A", "X") to 1 + 3,
            Pair("A", "Y") to 2 + 6,
            Pair("A", "Z") to 3 + 0,
            Pair("B", "X") to 1 + 0,
            Pair("B", "Y") to 2 + 3,
            Pair("B", "Z") to 3 + 6,
            Pair("C", "X") to 1 + 6,
            Pair("C", "Y") to 2 + 0,
            Pair("C", "Z") to 3 + 3,
        )

        return input.map { row ->
            row.split(" ")
                .let {
                scores.getValue(Pair(it[0], it[1]))
            }
        }.sum()


    }

    fun part2(input: List<String>): Int {
        val scores = mapOf(
            Pair("A", "X") to 3 + 0,
            Pair("A", "Y") to 1 + 3,
            Pair("A", "Z") to 2 + 6,
            Pair("B", "X") to 1 + 0,
            Pair("B", "Y") to 2 + 3,
            Pair("B", "Z") to 3 + 6,
            Pair("C", "X") to 2 + 0,
            Pair("C", "Y") to 3 + 3,
            Pair("C", "Z") to 1 + 6,
        )

        return input.map { row ->
            row.split(" ")
                .let {
                    scores.getValue(Pair(it[0], it[1]))
                }
        }.sum()

    }

    val input = readInput("Day02")
    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}

private fun readInput(name: String) = File("src", "$name.txt")
    .readLines()