object Main {
    lateinit var car: Car

    @JvmStatic
    fun main(args: Array<String>){
        val component = DaggerCarComponent.create()
        car = component.car
        car.drive()
    }

}