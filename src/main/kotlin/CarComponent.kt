import dagger.Component
import javax.inject.Singleton

@Component(modules = [WheelsModule::class])
@Singleton
interface CarComponent {

    val car: Car

    fun inject(main: Main)

}