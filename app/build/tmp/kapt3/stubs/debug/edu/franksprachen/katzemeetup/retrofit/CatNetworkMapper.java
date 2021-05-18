package edu.franksprachen.katzemeetup.retrofit;

import edu.franksprachen.katzemeetup.model.Cat;
import edu.franksprachen.katzemeetup.util.EntityMapper;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016\u00a8\u0006\f"}, d2 = {"Ledu/franksprachen/katzemeetup/retrofit/CatNetworkMapper;", "Ledu/franksprachen/katzemeetup/util/EntityMapper;", "Ledu/franksprachen/katzemeetup/retrofit/CatNetworkEntity;", "Ledu/franksprachen/katzemeetup/model/Cat;", "()V", "mapFromEntity", "entity", "mapFromListEntities", "", "entities", "mapToEntity", "domainModel", "app_debug"})
public final class CatNetworkMapper implements edu.franksprachen.katzemeetup.util.EntityMapper<edu.franksprachen.katzemeetup.retrofit.CatNetworkEntity, edu.franksprachen.katzemeetup.model.Cat> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public edu.franksprachen.katzemeetup.model.Cat mapFromEntity(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.retrofit.CatNetworkEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public edu.franksprachen.katzemeetup.retrofit.CatNetworkEntity mapToEntity(@org.jetbrains.annotations.NotNull()
    edu.franksprachen.katzemeetup.model.Cat domainModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<edu.franksprachen.katzemeetup.model.Cat> mapFromListEntities(@org.jetbrains.annotations.NotNull()
    java.util.List<edu.franksprachen.katzemeetup.retrofit.CatNetworkEntity> entities) {
        return null;
    }
    
    @javax.inject.Inject()
    public CatNetworkMapper() {
        super();
    }
}