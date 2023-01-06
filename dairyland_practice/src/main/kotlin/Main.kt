import java.util.*

object FlightTime {
    /*
        * It is unnecessary to edit the "main" method of each problem's provided code
        * skeleton. The main method is written for you in order to help you conform to
        * input and output formatting requirements.
        */
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        var cases = `in`.nextInt()
        while (cases > 0) {


            // User Input
            val dist = `in`.nextInt()
            val velo = `in`.nextInt()
            val depHr = `in`.nextInt()
            val depMin = `in`.nextInt()

            // Function Call
            val flight = totalFlightTime(dist, velo, depHr, depMin)

            // Terminal Output
            System.out.printf("%d:%02d\n", flight[0], flight[1])
            cases--
        }
        `in`.close()
    }

    /**
     * TODO: Complete the following method that calculates the arrival time of a
     * flight based on the given parameters:
     *
     * Note: You do not need to account for time of day signifiers (AM or PM). Note:
     * You do not need to account for time change between time zones.
     *
     * @param distance --> the distance in miles of the flight
     * @param velocity --> how fast the plane is going in mph
     * @param departureHr --> the hour in which the plane departs
     * @param departureMin --> the minute in which the plane departs
     * @return new int[] {arrivalHr, arrivalMin} --> an array with arrivalHr at
     * index 0 and arrivalMin at index 1
     */
    fun totalFlightTime(distance: Int, velocity: Int, departureHr: Int, departureMin: Int): IntArray {
        val FlightLength = (distance.toDouble()/velocity.toDouble())
        val FLightminutes = (FlightLength * 60).toInt()

        val minutes = FLightminutes % 60
        val hours = ((FLightminutes - minutes).toDouble()/60).toInt()

        var flightTime = hours + departureHr
        var flightTimeMinutes = minutes + departureMin


        if (flightTimeMinutes>59){
            flightTime = flightTime + 1
            flightTimeMinutes = flightTimeMinutes - 60
        }


        return intArrayOf(flightTime,flightTimeMinutes) //first digit is hours, second is minutes
    }
}