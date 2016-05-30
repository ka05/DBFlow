package com.raizlabs.android.dbflow.kotlinextensions

import com.raizlabs.android.dbflow.sql.language.Condition
import com.raizlabs.android.dbflow.sql.language.From
import com.raizlabs.android.dbflow.sql.language.SQLite
import com.raizlabs.android.dbflow.sql.language.Select
import com.raizlabs.android.dbflow.sql.language.property.*
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable
import com.raizlabs.android.dbflow.structure.Model

/**
 * Description: Provides some very nice Property class extensions.
 */

val Int.property: IntProperty
    get() = PropertyFactory.from(this)

val Char.property: CharProperty
    get() = PropertyFactory.from(this)

val Double.property: DoubleProperty
    get() = PropertyFactory.from(this)

val Long.property: LongProperty
    get() = PropertyFactory.from(this)

val Float.property: FloatProperty
    get() = PropertyFactory.from(this)

val Short.property: ShortProperty
    get() = PropertyFactory.from(this)

val Byte.property: ByteProperty
    get() = PropertyFactory.from(this)

val <T> T.property: Property<T>
    get() = PropertyFactory.from(this)

val <T : Model> ModelQueriable<T>.property: Property<T>
    get() = PropertyFactory.from(this)

inline fun <reified T : Any> T.propertyString(stringRepresentation: String?): Property<T> {
    return PropertyFactory.from(T::class.java, stringRepresentation)
}

infix fun <T> Property<T>.eq(value: T): Condition {
    return this.eq(value)
}

infix fun <T> Property<T>.`is`(value: T): Condition {
    return this.`is`(value)
}

infix fun <T> Property<T>.isNot(value: T): Condition {
    return this.isNot(value)
}





