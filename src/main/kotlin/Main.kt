object Main {

    @JvmStatic
    fun main(args: Array<String>){
        val engine = Engine()
        val wheels = Wheels()

        val car = Car(engine, wheels)
        car.drive()
    }

}