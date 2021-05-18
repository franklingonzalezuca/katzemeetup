package edu.franksprachen.katzemeetup.room

import androidx.room.TypeConverter
import com.google.gson.Gson
import edu.franksprachen.katzemeetup.model.Image

class Converters {
    @TypeConverter
    fun StringToImage(value: Image?): String = Gson().toJson(value)

    @TypeConverter
    fun ImagetoString(value: String): Image? = Gson().fromJson(value, Image::class.java)
}