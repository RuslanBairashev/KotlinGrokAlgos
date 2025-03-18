class SelectionSort {

    companion object {
        private fun findSmallest(arr: MutableList<Int>): Int {
            var smallest = arr[0]
            var smallestIndex = 0
            arr.forEachIndexed { index, value ->
                if (value < smallest && index != 0) {
                    smallest = value
                    smallestIndex = index
                }
            }

            return smallestIndex
        }

        fun selectionSort(array: MutableList<Int>): List<Int> {
            val newArr: MutableList<Int> = mutableListOf()
            while (array.isNotEmpty()) {
                val smallestIndex = findSmallest(array)
                newArr.add(array[smallestIndex])
                array.removeAt(smallestIndex)
            }

            return newArr
        }
    }
}