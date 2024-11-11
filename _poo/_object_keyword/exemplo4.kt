class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                println("BONG")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)
}