package util

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise

internal actual fun <T> runTest(block: suspend CoroutineScope.() -> T): T {
    return GlobalScope.promise { block() }.unsafeCast<T>()
}
