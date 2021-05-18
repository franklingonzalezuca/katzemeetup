package edu.franksprachen.katzemeetup.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import edu.franksprachen.katzemeetup.model.Image

@Entity(tableName = "Breeds")
class CatCacheEntity(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id:String,

    @ColumnInfo(name = "temperament")
    var temperament:String,

    @ColumnInfo(name = "origin")
    var origin:String,

    @ColumnInfo(name = "name")
    var name:String,

    @ColumnInfo(name = "image")
    var image:Image?
)