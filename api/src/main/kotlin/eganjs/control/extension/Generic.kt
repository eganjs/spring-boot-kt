package eganjs.control.extension

import java.util.*

inline fun <T, R> T.attempt(block: (T) -> R?): Optional<R> {
    return try {
        Optional.ofNullable(block(this))
    } catch (_: Exception) {
        Optional.empty()
    }
}
