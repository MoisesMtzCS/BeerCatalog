package cs.med.mtz.moises.beercatalog

import android.app.Application
import cs.med.mtz.moises.beercatalog.di.getApplicationModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BeerCatalogApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin()
    }

    private fun startKoin(){
        startKoin{
            androidLogger()
            androidContext(applicationContext)
            modules(getApplicationModules())
        }
    }


}