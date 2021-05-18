package edu.franksprachen.katzemeetup.room;

import androidx.room.TypeConverter;
import com.google.gson.Gson;
import edu.franksprachen.katzemeetup.model.Image;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Ledu/franksprachen/katzemeetup/room/Converters;", "", "()V", "ImagetoString", "Ledu/franksprachen/katzemeetup/model/Image;", "value", "", "StringToImage", "app_debug"})
public final class Converters {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String StringToImage(@org.jetbrains.annotations.Nullable()
    edu.franksprachen.katzemeetup.model.Image value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final edu.franksprachen.katzemeetup.model.Image ImagetoString(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return null;
    }
    
    public Converters() {
        super();
    }
}