/*
 * This file is generated by jOOQ.
 */
package com.example.banksystem.database.schema.tables.records;


import com.example.banksystem.database.schema.tables.BankInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankInfoRecord extends UpdatableRecordImpl<BankInfoRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Integer, Float> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.bank_info.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bank_info.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.bank_info.bank_id</code>.
     */
    public void setBankId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bank_info.bank_id</code>.
     */
    public Integer getBankId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.bank_info.min_sum</code>.
     */
    public void setMinSum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bank_info.min_sum</code>.
     */
    public Integer getMinSum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.bank_info.max_sum</code>.
     */
    public void setMaxSum(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bank_info.max_sum</code>.
     */
    public Integer getMaxSum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.bank_info.min_term</code>.
     */
    public void setMinTerm(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bank_info.min_term</code>.
     */
    public Integer getMinTerm() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.bank_info.max_term</code>.
     */
    public void setMaxTerm(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bank_info.max_term</code>.
     */
    public Integer getMaxTerm() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.bank_info.percent</code>.
     */
    public void setPercent(Float value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bank_info.percent</code>.
     */
    public Float getPercent() {
        return (Float) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Float> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Float> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return BankInfo.BANK_INFO.ID;
    }

    @Override
    public Field<Integer> field2() {
        return BankInfo.BANK_INFO.BANK_ID;
    }

    @Override
    public Field<Integer> field3() {
        return BankInfo.BANK_INFO.MIN_SUM;
    }

    @Override
    public Field<Integer> field4() {
        return BankInfo.BANK_INFO.MAX_SUM;
    }

    @Override
    public Field<Integer> field5() {
        return BankInfo.BANK_INFO.MIN_TERM;
    }

    @Override
    public Field<Integer> field6() {
        return BankInfo.BANK_INFO.MAX_TERM;
    }

    @Override
    public Field<Float> field7() {
        return BankInfo.BANK_INFO.PERCENT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getBankId();
    }

    @Override
    public Integer component3() {
        return getMinSum();
    }

    @Override
    public Integer component4() {
        return getMaxSum();
    }

    @Override
    public Integer component5() {
        return getMinTerm();
    }

    @Override
    public Integer component6() {
        return getMaxTerm();
    }

    @Override
    public Float component7() {
        return getPercent();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getBankId();
    }

    @Override
    public Integer value3() {
        return getMinSum();
    }

    @Override
    public Integer value4() {
        return getMaxSum();
    }

    @Override
    public Integer value5() {
        return getMinTerm();
    }

    @Override
    public Integer value6() {
        return getMaxTerm();
    }

    @Override
    public Float value7() {
        return getPercent();
    }

    @Override
    public BankInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public BankInfoRecord value2(Integer value) {
        setBankId(value);
        return this;
    }

    @Override
    public BankInfoRecord value3(Integer value) {
        setMinSum(value);
        return this;
    }

    @Override
    public BankInfoRecord value4(Integer value) {
        setMaxSum(value);
        return this;
    }

    @Override
    public BankInfoRecord value5(Integer value) {
        setMinTerm(value);
        return this;
    }

    @Override
    public BankInfoRecord value6(Integer value) {
        setMaxTerm(value);
        return this;
    }

    @Override
    public BankInfoRecord value7(Float value) {
        setPercent(value);
        return this;
    }

    @Override
    public BankInfoRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Float value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankInfoRecord
     */
    public BankInfoRecord() {
        super(BankInfo.BANK_INFO);
    }

    /**
     * Create a detached, initialised BankInfoRecord
     */
    public BankInfoRecord(Integer id, Integer bankId, Integer minSum, Integer maxSum, Integer minTerm, Integer maxTerm, Float percent) {
        super(BankInfo.BANK_INFO);

        setId(id);
        setBankId(bankId);
        setMinSum(minSum);
        setMaxSum(maxSum);
        setMinTerm(minTerm);
        setMaxTerm(maxTerm);
        setPercent(percent);
    }
}