/*
 * This file is generated by jOOQ.
 */
package com.example.banksystem.database.schema.tables.records;


import com.example.banksystem.database.schema.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record8<Integer, String, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.surname</code>.
     */
    public void setSurname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user.surname</code>.
     */
    public String getSurname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user.location</code>.
     */
    public void setLocation(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user.location</code>.
     */
    public String getLocation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user.age</code>.
     */
    public void setAge(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.user.gender</code>.
     */
    public void setGender(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.user.gender</code>.
     */
    public String getGender() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.user.username</code>.
     */
    public void setUsername(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.user.username</code>.
     */
    public String getUsername() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, String, String, String, String, Integer, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.NAME;
    }

    @Override
    public Field<String> field3() {
        return User.USER.SURNAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return User.USER.LOCATION;
    }

    @Override
    public Field<Integer> field6() {
        return User.USER.AGE;
    }

    @Override
    public Field<String> field7() {
        return User.USER.GENDER;
    }

    @Override
    public Field<String> field8() {
        return User.USER.USERNAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getSurname();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getLocation();
    }

    @Override
    public Integer component6() {
        return getAge();
    }

    @Override
    public String component7() {
        return getGender();
    }

    @Override
    public String component8() {
        return getUsername();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getSurname();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getLocation();
    }

    @Override
    public Integer value6() {
        return getAge();
    }

    @Override
    public String value7() {
        return getGender();
    }

    @Override
    public String value8() {
        return getUsername();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setSurname(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setLocation(value);
        return this;
    }

    @Override
    public UserRecord value6(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public UserRecord value7(String value) {
        setGender(value);
        return this;
    }

    @Override
    public UserRecord value8(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8) {
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
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String name, String surname, String password, String location, Integer age, String gender, String username) {
        super(User.USER);

        setId(id);
        setName(name);
        setSurname(surname);
        setPassword(password);
        setLocation(location);
        setAge(age);
        setGender(gender);
        setUsername(username);
    }
}
