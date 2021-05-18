package edu.franksprachen.katzemeetup.room

import edu.franksprachen.katzemeetup.model.Cat
import edu.franksprachen.katzemeetup.util.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject
constructor():EntityMapper<Cat, CatCacheEntity> {
    override fun mapFromEntity(entity: Cat): CatCacheEntity {
        return CatCacheEntity(
            id = entity.id,
            temperament = entity.temperament,
            origin = entity.origin,
            name = entity.name,
            image = entity.image
        )
    }

    override fun mapToEntity(domainModel: CatCacheEntity): Cat {
        return Cat(
            id = domainModel.id,
            temperament = domainModel.temperament,
            origin = domainModel.origin,
            name = domainModel.name,
            image = domainModel.image
        )
    }

    fun mapFromListEntity(entities:List<CatCacheEntity>): List<Cat> {
        return entities.map { mapToEntity(it) }
    }

}