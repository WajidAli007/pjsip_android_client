package com.example.sipdemo.data.db.daos;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.sipdemo.data.db.entities.SipAccount;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SipAccountDao_Impl implements SipAccountDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SipAccount> __insertionAdapterOfSipAccount;

  private final EntityDeletionOrUpdateAdapter<SipAccount> __deletionAdapterOfSipAccount;

  public SipAccountDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSipAccount = new EntityInsertionAdapter<SipAccount>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SipAccount` (`sipAccountId`,`domain`,`userName`,`displayName`,`password`,`port`,`transport`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SipAccount value) {
        stmt.bindLong(1, value.getSipAccountId());
        if (value.getDomain() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDomain());
        }
        if (value.getUserName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUserName());
        }
        if (value.getDisplayName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDisplayName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        if (value.getPort() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPort());
        }
        if (value.getTransport() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTransport());
        }
      }
    };
    this.__deletionAdapterOfSipAccount = new EntityDeletionOrUpdateAdapter<SipAccount>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SipAccount` WHERE `sipAccountId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SipAccount value) {
        stmt.bindLong(1, value.getSipAccountId());
      }
    };
  }

  @Override
  public void insertSipAccount(final SipAccount account) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSipAccount.insert(account);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAccount(final SipAccount account) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSipAccount.handle(account);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SipAccount> getSipAccounts() {
    final String _sql = "SELECT * FROM sipaccount";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSipAccountId = CursorUtil.getColumnIndexOrThrow(_cursor, "sipAccountId");
      final int _cursorIndexOfDomain = CursorUtil.getColumnIndexOrThrow(_cursor, "domain");
      final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
      final int _cursorIndexOfDisplayName = CursorUtil.getColumnIndexOrThrow(_cursor, "displayName");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfPort = CursorUtil.getColumnIndexOrThrow(_cursor, "port");
      final int _cursorIndexOfTransport = CursorUtil.getColumnIndexOrThrow(_cursor, "transport");
      final List<SipAccount> _result = new ArrayList<SipAccount>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SipAccount _item;
        final long _tmpSipAccountId;
        _tmpSipAccountId = _cursor.getLong(_cursorIndexOfSipAccountId);
        final String _tmpDomain;
        if (_cursor.isNull(_cursorIndexOfDomain)) {
          _tmpDomain = null;
        } else {
          _tmpDomain = _cursor.getString(_cursorIndexOfDomain);
        }
        final String _tmpUserName;
        if (_cursor.isNull(_cursorIndexOfUserName)) {
          _tmpUserName = null;
        } else {
          _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
        }
        final String _tmpDisplayName;
        if (_cursor.isNull(_cursorIndexOfDisplayName)) {
          _tmpDisplayName = null;
        } else {
          _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
        }
        final String _tmpPassword;
        if (_cursor.isNull(_cursorIndexOfPassword)) {
          _tmpPassword = null;
        } else {
          _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        }
        final String _tmpPort;
        if (_cursor.isNull(_cursorIndexOfPort)) {
          _tmpPort = null;
        } else {
          _tmpPort = _cursor.getString(_cursorIndexOfPort);
        }
        final String _tmpTransport;
        if (_cursor.isNull(_cursorIndexOfTransport)) {
          _tmpTransport = null;
        } else {
          _tmpTransport = _cursor.getString(_cursorIndexOfTransport);
        }
        _item = new SipAccount(_tmpSipAccountId,_tmpDomain,_tmpUserName,_tmpDisplayName,_tmpPassword,_tmpPort,_tmpTransport);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
