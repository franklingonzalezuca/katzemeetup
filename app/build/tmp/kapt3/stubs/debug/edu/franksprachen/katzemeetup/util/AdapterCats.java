package edu.franksprachen.katzemeetup.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import edu.franksprachen.katzemeetup.R;
import edu.franksprachen.katzemeetup.model.Cat;
import kotlinx.android.synthetic.main.item_cat.view.*;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Ledu/franksprachen/katzemeetup/util/AdapterCats;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Ledu/franksprachen/katzemeetup/util/AdapterCats$ViewHolder;", "()V", "items", "Ljava/util/ArrayList;", "Ledu/franksprachen/katzemeetup/model/Cat;", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCats", "", "ViewHolder", "app_debug"})
public final class AdapterCats extends androidx.recyclerview.widget.RecyclerView.Adapter<edu.franksprachen.katzemeetup.util.AdapterCats.ViewHolder> {
    public java.util.ArrayList<edu.franksprachen.katzemeetup.model.Cat> items;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<edu.franksprachen.katzemeetup.model.Cat> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<edu.franksprachen.katzemeetup.model.Cat> p0) {
    }
    
    public final void setCats(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.franksprachen.katzemeetup.model.Cat> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public edu.franksprachen.katzemeetup.util.AdapterCats.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.util.AdapterCats.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public AdapterCats() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0011"}, d2 = {"Ledu/franksprachen/katzemeetup/util/AdapterCats$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "catImage", "Landroid/widget/ImageView;", "getCatImage", "()Landroid/widget/ImageView;", "catName", "Landroid/widget/TextView;", "getCatName", "()Landroid/widget/TextView;", "catOrigin", "getCatOrigin", "catTemperament", "getCatTemperament", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView catName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView catTemperament = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView catOrigin = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView catImage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCatName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCatTemperament() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getCatOrigin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getCatImage() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}