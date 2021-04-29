import javax.inject.Inject

class Main {
    @Inject
     lateinit var car: Car
     fun run(){
         car.drive()
     }
     companion object{
         val main = Main()
         @JvmStatic
         fun main(args: Array<String>){
             val component = DaggerCarComponent.create()
             component.inject(main)
             main.run()
         }
     }
}