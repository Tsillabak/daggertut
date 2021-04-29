import javax.inject.Inject

class  Car @Inject constructor(){
        @Inject
        lateinit var  engine: Engine
        @Inject
        lateinit var wheels: Wheels



    fun drive(){
   println("Driving")
    }
    @Inject
    fun enableRemote(remote: Remote){
        remote.listener = this
        println("remote enabled")
    }
}