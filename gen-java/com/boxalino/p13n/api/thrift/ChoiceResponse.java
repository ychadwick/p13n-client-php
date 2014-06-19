/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.boxalino.p13n.api.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChoiceResponse implements org.apache.thrift.TBase<ChoiceResponse, ChoiceResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChoiceResponse");

  private static final org.apache.thrift.protocol.TField VARIANTS_FIELD_DESC = new org.apache.thrift.protocol.TField("variants", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChoiceResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChoiceResponseTupleSchemeFactory());
  }

  public List<Variant> variants; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VARIANTS((short)1, "variants");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VARIANTS
          return VARIANTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VARIANTS, new org.apache.thrift.meta_data.FieldMetaData("variants", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Variant.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChoiceResponse.class, metaDataMap);
  }

  public ChoiceResponse() {
  }

  public ChoiceResponse(
    List<Variant> variants)
  {
    this();
    this.variants = variants;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChoiceResponse(ChoiceResponse other) {
    if (other.isSetVariants()) {
      List<Variant> __this__variants = new ArrayList<Variant>();
      for (Variant other_element : other.variants) {
        __this__variants.add(new Variant(other_element));
      }
      this.variants = __this__variants;
    }
  }

  public ChoiceResponse deepCopy() {
    return new ChoiceResponse(this);
  }

  @Override
  public void clear() {
    this.variants = null;
  }

  public int getVariantsSize() {
    return (this.variants == null) ? 0 : this.variants.size();
  }

  public java.util.Iterator<Variant> getVariantsIterator() {
    return (this.variants == null) ? null : this.variants.iterator();
  }

  public void addToVariants(Variant elem) {
    if (this.variants == null) {
      this.variants = new ArrayList<Variant>();
    }
    this.variants.add(elem);
  }

  public List<Variant> getVariants() {
    return this.variants;
  }

  public ChoiceResponse setVariants(List<Variant> variants) {
    this.variants = variants;
    return this;
  }

  public void unsetVariants() {
    this.variants = null;
  }

  /** Returns true if field variants is set (has been assigned a value) and false otherwise */
  public boolean isSetVariants() {
    return this.variants != null;
  }

  public void setVariantsIsSet(boolean value) {
    if (!value) {
      this.variants = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VARIANTS:
      if (value == null) {
        unsetVariants();
      } else {
        setVariants((List<Variant>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VARIANTS:
      return getVariants();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VARIANTS:
      return isSetVariants();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChoiceResponse)
      return this.equals((ChoiceResponse)that);
    return false;
  }

  public boolean equals(ChoiceResponse that) {
    if (that == null)
      return false;

    boolean this_present_variants = true && this.isSetVariants();
    boolean that_present_variants = true && that.isSetVariants();
    if (this_present_variants || that_present_variants) {
      if (!(this_present_variants && that_present_variants))
        return false;
      if (!this.variants.equals(that.variants))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ChoiceResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ChoiceResponse typedOther = (ChoiceResponse)other;

    lastComparison = Boolean.valueOf(isSetVariants()).compareTo(typedOther.isSetVariants());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVariants()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.variants, typedOther.variants);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ChoiceResponse(");
    boolean first = true;

    sb.append("variants:");
    if (this.variants == null) {
      sb.append("null");
    } else {
      sb.append(this.variants);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ChoiceResponseStandardSchemeFactory implements SchemeFactory {
    public ChoiceResponseStandardScheme getScheme() {
      return new ChoiceResponseStandardScheme();
    }
  }

  private static class ChoiceResponseStandardScheme extends StandardScheme<ChoiceResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChoiceResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VARIANTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list164 = iprot.readListBegin();
                struct.variants = new ArrayList<Variant>(_list164.size);
                for (int _i165 = 0; _i165 < _list164.size; ++_i165)
                {
                  Variant _elem166; // required
                  _elem166 = new Variant();
                  _elem166.read(iprot);
                  struct.variants.add(_elem166);
                }
                iprot.readListEnd();
              }
              struct.setVariantsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChoiceResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.variants != null) {
        oprot.writeFieldBegin(VARIANTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.variants.size()));
          for (Variant _iter167 : struct.variants)
          {
            _iter167.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChoiceResponseTupleSchemeFactory implements SchemeFactory {
    public ChoiceResponseTupleScheme getScheme() {
      return new ChoiceResponseTupleScheme();
    }
  }

  private static class ChoiceResponseTupleScheme extends TupleScheme<ChoiceResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChoiceResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVariants()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetVariants()) {
        {
          oprot.writeI32(struct.variants.size());
          for (Variant _iter168 : struct.variants)
          {
            _iter168.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChoiceResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list169 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.variants = new ArrayList<Variant>(_list169.size);
          for (int _i170 = 0; _i170 < _list169.size; ++_i170)
          {
            Variant _elem171; // required
            _elem171 = new Variant();
            _elem171.read(iprot);
            struct.variants.add(_elem171);
          }
        }
        struct.setVariantsIsSet(true);
      }
    }
  }

}

