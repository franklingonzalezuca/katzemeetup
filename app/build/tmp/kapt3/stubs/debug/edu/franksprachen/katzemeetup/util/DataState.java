package edu.franksprachen.katzemeetup.util;

import edu.franksprachen.katzemeetup.model.Cat;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Ledu/franksprachen/katzemeetup/util/DataState;", "", "()V", "Error", "Idle", "Loading", "Success", "Ledu/franksprachen/katzemeetup/util/DataState$Idle;", "Ledu/franksprachen/katzemeetup/util/DataState$Success;", "Ledu/franksprachen/katzemeetup/util/DataState$Error;", "Ledu/franksprachen/katzemeetup/util/DataState$Loading;", "app_debug"})
public abstract class DataState {
    
    private DataState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/franksprachen/katzemeetup/util/DataState$Idle;", "Ledu/franksprachen/katzemeetup/util/DataState;", "()V", "app_debug"})
    public static final class Idle extends edu.franksprachen.katzemeetup.util.DataState {
        @org.jetbrains.annotations.NotNull()
        public static final edu.franksprachen.katzemeetup.util.DataState.Idle INSTANCE = null;
        
        private Idle() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Ledu/franksprachen/katzemeetup/util/DataState$Success;", "Ledu/franksprachen/katzemeetup/util/DataState;", "cats", "", "Ledu/franksprachen/katzemeetup/model/Cat;", "(Ljava/util/List;)V", "getCats", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success extends edu.franksprachen.katzemeetup.util.DataState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<edu.franksprachen.katzemeetup.model.Cat> cats = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<edu.franksprachen.katzemeetup.model.Cat> getCats() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<edu.franksprachen.katzemeetup.model.Cat> cats) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<edu.franksprachen.katzemeetup.model.Cat> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.franksprachen.katzemeetup.util.DataState.Success copy(@org.jetbrains.annotations.NotNull()
        java.util.List<edu.franksprachen.katzemeetup.model.Cat> cats) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Ledu/franksprachen/katzemeetup/util/DataState$Error;", "Ledu/franksprachen/katzemeetup/util/DataState;", "exception", "Ljava/lang/Exception;", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Error extends edu.franksprachen.katzemeetup.util.DataState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Exception exception = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception getException() {
            return null;
        }
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Exception component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final edu.franksprachen.katzemeetup.util.DataState.Error copy(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/franksprachen/katzemeetup/util/DataState$Loading;", "Ledu/franksprachen/katzemeetup/util/DataState;", "()V", "app_debug"})
    public static final class Loading extends edu.franksprachen.katzemeetup.util.DataState {
        @org.jetbrains.annotations.NotNull()
        public static final edu.franksprachen.katzemeetup.util.DataState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
}