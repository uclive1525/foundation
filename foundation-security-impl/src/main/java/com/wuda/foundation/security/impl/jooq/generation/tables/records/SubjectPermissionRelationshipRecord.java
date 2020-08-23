/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation.tables.records;


import com.wuda.foundation.security.impl.jooq.generation.tables.SubjectPermissionRelationship;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * subject可以代表用户，也可以代表想要访问其他资源的应用，suibject与permission的关联关系表。比如我们可以说user 【IS 
 * A】 subject
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SubjectPermissionRelationshipRecord extends UpdatableRecordImpl<SubjectPermissionRelationshipRecord> implements Record9<ULong, UByte, ULong, ULong, ULong, String, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 887042071;

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.subject_type</code>. subject的类型，比如subject代表用户
     */
    public void setSubjectType(UByte value) {
        set(1, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.subject_type</code>. subject的类型，比如subject代表用户
     */
    public UByte getSubjectType() {
        return (UByte) get(1);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public void setSubjectIdentifier(ULong value) {
        set(2, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.subject_identifier</code>. 如果subject type代表用户，那么这个值可能就是用户ID
     */
    public ULong getSubjectIdentifier() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.persission_target_id</code>.
     */
    public void setPersissionTargetId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.persission_target_id</code>.
     */
    public ULong getPersissionTargetId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.permission_action_id</code>. permission action id，如果为0，则表示没有分配action
     */
    public void setPermissionActionId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.permission_action_id</code>. permission action id，如果为0，则表示没有分配action
     */
    public ULong getPermissionActionId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.command</code>. 可选值有grant，revoke
     */
    public void setCommand(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.command</code>. 可选值有grant，revoke
     */
    public String getCommand() {
        return (String) get(5);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>foundation_security.subject_permission_relationship.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>foundation_security.subject_permission_relationship.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, UByte, ULong, ULong, ULong, String, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, UByte, ULong, ULong, ULong, String, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.ID;
    }

    @Override
    public Field<UByte> field2() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.SUBJECT_TYPE;
    }

    @Override
    public Field<ULong> field3() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.SUBJECT_IDENTIFIER;
    }

    @Override
    public Field<ULong> field4() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.PERSISSION_TARGET_ID;
    }

    @Override
    public Field<ULong> field5() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.PERMISSION_ACTION_ID;
    }

    @Override
    public Field<String> field6() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.COMMAND;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.CREATE_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.CREATE_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public UByte component2() {
        return getSubjectType();
    }

    @Override
    public ULong component3() {
        return getSubjectIdentifier();
    }

    @Override
    public ULong component4() {
        return getPersissionTargetId();
    }

    @Override
    public ULong component5() {
        return getPermissionActionId();
    }

    @Override
    public String component6() {
        return getCommand();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public ULong component8() {
        return getCreateUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public UByte value2() {
        return getSubjectType();
    }

    @Override
    public ULong value3() {
        return getSubjectIdentifier();
    }

    @Override
    public ULong value4() {
        return getPersissionTargetId();
    }

    @Override
    public ULong value5() {
        return getPermissionActionId();
    }

    @Override
    public String value6() {
        return getCommand();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public ULong value8() {
        return getCreateUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public SubjectPermissionRelationshipRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value2(UByte value) {
        setSubjectType(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value3(ULong value) {
        setSubjectIdentifier(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value4(ULong value) {
        setPersissionTargetId(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value5(ULong value) {
        setPermissionActionId(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value6(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value8(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public SubjectPermissionRelationshipRecord values(ULong value1, UByte value2, ULong value3, ULong value4, ULong value5, String value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SubjectPermissionRelationshipRecord
     */
    public SubjectPermissionRelationshipRecord() {
        super(SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP);
    }

    /**
     * Create a detached, initialised SubjectPermissionRelationshipRecord
     */
    public SubjectPermissionRelationshipRecord(ULong id, UByte subjectType, ULong subjectIdentifier, ULong persissionTargetId, ULong permissionActionId, String command, LocalDateTime createTime, ULong createUserId, ULong isDeleted) {
        super(SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP);

        set(0, id);
        set(1, subjectType);
        set(2, subjectIdentifier);
        set(3, persissionTargetId);
        set(4, permissionActionId);
        set(5, command);
        set(6, createTime);
        set(7, createUserId);
        set(8, isDeleted);
    }
}
