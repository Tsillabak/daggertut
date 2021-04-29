import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface CarComponent {

    val car: Car

    fun inject(main: Main)

}