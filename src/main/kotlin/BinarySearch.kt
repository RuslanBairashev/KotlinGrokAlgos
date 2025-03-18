class BinarySearch {

    companion object {
        fun evaluate(lst: List<Int>, item: Int): Int? {
            var low = 0
            var high = lst.size - 1
            var mid: Int
            var guess: Int

            while (low <= high) {
                mid = (low + high) / 2
                guess = lst[mid]
                if (guess == item) return mid

                if (guess > item) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            }

            return null
        }
    }
}