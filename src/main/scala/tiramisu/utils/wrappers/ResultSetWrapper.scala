package com.chrisstucchio.tiramisu.utils.wrappers

trait ResultSetWrapper extends java.sql.ResultSet {
  protected val rs: java.sql.ResultSet

  protected def methodWrap[T](f: =>T): T = f

  def absolute(x$1: Int): Boolean = methodWrap { rs.absolute(x$1) }
  def afterLast(): Unit = methodWrap { rs.afterLast() }
  def beforeFirst(): Unit = methodWrap { rs.beforeFirst() }
  def cancelRowUpdates(): Unit = methodWrap { rs.cancelRowUpdates() }
  def clearWarnings(): Unit = methodWrap { rs.clearWarnings() }
  def close(): Unit = methodWrap { rs.close() }
  def deleteRow(): Unit = methodWrap { rs.deleteRow() }
  def findColumn(x$1: String): Int = methodWrap { rs.findColumn(x$1) }
  def first(): Boolean = methodWrap { rs.first() }
  def getArray(x$1: String): java.sql.Array = methodWrap { rs.getArray(x$1) }
  def getArray(x$1: Int): java.sql.Array = methodWrap { rs.getArray(x$1) }
  def getAsciiStream(x$1: String): java.io.InputStream = methodWrap { rs.getAsciiStream(x$1) }
  def getAsciiStream(x$1: Int): java.io.InputStream = methodWrap { rs.getAsciiStream(x$1) }
  def getBigDecimal(x$1: String): java.math.BigDecimal = methodWrap { rs.getBigDecimal(x$1) }
  def getBigDecimal(x$1: Int): java.math.BigDecimal = methodWrap { rs.getBigDecimal(x$1) }
  def getBigDecimal(x$1: String,x$2: Int): java.math.BigDecimal = methodWrap { rs.getBigDecimal(x$1, x$2) }
  def getBigDecimal(x$1: Int,x$2: Int): java.math.BigDecimal = methodWrap { rs.getBigDecimal(x$1, x$2) }
  def getBinaryStream(x$1: String): java.io.InputStream = methodWrap { rs.getBinaryStream(x$1) }
  def getBinaryStream(x$1: Int): java.io.InputStream = methodWrap { rs.getBinaryStream(x$1) }
  def getBlob(x$1: String): java.sql.Blob = methodWrap { rs.getBlob(x$1) }
  def getBlob(x$1: Int): java.sql.Blob = methodWrap { rs.getBlob(x$1) }
  def getBoolean(x$1: String): Boolean = methodWrap { rs.getBoolean(x$1) }
  def getBoolean(x$1: Int): Boolean = methodWrap { rs.getBoolean(x$1) }
  def getByte(x$1: String): Byte = methodWrap { rs.getByte(x$1) }
  def getByte(x$1: Int): Byte = methodWrap { rs.getByte(x$1) }
  def getBytes(x$1: String): Array[Byte] = methodWrap { rs.getBytes(x$1) }
  def getBytes(x$1: Int): Array[Byte] = methodWrap { rs.getBytes(x$1) }
  def getCharacterStream(x$1: String): java.io.Reader = methodWrap { rs.getCharacterStream(x$1) }
  def getCharacterStream(x$1: Int): java.io.Reader = methodWrap { rs.getCharacterStream(x$1) }
  def getClob(x$1: String): java.sql.Clob = methodWrap { rs.getClob(x$1) }
  def getClob(x$1: Int): java.sql.Clob = methodWrap { rs.getClob(x$1) }
  def getConcurrency(): Int = methodWrap { rs.getConcurrency() }
  def getCursorName(): String = methodWrap { rs.getCursorName() }
  def getDate(x$1: String,x$2: java.util.Calendar): java.sql.Date = methodWrap { rs.getDate(x$1,x$2) }
  def getDate(x$1: Int,x$2: java.util.Calendar): java.sql.Date = methodWrap { rs.getDate(x$1,x$2) }
  def getDate(x$1: String): java.sql.Date = methodWrap { rs.getDate(x$1) }
  def getDate(x$1: Int): java.sql.Date = methodWrap { rs.getDate(x$1) }
  def getDouble(x$1: String): Double = methodWrap { rs.getDouble(x$1) }
  def getDouble(x$1: Int): Double = methodWrap { rs.getDouble(x$1) }
  def getFetchDirection(): Int = methodWrap { rs.getFetchDirection() }
  def getFetchSize(): Int = methodWrap { rs.getFetchSize() }
  def getFloat(x$1: String): Float = methodWrap { rs.getFloat(x$1) }
  def getFloat(x$1: Int): Float = methodWrap { rs.getFloat(x$1) }
  def getHoldability(): Int = methodWrap { rs.getHoldability() }
  def getInt(x$1: String): Int = methodWrap { rs.getInt(x$1) }
  def getInt(x$1: Int): Int = methodWrap { rs.getInt(x$1) }
  def getLong(x$1: String): Long = methodWrap { rs.getLong(x$1) }
  def getLong(x$1: Int): Long = methodWrap { rs.getLong(x$1) }
  def getMetaData(): java.sql.ResultSetMetaData = methodWrap { rs.getMetaData() }
  def getNCharacterStream(x$1: String): java.io.Reader = methodWrap { rs.getNCharacterStream(x$1) }
  def getNCharacterStream(x$1: Int): java.io.Reader = methodWrap { rs.getNCharacterStream(x$1) }
  def getNClob(x$1: String): java.sql.NClob = methodWrap { rs.getNClob(x$1) }
  def getNClob(x$1: Int): java.sql.NClob = methodWrap { rs.getNClob(x$1) }
  def getNString(x$1: String): String = methodWrap { rs.getNString(x$1) }
  def getNString(x$1: Int): String = methodWrap { rs.getNString(x$1) }
  def getObject[T](x$1: String,x$2: Class[T]): T = methodWrap { rs.getObject(x$1,x$2) }
  def getObject[T](x$1: Int,x$2: Class[T]): T = methodWrap { rs.getObject(x$1,x$2) }
  def getObject(x$1: String,x$2: java.util.Map[String,Class[_]]): Object = methodWrap { rs.getObject(x$1,x$2) }
  def getObject(x$1: Int,x$2: java.util.Map[String,Class[_]]): Object = methodWrap { rs.getObject(x$1,x$2) }
  def getObject(x$1: String): Object = methodWrap { rs.getObject(x$1) }
  def getObject(x$1: Int): Object = methodWrap { rs.getObject(x$1) }
  def getRef(x$1: String): java.sql.Ref = methodWrap { rs.getRef(x$1) }
  def getRef(x$1: Int): java.sql.Ref = methodWrap { rs.getRef(x$1) }
  def getRow(): Int = methodWrap { rs.getRow() }
  def getRowId(x$1: String): java.sql.RowId = methodWrap { rs.getRowId(x$1) }
  def getRowId(x$1: Int): java.sql.RowId = methodWrap { rs.getRowId(x$1) }
  def getSQLXML(x$1: String): java.sql.SQLXML = methodWrap { rs.getSQLXML(x$1) }
  def getSQLXML(x$1: Int): java.sql.SQLXML = methodWrap { rs.getSQLXML(x$1) }
  def getShort(x$1: String): Short = methodWrap { rs.getShort(x$1) }
  def getShort(x$1: Int): Short = methodWrap { rs.getShort(x$1) }
  def getStatement(): java.sql.Statement = methodWrap { rs.getStatement() }
  def getString(x$1: String): String = methodWrap { rs.getString(x$1) }
  def getString(x$1: Int): String = methodWrap { rs.getString(x$1) }
  def getTime(x$1: String,x$2: java.util.Calendar): java.sql.Time = methodWrap { rs.getTime(x$1,x$2) }
  def getTime(x$1: Int,x$2: java.util.Calendar): java.sql.Time = methodWrap { rs.getTime(x$1,x$2) }
  def getTime(x$1: String): java.sql.Time = methodWrap { rs.getTime(x$1) }
  def getTime(x$1: Int): java.sql.Time = methodWrap { rs.getTime(x$1) }
  def getTimestamp(x$1: String,x$2: java.util.Calendar): java.sql.Timestamp = methodWrap { rs.getTimestamp(x$1,x$2) }
  def getTimestamp(x$1: Int,x$2: java.util.Calendar): java.sql.Timestamp = methodWrap { rs.getTimestamp(x$1,x$2) }
  def getTimestamp(x$1: String): java.sql.Timestamp = methodWrap { rs.getTimestamp(x$1) }
  def getTimestamp(x$1: Int): java.sql.Timestamp = methodWrap { rs.getTimestamp(x$1) }
  def getType(): Int = methodWrap { rs.getType() }
  def getURL(x$1: String): java.net.URL = methodWrap { rs.getURL(x$1) }
  def getURL(x$1: Int): java.net.URL = methodWrap { rs.getURL(x$1) }
  def getUnicodeStream(x$1: String): java.io.InputStream = methodWrap { rs.getUnicodeStream(x$1) }
  def getUnicodeStream(x$1: Int): java.io.InputStream = methodWrap { rs.getUnicodeStream(x$1) }
  def getWarnings(): java.sql.SQLWarning = methodWrap { rs.getWarnings() }
  def insertRow(): Unit = methodWrap { rs.insertRow() }
  def isAfterLast(): Boolean = methodWrap { rs.isAfterLast() }
  def isBeforeFirst(): Boolean = methodWrap { rs.isBeforeFirst() }
  def isClosed(): Boolean = methodWrap { rs.isClosed() }
  def isFirst(): Boolean = methodWrap { rs.isFirst() }
  def isLast(): Boolean = methodWrap { rs.isLast() }
  def last(): Boolean = methodWrap { rs.last() }
  def moveToCurrentRow(): Unit = methodWrap { rs.moveToCurrentRow() }
  def moveToInsertRow(): Unit = methodWrap { rs.moveToInsertRow() }
  def next(): Boolean = methodWrap { rs.next() }
  def previous(): Boolean = methodWrap { rs.previous() }
  def refreshRow(): Unit = methodWrap { rs.refreshRow() }
  def relative(x$1: Int): Boolean = methodWrap { rs.relative(x$1) }
  def rowDeleted(): Boolean = methodWrap { rs.rowDeleted() }
  def rowInserted(): Boolean = methodWrap { rs.rowInserted() }
  def rowUpdated(): Boolean = methodWrap { rs.rowUpdated() }
  def setFetchDirection(x$1: Int): Unit = methodWrap { rs.setFetchDirection(x$1) }
  def setFetchSize(x$1: Int): Unit = methodWrap { rs.setFetchSize(x$1) }
  def updateArray(x$1: String,x$2: java.sql.Array): Unit = methodWrap { rs.updateArray(x$1,x$2) }
  def updateArray(x$1: Int,x$2: java.sql.Array): Unit = methodWrap { rs.updateArray(x$1,x$2) }
  def updateAsciiStream(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2) }
  def updateAsciiStream(x$1: Int,x$2: java.io.InputStream): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2) }
  def updateAsciiStream(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2,x$3) }
  def updateAsciiStream(x$1: Int,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2,x$3) }
  def updateAsciiStream(x$1: String,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2,x$3) }
  def updateAsciiStream(x$1: Int,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { rs.updateAsciiStream(x$1,x$2,x$3) }
  def updateBigDecimal(x$1: String,x$2: java.math.BigDecimal): Unit = methodWrap { rs.updateBigDecimal(x$1,x$2) }
  def updateBigDecimal(x$1: Int,x$2: java.math.BigDecimal): Unit = methodWrap { rs.updateBigDecimal(x$1,x$2) }
  def updateBinaryStream(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2) }
  def updateBinaryStream(x$1: Int,x$2: java.io.InputStream): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2) }
  def updateBinaryStream(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2,x$3) }
  def updateBinaryStream(x$1: Int,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2,x$3) }
  def updateBinaryStream(x$1: String,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2,x$3) }
  def updateBinaryStream(x$1: Int,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { rs.updateBinaryStream(x$1,x$2,x$3) }
  def updateBlob(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { rs.updateBlob(x$1,x$2) }
  def updateBlob(x$1: Int,x$2: java.io.InputStream): Unit = methodWrap { rs.updateBlob(x$1,x$2) }
  def updateBlob(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateBlob(x$1,x$2,x$3) }
  def updateBlob(x$1: Int,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { rs.updateBlob(x$1,x$2,x$3) }
  def updateBlob(x$1: String,x$2: java.sql.Blob): Unit = methodWrap { rs.updateBlob(x$1,x$2) }
  def updateBlob(x$1: Int,x$2: java.sql.Blob): Unit = methodWrap { rs.updateBlob(x$1,x$2) }
  def updateBoolean(x$1: String,x$2: Boolean): Unit = methodWrap { rs.updateBoolean(x$1,x$2) }
  def updateBoolean(x$1: Int,x$2: Boolean): Unit = methodWrap { rs.updateBoolean(x$1,x$2) }
  def updateByte(x$1: String,x$2: Byte): Unit = methodWrap { rs.updateByte(x$1,x$2) }
  def updateByte(x$1: Int,x$2: Byte): Unit = methodWrap { rs.updateByte(x$1,x$2) }
  def updateBytes(x$1: String,x$2: Array[Byte]): Unit = methodWrap { rs.updateBytes(x$1,x$2) }
  def updateBytes(x$1: Int,x$2: Array[Byte]): Unit = methodWrap { rs.updateBytes(x$1,x$2) }
  def updateCharacterStream(x$1: String,x$2: java.io.Reader): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2) }
  def updateCharacterStream(x$1: Int,x$2: java.io.Reader): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2) }
  def updateCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2,x$3) }
  def updateCharacterStream(x$1: Int,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2,x$3) }
  def updateCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Int): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2,x$3) }
  def updateCharacterStream(x$1: Int,x$2: java.io.Reader,x$3: Int): Unit = methodWrap { rs.updateCharacterStream(x$1,x$2,x$3) }
  def updateClob(x$1: String,x$2: java.io.Reader): Unit = methodWrap { rs.updateClob(x$1,x$2) }
  def updateClob(x$1: Int,x$2: java.io.Reader): Unit = methodWrap { rs.updateClob(x$1,x$2) }
  def updateClob(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateClob(x$1,x$2,x$3) }
  def updateClob(x$1: Int,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateClob(x$1,x$2,x$3) }
  def updateClob(x$1: String,x$2: java.sql.Clob): Unit = methodWrap { rs.updateClob(x$1,x$2) }
  def updateClob(x$1: Int,x$2: java.sql.Clob): Unit = methodWrap { rs.updateClob(x$1,x$2) }
  def updateDate(x$1: String,x$2: java.sql.Date): Unit = methodWrap { rs.updateDate(x$1,x$2) }
  def updateDate(x$1: Int,x$2: java.sql.Date): Unit = methodWrap { rs.updateDate(x$1,x$2) }
  def updateDouble(x$1: String,x$2: Double): Unit = methodWrap { rs.updateDouble(x$1,x$2) }
  def updateDouble(x$1: Int,x$2: Double): Unit = methodWrap { rs.updateDouble(x$1,x$2) }
  def updateFloat(x$1: String,x$2: Float): Unit = methodWrap { rs.updateFloat(x$1,x$2) }
  def updateFloat(x$1: Int,x$2: Float): Unit = methodWrap { rs.updateFloat(x$1,x$2) }
  def updateInt(x$1: String,x$2: Int): Unit = methodWrap { rs.updateInt(x$1,x$2) }
  def updateInt(x$1: Int,x$2: Int): Unit = methodWrap { rs.updateInt(x$1,x$2) }
  def updateLong(x$1: String,x$2: Long): Unit = methodWrap { rs.updateLong(x$1,x$2) }
  def updateLong(x$1: Int,x$2: Long): Unit = methodWrap { rs.updateLong(x$1,x$2) }
  def updateNCharacterStream(x$1: String,x$2: java.io.Reader): Unit = methodWrap { rs.updateNCharacterStream(x$1,x$2) }
  def updateNCharacterStream(x$1: Int,x$2: java.io.Reader): Unit = methodWrap { rs.updateNCharacterStream(x$1,x$2) }
  def updateNCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateNCharacterStream(x$1,x$2,x$3) }
  def updateNCharacterStream(x$1: Int,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateNCharacterStream(x$1,x$2,x$3) }
  def updateNClob(x$1: String,x$2: java.io.Reader): Unit = methodWrap { rs.updateNClob(x$1,x$2) }
  def updateNClob(x$1: Int,x$2: java.io.Reader): Unit = methodWrap { rs.updateNClob(x$1,x$2) }
  def updateNClob(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateNClob(x$1,x$2,x$3) }
  def updateNClob(x$1: Int,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { rs.updateNClob(x$1,x$2,x$3) }
  def updateNClob(x$1: String,x$2: java.sql.NClob): Unit = methodWrap { rs.updateNClob(x$1,x$2) }
  def updateNClob(x$1: Int,x$2: java.sql.NClob): Unit = methodWrap { rs.updateNClob(x$1,x$2) }
  def updateNString(x$1: String,x$2: String): Unit = methodWrap { rs.updateNString(x$1,x$2) }
  def updateNString(x$1: Int,x$2: String): Unit = methodWrap { rs.updateNString(x$1,x$2) }
  def updateNull(x$1: String): Unit = methodWrap { rs.updateNull(x$1) }
  def updateNull(x$1: Int): Unit = methodWrap { rs.updateNull(x$1) }
  def updateObject(x$1: String,x$2: Any): Unit = methodWrap { rs.updateObject(x$1,x$2) }
  def updateObject(x$1: String,x$2: Any,x$3: Int): Unit = methodWrap { rs.updateObject(x$1,x$2,x$3) }
  def updateObject(x$1: Int,x$2: Any): Unit = methodWrap { rs.updateObject(x$1,x$2) }
  def updateObject(x$1: Int,x$2: Any,x$3: Int): Unit = methodWrap { rs.updateObject(x$1,x$2,x$3) }
  def updateRef(x$1: String,x$2: java.sql.Ref): Unit = methodWrap { rs.updateRef(x$1,x$2) }
  def updateRef(x$1: Int,x$2: java.sql.Ref): Unit = methodWrap { rs.updateRef(x$1,x$2) }
  def updateRow(): Unit = methodWrap { rs.updateRow() }
  def updateRowId(x$1: String,x$2: java.sql.RowId): Unit = methodWrap { rs.updateRowId(x$1,x$2) }
  def updateRowId(x$1: Int,x$2: java.sql.RowId): Unit = methodWrap { rs.updateRowId(x$1,x$2) }
  def updateSQLXML(x$1: String,x$2: java.sql.SQLXML): Unit = methodWrap { rs.updateSQLXML(x$1,x$2) }
  def updateSQLXML(x$1: Int,x$2: java.sql.SQLXML): Unit = methodWrap { rs.updateSQLXML(x$1,x$2) }
  def updateShort(x$1: String,x$2: Short): Unit = methodWrap { rs.updateShort(x$1,x$2) }
  def updateShort(x$1: Int,x$2: Short): Unit = methodWrap { rs.updateShort(x$1,x$2) }
  def updateString(x$1: String,x$2: String): Unit = methodWrap { rs.updateString(x$1,x$2) }
  def updateString(x$1: Int,x$2: String): Unit = methodWrap { rs.updateString(x$1,x$2) }
  def updateTime(x$1: String,x$2: java.sql.Time): Unit = methodWrap { rs.updateTime(x$1,x$2) }
  def updateTime(x$1: Int,x$2: java.sql.Time): Unit = methodWrap { rs.updateTime(x$1,x$2) }
  def updateTimestamp(x$1: String,x$2: java.sql.Timestamp): Unit = methodWrap { rs.updateTimestamp(x$1,x$2) }
  def updateTimestamp(x$1: Int,x$2: java.sql.Timestamp): Unit = methodWrap { rs.updateTimestamp(x$1,x$2) }
  def wasNull(): Boolean = methodWrap { rs.wasNull() }

  def isWrapperFor(x$1: Class[_]): Boolean = methodWrap { rs.isWrapperFor(x$1) }
  def unwrap[T](x$1: Class[T]): T = methodWrap { rs.unwrap(x$1) }
}
