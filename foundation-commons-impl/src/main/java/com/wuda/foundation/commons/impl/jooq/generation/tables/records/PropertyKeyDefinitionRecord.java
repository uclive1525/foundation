/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables.records;


import com.wuda.foundation.commons.impl.jooq.generation.tables.PropertyKeyDefinition;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * property key 的定义，就好像是数据库表中列的定义是类似的
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PropertyKeyDefinitionRecord extends UpdatableRecordImpl<PropertyKeyDefinitionRecord> implements Record8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1774401871;

    /**
     * Setter for <code>foundation_commons.property_key_definition.property_definition_id</code>.
     */
    public void setPropertyDefinitionId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.property_definition_id</code>.
     */
    public ULong getPropertyDefinitionId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.property_key_id</code>. 属性值ID
     */
    public void setPropertyKeyId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.property_key_id</code>. 属性值ID
     */
    public ULong getPropertyKeyId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.data_type</code>. 数据类型，格式是schema:datatype。比如：MySQL:VARCHAR
     */
    public void setDataType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.data_type</code>. 数据类型，格式是schema:datatype。比如：MySQL:VARCHAR
     */
    public String getDataType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(6);
    }

    /**
     * Setter for <code>foundation_commons.property_key_definition.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_commons.property_key_definition.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_DEFINITION_ID;
    }

    @Override
    public Field<ULong> field2() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.PROPERTY_KEY_ID;
    }

    @Override
    public Field<String> field3() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.DATA_TYPE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.CREATE_TIME;
    }

    @Override
    public Field<ULong> field5() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field7() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field8() {
        return PropertyKeyDefinition.PROPERTY_KEY_DEFINITION.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getPropertyDefinitionId();
    }

    @Override
    public ULong component2() {
        return getPropertyKeyId();
    }

    @Override
    public String component3() {
        return getDataType();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public ULong component5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getLastModifyTime();
    }

    @Override
    public ULong component7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component8() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getPropertyDefinitionId();
    }

    @Override
    public ULong value2() {
        return getPropertyKeyId();
    }

    @Override
    public String value3() {
        return getDataType();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public ULong value5() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getLastModifyTime();
    }

    @Override
    public ULong value7() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value8() {
        return getIsDeleted();
    }

    @Override
    public PropertyKeyDefinitionRecord value1(ULong value) {
        setPropertyDefinitionId(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value2(ULong value) {
        setPropertyKeyId(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value3(String value) {
        setDataType(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value5(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value6(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value7(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord value8(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public PropertyKeyDefinitionRecord values(ULong value1, ULong value2, String value3, LocalDateTime value4, ULong value5, LocalDateTime value6, ULong value7, ULong value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PropertyKeyDefinitionRecord
     */
    public PropertyKeyDefinitionRecord() {
        super(PropertyKeyDefinition.PROPERTY_KEY_DEFINITION);
    }

    /**
     * Create a detached, initialised PropertyKeyDefinitionRecord
     */
    public PropertyKeyDefinitionRecord(ULong propertyDefinitionId, ULong propertyKeyId, String dataType, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(PropertyKeyDefinition.PROPERTY_KEY_DEFINITION);

        set(0, propertyDefinitionId);
        set(1, propertyKeyId);
        set(2, dataType);
        set(3, createTime);
        set(4, createUserId);
        set(5, lastModifyTime);
        set(6, lastModifyUserId);
        set(7, isDeleted);
    }
}