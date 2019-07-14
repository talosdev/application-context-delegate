package talosdev.delegate

import android.content.Context
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ApplicationContextDelegate(context: Context) : ReadOnlyProperty<Any, Context> {
    private val applicationContext = context.applicationContext

    override fun getValue(thisRef: Any, property: KProperty<*>): Context {
        return applicationContext
    }

}