package edu.franksprachen.katzemeetup.intent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ledu/franksprachen/katzemeetup/intent/Intent;", "", "()V", "GetCatEvent", "None", "Ledu/franksprachen/katzemeetup/intent/Intent$GetCatEvent;", "Ledu/franksprachen/katzemeetup/intent/Intent$None;", "app_debug"})
public abstract class Intent {
    
    private Intent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/franksprachen/katzemeetup/intent/Intent$GetCatEvent;", "Ledu/franksprachen/katzemeetup/intent/Intent;", "()V", "app_debug"})
    public static final class GetCatEvent extends edu.franksprachen.katzemeetup.intent.Intent {
        @org.jetbrains.annotations.NotNull()
        public static final edu.franksprachen.katzemeetup.intent.Intent.GetCatEvent INSTANCE = null;
        
        private GetCatEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/franksprachen/katzemeetup/intent/Intent$None;", "Ledu/franksprachen/katzemeetup/intent/Intent;", "()V", "app_debug"})
    public static final class None extends edu.franksprachen.katzemeetup.intent.Intent {
        @org.jetbrains.annotations.NotNull()
        public static final edu.franksprachen.katzemeetup.intent.Intent.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}