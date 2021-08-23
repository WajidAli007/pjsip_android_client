package com.example.sipdemo.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.sipdemo.data.db.daos.SipAccountDao;
import com.example.sipdemo.data.db.daos.SipAccountDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MyRoomDatabase_Impl extends MyRoomDatabase {
  private volatile SipAccountDao _sipAccountDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SipAccount` (`sipAccountId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `domain` TEXT NOT NULL, `userName` TEXT NOT NULL, `displayName` TEXT NOT NULL, `password` TEXT NOT NULL, `port` TEXT NOT NULL, `transport` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ffa6f9cd1861361b6e226168c5f3066f')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `SipAccount`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSipAccount = new HashMap<String, TableInfo.Column>(7);
        _columnsSipAccount.put("sipAccountId", new TableInfo.Column("sipAccountId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("domain", new TableInfo.Column("domain", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("displayName", new TableInfo.Column("displayName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("port", new TableInfo.Column("port", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSipAccount.put("transport", new TableInfo.Column("transport", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSipAccount = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSipAccount = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSipAccount = new TableInfo("SipAccount", _columnsSipAccount, _foreignKeysSipAccount, _indicesSipAccount);
        final TableInfo _existingSipAccount = TableInfo.read(_db, "SipAccount");
        if (! _infoSipAccount.equals(_existingSipAccount)) {
          return new RoomOpenHelper.ValidationResult(false, "SipAccount(com.example.sipdemo.data.db.entities.SipAccount).\n"
                  + " Expected:\n" + _infoSipAccount + "\n"
                  + " Found:\n" + _existingSipAccount);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ffa6f9cd1861361b6e226168c5f3066f", "c08d29dddf145bb66c18a7a66cfbc90e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "SipAccount");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `SipAccount`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SipAccountDao.class, SipAccountDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public SipAccountDao sipAccountDao() {
    if (_sipAccountDao != null) {
      return _sipAccountDao;
    } else {
      synchronized(this) {
        if(_sipAccountDao == null) {
          _sipAccountDao = new SipAccountDao_Impl(this);
        }
        return _sipAccountDao;
      }
    }
  }
}
