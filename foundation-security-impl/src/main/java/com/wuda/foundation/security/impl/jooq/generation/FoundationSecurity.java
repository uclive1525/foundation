/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.security.impl.jooq.generation;


import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionAction;
import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionCategory;
import com.wuda.foundation.security.impl.jooq.generation.tables.PermissionTarget;
import com.wuda.foundation.security.impl.jooq.generation.tables.SubjectPermissionRelationship;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FoundationSecurity extends SchemaImpl {

    private static final long serialVersionUID = 1570363257;

    /**
     * The reference instance of <code>foundation_security</code>
     */
    public static final FoundationSecurity FOUNDATION_SECURITY = new FoundationSecurity();

    /**
     * permission允许的行为。参考: java.security.Permission#getActions。为什么要把作用对象和对该对象的action分开呢？因为对于同一个作用对象，可能有多个action，比如对于一个文件可以有读和写权限。action可以关联外部对象，具体的解释可以参考permission targe ,它们对于关联外部对象的定义是一样的。
     */
    public final PermissionAction PERMISSION_ACTION = PermissionAction.PERMISSION_ACTION;

    /**
     * permission分类
     */
    public final PermissionCategory PERMISSION_CATEGORY = PermissionCategory.PERMISSION_CATEGORY;

    /**
     * permission作用的对象，分为两类，1，关联外部对象，使用type字段表明外部对象的类型，referenced_id表明外部对象的唯一标记，比如在web系统中，已经拥有了菜单表，如果要对菜单权限控制，使用referenced_id关联菜单表的主键ID，就可以将permission与菜单数据建立联系，而不需要把菜单相关的逻辑引入到权限体系中；2，不关联外部对象，当前表中的信息就已经描述了作用对象的信息。对于permission体系来说，permission target是主体（一等公民），permiss
     */
    public final PermissionTarget PERMISSION_TARGET = PermissionTarget.PERMISSION_TARGET;

    /**
     * subject可以代表用户，也可以代表想要访问其他资源的应用，suibject与permission的关联关系表。比如我们可以说user 【IS A】 subject
     */
    public final SubjectPermissionRelationship SUBJECT_PERMISSION_RELATIONSHIP = SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP;

    /**
     * No further instances allowed
     */
    private FoundationSecurity() {
        super("foundation_security", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            PermissionAction.PERMISSION_ACTION,
            PermissionCategory.PERMISSION_CATEGORY,
            PermissionTarget.PERMISSION_TARGET,
            SubjectPermissionRelationship.SUBJECT_PERMISSION_RELATIONSHIP);
    }
}
