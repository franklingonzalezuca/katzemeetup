package edu.franksprachen.katzemeetup.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Image(
        @SerializedName("url")
        @Expose
        var url: String)
