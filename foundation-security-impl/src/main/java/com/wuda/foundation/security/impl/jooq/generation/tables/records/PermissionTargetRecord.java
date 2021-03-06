/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables.records;


import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionTarget;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * permission作用的对象，分为两类，1，关联外部对象，使用type字段表明外部对象的类型，referenced_id表明外部对象的唯一标记，比如在web系统中，已经拥有了菜单表，如果要对菜单权限控制，使用referenced_id关联菜单表的主键ID，就可以将permission与菜单数据建立联系，而不需要把菜单相关的逻辑引入到权限体系中；2，不关联外部对象，当前表中的信息就已经描述了作用对象的信息。对于permission体系来说，permission 
 * target是主体（一等公民），permiss
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionTargetRecord extends UpdatableRecordImpl<PermissionTargetRecord> implements Record12<ULong, ULong, String, UByte, UByte, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1561849387;

    /**
     * Setter for <code>foundation_security.permission_target.permission_target_id</code>.
     */
    public void setPermissionTargetId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.permission_target_id</code>.
     */
    public ULong getPermissionTargetId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_security.permission_target.permission_category_id</code>. 分类
     */
    public void setPermissionCategoryId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.permission_category_id</code>. 分类
     */
    public ULong getPermissionCategoryId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>foundation_security.permission_target.name</code>. permission target  name。在java.security.Permission#getName设计中，name就唯一识别了作用对象，类似的，在我们这里，由于有分类，因此只要在分类中唯一即可
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.name</code>. permission target  name。在java.security.Permission#getName设计中，name就唯一识别了作用对象，类似的，在我们这里，由于有分类，因此只要在分类中唯一即可
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>foundation_security.permission_target.type</code>. permission target的类型。假设在一个web系统中，有两种类型的权限控制，一种是为用户授权可以使用系统的哪些功能；另外一种是为用户授权可以使用哪种终端访问系统(比如App，pc)，这两类是完全不同的对象，需要区分开,便于管理。
     */
    public void setType(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.type</code>. permission target的类型。假设在一个web系统中，有两种类型的权限控制，一种是为用户授权可以使用系统的哪些功能；另外一种是为用户授权可以使用哪种终端访问系统(比如App，pc)，这两类是完全不同的对象，需要区分开,便于管理。
     */
    public UByte getType() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>foundation_security.permission_target.referenced_type</code>. 关联的外部对象的类型。注意和type字段的区别，在实际中，有可能这两个字段的值是一样的，但是在意义上却是完全不一样的，而且有可能一种type的target，由关联的多种referenced_type组成
     */
    public void setReferencedType(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.referenced_type</code>. 关联的外部对象的类型。注意和type字段的区别，在实际中，有可能这两个字段的值是一样的，但是在意义上却是完全不一样的，而且有可能一种type的target，由关联的多种referenced_type组成
     */
    public UByte getReferencedType() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>foundation_security.permission_target.referenced_identifier</code>. 该target关联的外部对象的唯一标记，如果为0，表示并没有关联外部对象。这样设计的目的是：不把作用对象放在权限体系中，而是任何想要使用权限体系的外部对象，通过该字段关联到自己，这样就可以做到权限体系的最大可扩展性。举例：在web系统中，如果已经拥有了菜单表，如果要对菜单权限控制，就可以使用该字段将permission与菜单数据建立联系，而不需要把菜单相关的逻辑引入到权限体系中，但是，如果多种外部对象通过该字段关联进来，有可能identifier冲突，因此需要type字段一起做唯一控制
     */
    public void setReferencedIdentifier(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.referenced_identifier</code>. 该target关联的外部对象的唯一标记，如果为0，表示并没有关联外部对象。这样设计的目的是：不把作用对象放在权限体系中，而是任何想要使用权限体系的外部对象，通过该字段关联到自己，这样就可以做到权限体系的最大可扩展性。举例：在web系统中，如果已经拥有了菜单表，如果要对菜单权限控制，就可以使用该字段将permission与菜单数据建立联系，而不需要把菜单相关的逻辑引入到权限体系中，但是，如果多种外部对象通过该字段关联进来，有可能identifier冲突，因此需要type字段一起做唯一控制
     */
    public ULong getReferencedIdentifier() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>foundation_security.permission_target.description</code>. 描述
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.description</code>. 描述
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>foundation_security.permission_target.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>foundation_security.permission_target.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>foundation_security.permission_target.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>foundation_security.permission_target.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(10, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>foundation_security.permission_target.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(11, value);
    }

    /**
     * Getter for <code>foundation_security.permission_target.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<ULong, ULong, String, UByte, UByte, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<ULong, ULong, String, UByte, UByte, ULong, String, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return PermissionTarget.PERMISSION_TARGET.PERMISSION_TARGET_ID;
    }

    @Override
    public Field<ULong> field2() {
        return PermissionTarget.PERMISSION_TARGET.PERMISSION_CATEGORY_ID;
    }

    @Override
    public Field<String> field3() {
        return PermissionTarget.PERMISSION_TARGET.NAME;
    }

    @Override
    public Field<UByte> field4() {
        return PermissionTarget.PERMISSION_TARGET.TYPE;
    }

    @Override
    public Field<UByte> field5() {
        return PermissionTarget.PERMISSION_TARGET.REFERENCED_TYPE;
    }

    @Override
    public Field<ULong> field6() {
        return PermissionTarget.PERMISSION_TARGET.REFERENCED_IDENTIFIER;
    }

    @Override
    public Field<String> field7() {
        return PermissionTarget.PERMISSION_TARGET.DESCRIPTION;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return PermissionTarget.PERMISSION_TARGET.CREATE_TIME;
    }

    @Override
    public Field<ULong> field9() {
        return PermissionTarget.PERMISSION_TARGET.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return PermissionTarget.PERMISSION_TARGET.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field11() {
        return PermissionTarget.PERMISSION_TARGET.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field12() {
        return PermissionTarget.PERMISSION_TARGET.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getPermissionTargetId();
    }

    @Override
    public ULong component2() {
        return getPermissionCategoryId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public UByte component4() {
        return getType();
    }

    @Override
    public UByte component5() {
        return getReferencedType();
    }

    @Override
    public ULong component6() {
        return getReferencedIdentifier();
    }

    @Override
    public String component7() {
        return getDescription();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public ULong component9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component10() {
        return getLastModifyTime();
    }

    @Override
    public ULong component11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component12() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getPermissionTargetId();
    }

    @Override
    public ULong value2() {
        return getPermissionCategoryId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public UByte value4() {
        return getType();
    }

    @Override
    public UByte value5() {
        return getReferencedType();
    }

    @Override
    public ULong value6() {
        return getReferencedIdentifier();
    }

    @Override
    public String value7() {
        return getDescription();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public ULong value9() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value10() {
        return getLastModifyTime();
    }

    @Override
    public ULong value11() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value12() {
        return getIsDeleted();
    }

    @Override
    public PermissionTargetRecord value1(ULong value) {
        setPermissionTargetId(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value2(ULong value) {
        setPermissionCategoryId(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value4(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value5(UByte value) {
        setReferencedType(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value6(ULong value) {
        setReferencedIdentifier(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value7(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value9(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value10(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value11(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public PermissionTargetRecord value12(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public PermissionTargetRecord values(ULong value1, ULong value2, String value3, UByte value4, UByte value5, ULong value6, String value7, LocalDateTime value8, ULong value9, LocalDateTime value10, ULong value11, ULong value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermissionTargetRecord
     */
    public PermissionTargetRecord() {
        super(PermissionTarget.PERMISSION_TARGET);
    }

    /**
     * Create a detached, initialised PermissionTargetRecord
     */
    public PermissionTargetRecord(ULong permissionTargetId, ULong permissionCategoryId, String name, UByte type, UByte referencedType, ULong referencedIdentifier, String description, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(PermissionTarget.PERMISSION_TARGET);

        set(0, permissionTargetId);
        set(1, permissionCategoryId);
        set(2, name);
        set(3, type);
        set(4, referencedType);
        set(5, referencedIdentifier);
        set(6, description);
        set(7, createTime);
        set(8, createUserId);
        set(9, lastModifyTime);
        set(10, lastModifyUserId);
        set(11, isDeleted);
    }
}
