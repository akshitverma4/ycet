package com.example.android.ycet.models

import android.os.Parcel
import android.os.Parcelable

data class Document(
    val id:String=""
) : Parcelable {
    constructor(source: Parcel) : this(
        source.readString()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(id)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Document> = object : Parcelable.Creator<Document> {
            override fun createFromParcel(source: Parcel): Document = Document(source)
            override fun newArray(size: Int): Array<Document?> = arrayOfNulls(size)
        }
    }
}