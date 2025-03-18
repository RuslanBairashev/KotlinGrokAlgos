fun main() {
    //Chapter 1. Binary search
    val myList = listOf(1, 3, 5, 7, 9)
    println(BinarySearch.evaluate(myList, 3)) //Correct answer - 1
    println(BinarySearch.evaluate(myList, -1)) //Correct answer - null

    //Chapter 2.Selection sort
    val notSorted = mutableListOf(5, 3, 6, 2, 10)
    println(SelectionSort.selectionSort(notSorted))
}