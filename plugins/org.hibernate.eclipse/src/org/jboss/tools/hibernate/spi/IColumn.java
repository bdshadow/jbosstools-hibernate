package org.jboss.tools.hibernate.spi;

import org.hibernate.engine.Mapping;

public interface IColumn {

	String getName();
	Integer getSqlTypeCode();
	String getSqlType();
	int getLength();
	int getDefaultLength();
	int getPrecision();
	int getDefaultPrecision();
	int getScale();
	int getDefaultScale();
	boolean isNullable();
	IValue getValue();
	boolean isUnique();
	String getSqlType(IDialect dialect, Mapping mapping);
	void setSqlType(String sqlType);

}