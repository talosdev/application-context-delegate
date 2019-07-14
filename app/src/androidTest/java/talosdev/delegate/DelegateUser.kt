package talosdev.delegate

import android.content.Context

class DelegateUser(_context: Context) {
    val context: Context by ApplicationContextDelegate(_context)
}