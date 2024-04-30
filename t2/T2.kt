package t2

fun <T> countOccurrences(nums: Array<T>): Map<T, Int> {
    val occurrences = mutableMapOf<T, Int>()
    for (num in nums) {
        occurrences[num] = occurrences.getOrDefault(num, 0) + 1
    }
    return occurrences
}

fun main() {
    val nums = arrayOf(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)
    val occurrences = countOccurrences(nums)
    for ((num, count) in occurrences) {
        println("Элемент: $num, Количество вхождений: $count")
    }
}