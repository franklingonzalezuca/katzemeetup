package edu.franksprachen.katzemeetup.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import edu.franksprachen.katzemeetup.model.Image

class CatNetworkEntity(
    @SerializedName("id")
    @Expose
    var id:String,

    @SerializedName("temperament")
    @Expose
    var temperament:String,

    @SerializedName("origin")
    @Expose
    var origin:String,

    @SerializedName("name")
    @Expose
    var name:String,

    @SerializedName("image")
    @Expose
    var image:Image?
)