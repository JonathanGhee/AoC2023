/*
I did this is in Go first, and then watched the Kotlin guys do it(Jetbrains is sponsoring the event btw!)
kotlin is a way nicer way to solving things because of the libraries available.
Going to do day 2 in kotlin first and see how it goes
 */

fun main() {
    fun part1(input: List<String>): Int {
            return calibrationValue(input[0])
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("Day01")
    println(part1(input))
   // part1(input).println()
   // part2(input).println()
}

fun calibrationValue(row:String): Int =
    "${row.first {it.isDigit()}}${row.last{it.isDigit()}}".toInt()

fun String.possibleWordsAt(startingAt: Int): List<String> = (3..5).map {
    len -> substring(startingAt, (startingAt+len).coerceAtMost(length))
}