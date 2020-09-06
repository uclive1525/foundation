/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.commons.impl.jooq.generation.tables;


import com.wuda.foundation.commons.impl.jooq.generation.FoundationCommons;
import com.wuda.foundation.commons.impl.jooq.generation.Indexes;
import com.wuda.foundation.commons.impl.jooq.generation.Keys;
import com.wuda.foundation.commons.impl.jooq.generation.tables.records.TreeNodeRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * 树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TreeNode extends TableImpl<TreeNodeRecord> {

    private static final long serialVersionUID = 62660737;

    /**
     * The reference instance of <code>foundation_commons.tree_node</code>
     */
    public static final TreeNode TREE_NODE = new TreeNode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TreeNodeRecord> getRecordType() {
        return TreeNodeRecord.class;
    }

    /**
     * The column <code>foundation_commons.tree_node.tree_node_id</code>.
     */
    public final TableField<TreeNodeRecord, ULong> TREE_NODE_ID = createField(DSL.name("tree_node_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>foundation_commons.tree_node.name</code>. 节点名称
     */
    public final TableField<TreeNodeRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "节点名称");

    /**
     * The column <code>foundation_commons.tree_node.description</code>. 节点的描述
     */
    public final TableField<TreeNodeRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "节点的描述");

    /**
     * The column <code>foundation_commons.tree_node.parent_node_id</code>. 指向父节点ID
     */
    public final TableField<TreeNodeRecord, ULong> PARENT_NODE_ID = createField(DSL.name("parent_node_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "指向父节点ID");

    /**
     * The column <code>foundation_commons.tree_node.create_time</code>.
     */
    public final TableField<TreeNodeRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.tree_node.create_user_id</code>.
     */
    public final TableField<TreeNodeRecord, ULong> CREATE_USER_ID = createField(DSL.name("create_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.tree_node.last_modify_time</code>.
     */
    public final TableField<TreeNodeRecord, LocalDateTime> LAST_MODIFY_TIME = createField(DSL.name("last_modify_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>foundation_commons.tree_node.last_modify_user_id</code>.
     */
    public final TableField<TreeNodeRecord, ULong> LAST_MODIFY_USER_ID = createField(DSL.name("last_modify_user_id"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>foundation_commons.tree_node.is_deleted</code>.
     */
    public final TableField<TreeNodeRecord, ULong> IS_DELETED = createField(DSL.name("is_deleted"), org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * Create a <code>foundation_commons.tree_node</code> table reference
     */
    public TreeNode() {
        this(DSL.name("tree_node"), null);
    }

    /**
     * Create an aliased <code>foundation_commons.tree_node</code> table reference
     */
    public TreeNode(String alias) {
        this(DSL.name(alias), TREE_NODE);
    }

    /**
     * Create an aliased <code>foundation_commons.tree_node</code> table reference
     */
    public TreeNode(Name alias) {
        this(alias, TREE_NODE);
    }

    private TreeNode(Name alias, Table<TreeNodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private TreeNode(Name alias, Table<TreeNodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("树形结构的节点。有很多数据是用树形结构组织的，比如商品分类，文章分类，组织架构等等，通常我们都是为它们单独设计一个表，比如商品分类表，部门表，然后每个表都写了差不多相同的处理逻辑，如何避免重复处理类似树形的数据呢？这个表的目的就是为了统一处理这些类似树形结构的表，以这个表为核心，扩展出商品分类，文章分类，部门等。"), TableOptions.table());
    }

    public <O extends Record> TreeNode(Table<O> child, ForeignKey<O, TreeNodeRecord> key) {
        super(child, key, TREE_NODE);
    }

    @Override
    public Schema getSchema() {
        return FoundationCommons.FOUNDATION_COMMONS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TREE_NODE_IDX_PARENT);
    }

    @Override
    public Identity<TreeNodeRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TREE_NODE;
    }

    @Override
    public UniqueKey<TreeNodeRecord> getPrimaryKey() {
        return Keys.KEY_TREE_NODE_PRIMARY;
    }

    @Override
    public List<UniqueKey<TreeNodeRecord>> getKeys() {
        return Arrays.<UniqueKey<TreeNodeRecord>>asList(Keys.KEY_TREE_NODE_PRIMARY);
    }

    @Override
    public TreeNode as(String alias) {
        return new TreeNode(DSL.name(alias), this);
    }

    @Override
    public TreeNode as(Name alias) {
        return new TreeNode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TreeNode rename(String name) {
        return new TreeNode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TreeNode rename(Name name) {
        return new TreeNode(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, String, String, ULong, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}