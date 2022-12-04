/*
 * This file is generated by jOOQ.
 */
package com.example.banksystem.database.schema.tables;


import com.example.banksystem.database.schema.Keys;
import com.example.banksystem.database.schema.Public;
import com.example.banksystem.database.schema.tables.records.BankInfoRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankInfo extends TableImpl<BankInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.bank_info</code>
     */
    public static final BankInfo BANK_INFO = new BankInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankInfoRecord> getRecordType() {
        return BankInfoRecord.class;
    }

    /**
     * The column <code>public.bank_info.id</code>.
     */
    public final TableField<BankInfoRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.bank_info.bank_id</code>.
     */
    public final TableField<BankInfoRecord, Integer> BANK_ID = createField(DSL.name("bank_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_info.min_sum</code>.
     */
    public final TableField<BankInfoRecord, Integer> MIN_SUM = createField(DSL.name("min_sum"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_info.max_sum</code>.
     */
    public final TableField<BankInfoRecord, Integer> MAX_SUM = createField(DSL.name("max_sum"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_info.min_term</code>.
     */
    public final TableField<BankInfoRecord, Integer> MIN_TERM = createField(DSL.name("min_term"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_info.max_term</code>.
     */
    public final TableField<BankInfoRecord, Integer> MAX_TERM = createField(DSL.name("max_term"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bank_info.percent</code>.
     */
    public final TableField<BankInfoRecord, Float> PERCENT = createField(DSL.name("percent"), SQLDataType.REAL.nullable(false), this, "");

    private BankInfo(Name alias, Table<BankInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankInfo(Name alias, Table<BankInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.bank_info</code> table reference
     */
    public BankInfo(String alias) {
        this(DSL.name(alias), BANK_INFO);
    }

    /**
     * Create an aliased <code>public.bank_info</code> table reference
     */
    public BankInfo(Name alias) {
        this(alias, BANK_INFO);
    }

    /**
     * Create a <code>public.bank_info</code> table reference
     */
    public BankInfo() {
        this(DSL.name("bank_info"), null);
    }

    public <O extends Record> BankInfo(Table<O> child, ForeignKey<O, BankInfoRecord> key) {
        super(child, key, BANK_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<BankInfoRecord, Integer> getIdentity() {
        return (Identity<BankInfoRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<BankInfoRecord> getPrimaryKey() {
        return Keys.BANK_INFO_PKEY;
    }

    @Override
    public List<ForeignKey<BankInfoRecord, ?>> getReferences() {
        return Arrays.asList(Keys.BANK_INFO__FK_BANK_ID);
    }

    private transient BankType _bankType;

    public BankType bankType() {
        if (_bankType == null)
            _bankType = new BankType(this, Keys.BANK_INFO__FK_BANK_ID);

        return _bankType;
    }

    @Override
    public BankInfo as(String alias) {
        return new BankInfo(DSL.name(alias), this);
    }

    @Override
    public BankInfo as(Name alias) {
        return new BankInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankInfo rename(String name) {
        return new BankInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankInfo rename(Name name) {
        return new BankInfo(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
