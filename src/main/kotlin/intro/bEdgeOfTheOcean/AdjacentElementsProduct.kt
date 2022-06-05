package intro.bEdgeOfTheOcean.adjacentElementsProduct

    fun main() {
        val inputArray = mutableListOf<Int>(3, 6, -2, -5, 7, 3)
        println(adjacentElementsProduct(inputArray))
    }

    fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
        var maximum = -999999999
        for (index in 0 until inputArray.size - 1) {
            maximum = Math.max(maximum, inputArray[index] * inputArray[index + 1])
        }
        return maximum
    }