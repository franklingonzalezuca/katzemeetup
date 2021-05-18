package edu.franksprachen.katzemeetup.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import edu.franksprachen.katzemeetup.model.Image;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CatDao_Impl implements CatDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CatCacheEntity> __insertionAdapterOfCatCacheEntity;

  private final Converters __converters = new Converters();

  public CatDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCatCacheEntity = new EntityInsertionAdapter<CatCacheEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Breeds` (`id`,`temperament`,`origin`,`name`,`image`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CatCacheEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTemperament() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTemperament());
        }
        if (value.getOrigin() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOrigin());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        final String _tmp;
        _tmp = __converters.StringToImage(value.getImage());
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp);
        }
      }
    };
  }

  @Override
  public Object insertCat(final CatCacheEntity catEntity, final Continuation<? super Long> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfCatCacheEntity.insertAndReturnId(catEntity);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getCats(final Continuation<? super List<CatCacheEntity>> p0) {
    final String _sql = "SELECT `Breeds`.`id` AS `id`, `Breeds`.`temperament` AS `temperament`, `Breeds`.`origin` AS `origin`, `Breeds`.`name` AS `name`, `Breeds`.`image` AS `image` FROM Breeds";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<CatCacheEntity>>() {
      @Override
      public List<CatCacheEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTemperament = CursorUtil.getColumnIndexOrThrow(_cursor, "temperament");
          final int _cursorIndexOfOrigin = CursorUtil.getColumnIndexOrThrow(_cursor, "origin");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final List<CatCacheEntity> _result = new ArrayList<CatCacheEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CatCacheEntity _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTemperament;
            _tmpTemperament = _cursor.getString(_cursorIndexOfTemperament);
            final String _tmpOrigin;
            _tmpOrigin = _cursor.getString(_cursorIndexOfOrigin);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final Image _tmpImage;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfImage);
            _tmpImage = __converters.ImagetoString(_tmp);
            _item = new CatCacheEntity(_tmpId,_tmpTemperament,_tmpOrigin,_tmpName,_tmpImage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
