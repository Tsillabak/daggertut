import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun providesRims(): Rims {
        return Rims()
    }
    @Provides
    fun providesTires(): Tires{
        val tires = Tires()
        tires.inflate()

        return tires
    }
    @Provides
    fun providesWheels(rims: Rims, tires: Tires): Wheels{
        return Wheels (rims, tires)
    }


}