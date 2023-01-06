import java.util.*

object PracticeProblem {
    /*
     * It is unnecessary to edit the "main" method of each problem's provided code
     * skeleton. The main method is written for you in order to help you conform to
     * input and output formatting requirements.
     */
    @JvmStatic
    fun main(args: Array<String>) {
        val kb = Scanner(System.`in`)
        val numCases = kb.nextInt()
        for (iCase in 0 until numCases) {
            val x = kb.nextInt()
            val xIsOdd = isOdd(x)
            if (xIsOdd) {
                println("Odd")
            } else {
                println("Even")
            }
        }
        kb.close()
    }

    fun isOdd(x: Int): Boolean {
        if ( x % 2 == 0)
            return false
        else
            return true

        }

}