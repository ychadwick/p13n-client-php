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

public class SearchResult implements org.apache.thrift.TBase<SearchResult, SearchResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SearchResult");

  private static final org.apache.thrift.protocol.TField HITS_FIELD_DESC = new org.apache.thrift.protocol.TField("hits", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField FACET_RESPONSES_FIELD_DESC = new org.apache.thrift.protocol.TField("facetResponses", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_HIT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalHitCount", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField QUERY_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("queryText", org.apache.thrift.protocol.TType.STRING, (short)40);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SearchResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SearchResultTupleSchemeFactory());
  }

  public List<Hit> hits; // required
  public List<FacetResponse> facetResponses; // required
  public long totalHitCount; // required
  public String queryText; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HITS((short)1, "hits"),
    FACET_RESPONSES((short)2, "facetResponses"),
    TOTAL_HIT_COUNT((short)3, "totalHitCount"),
    QUERY_TEXT((short)40, "queryText");

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
        case 1: // HITS
          return HITS;
        case 2: // FACET_RESPONSES
          return FACET_RESPONSES;
        case 3: // TOTAL_HIT_COUNT
          return TOTAL_HIT_COUNT;
        case 40: // QUERY_TEXT
          return QUERY_TEXT;
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
  private static final int __TOTALHITCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HITS, new org.apache.thrift.meta_data.FieldMetaData("hits", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Hit.class))));
    tmpMap.put(_Fields.FACET_RESPONSES, new org.apache.thrift.meta_data.FieldMetaData("facetResponses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FacetResponse.class))));
    tmpMap.put(_Fields.TOTAL_HIT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalHitCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.QUERY_TEXT, new org.apache.thrift.meta_data.FieldMetaData("queryText", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SearchResult.class, metaDataMap);
  }

  public SearchResult() {
  }

  public SearchResult(
    List<Hit> hits,
    List<FacetResponse> facetResponses,
    long totalHitCount,
    String queryText)
  {
    this();
    this.hits = hits;
    this.facetResponses = facetResponses;
    this.totalHitCount = totalHitCount;
    setTotalHitCountIsSet(true);
    this.queryText = queryText;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SearchResult(SearchResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHits()) {
      List<Hit> __this__hits = new ArrayList<Hit>();
      for (Hit other_element : other.hits) {
        __this__hits.add(new Hit(other_element));
      }
      this.hits = __this__hits;
    }
    if (other.isSetFacetResponses()) {
      List<FacetResponse> __this__facetResponses = new ArrayList<FacetResponse>();
      for (FacetResponse other_element : other.facetResponses) {
        __this__facetResponses.add(new FacetResponse(other_element));
      }
      this.facetResponses = __this__facetResponses;
    }
    this.totalHitCount = other.totalHitCount;
    if (other.isSetQueryText()) {
      this.queryText = other.queryText;
    }
  }

  public SearchResult deepCopy() {
    return new SearchResult(this);
  }

  @Override
  public void clear() {
    this.hits = null;
    this.facetResponses = null;
    setTotalHitCountIsSet(false);
    this.totalHitCount = 0;
    this.queryText = null;
  }

  public int getHitsSize() {
    return (this.hits == null) ? 0 : this.hits.size();
  }

  public java.util.Iterator<Hit> getHitsIterator() {
    return (this.hits == null) ? null : this.hits.iterator();
  }

  public void addToHits(Hit elem) {
    if (this.hits == null) {
      this.hits = new ArrayList<Hit>();
    }
    this.hits.add(elem);
  }

  public List<Hit> getHits() {
    return this.hits;
  }

  public SearchResult setHits(List<Hit> hits) {
    this.hits = hits;
    return this;
  }

  public void unsetHits() {
    this.hits = null;
  }

  /** Returns true if field hits is set (has been assigned a value) and false otherwise */
  public boolean isSetHits() {
    return this.hits != null;
  }

  public void setHitsIsSet(boolean value) {
    if (!value) {
      this.hits = null;
    }
  }

  public int getFacetResponsesSize() {
    return (this.facetResponses == null) ? 0 : this.facetResponses.size();
  }

  public java.util.Iterator<FacetResponse> getFacetResponsesIterator() {
    return (this.facetResponses == null) ? null : this.facetResponses.iterator();
  }

  public void addToFacetResponses(FacetResponse elem) {
    if (this.facetResponses == null) {
      this.facetResponses = new ArrayList<FacetResponse>();
    }
    this.facetResponses.add(elem);
  }

  public List<FacetResponse> getFacetResponses() {
    return this.facetResponses;
  }

  public SearchResult setFacetResponses(List<FacetResponse> facetResponses) {
    this.facetResponses = facetResponses;
    return this;
  }

  public void unsetFacetResponses() {
    this.facetResponses = null;
  }

  /** Returns true if field facetResponses is set (has been assigned a value) and false otherwise */
  public boolean isSetFacetResponses() {
    return this.facetResponses != null;
  }

  public void setFacetResponsesIsSet(boolean value) {
    if (!value) {
      this.facetResponses = null;
    }
  }

  public long getTotalHitCount() {
    return this.totalHitCount;
  }

  public SearchResult setTotalHitCount(long totalHitCount) {
    this.totalHitCount = totalHitCount;
    setTotalHitCountIsSet(true);
    return this;
  }

  public void unsetTotalHitCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID);
  }

  /** Returns true if field totalHitCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalHitCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID);
  }

  public void setTotalHitCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOTALHITCOUNT_ISSET_ID, value);
  }

  public String getQueryText() {
    return this.queryText;
  }

  public SearchResult setQueryText(String queryText) {
    this.queryText = queryText;
    return this;
  }

  public void unsetQueryText() {
    this.queryText = null;
  }

  /** Returns true if field queryText is set (has been assigned a value) and false otherwise */
  public boolean isSetQueryText() {
    return this.queryText != null;
  }

  public void setQueryTextIsSet(boolean value) {
    if (!value) {
      this.queryText = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HITS:
      if (value == null) {
        unsetHits();
      } else {
        setHits((List<Hit>)value);
      }
      break;

    case FACET_RESPONSES:
      if (value == null) {
        unsetFacetResponses();
      } else {
        setFacetResponses((List<FacetResponse>)value);
      }
      break;

    case TOTAL_HIT_COUNT:
      if (value == null) {
        unsetTotalHitCount();
      } else {
        setTotalHitCount((Long)value);
      }
      break;

    case QUERY_TEXT:
      if (value == null) {
        unsetQueryText();
      } else {
        setQueryText((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HITS:
      return getHits();

    case FACET_RESPONSES:
      return getFacetResponses();

    case TOTAL_HIT_COUNT:
      return Long.valueOf(getTotalHitCount());

    case QUERY_TEXT:
      return getQueryText();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HITS:
      return isSetHits();
    case FACET_RESPONSES:
      return isSetFacetResponses();
    case TOTAL_HIT_COUNT:
      return isSetTotalHitCount();
    case QUERY_TEXT:
      return isSetQueryText();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SearchResult)
      return this.equals((SearchResult)that);
    return false;
  }

  public boolean equals(SearchResult that) {
    if (that == null)
      return false;

    boolean this_present_hits = true && this.isSetHits();
    boolean that_present_hits = true && that.isSetHits();
    if (this_present_hits || that_present_hits) {
      if (!(this_present_hits && that_present_hits))
        return false;
      if (!this.hits.equals(that.hits))
        return false;
    }

    boolean this_present_facetResponses = true && this.isSetFacetResponses();
    boolean that_present_facetResponses = true && that.isSetFacetResponses();
    if (this_present_facetResponses || that_present_facetResponses) {
      if (!(this_present_facetResponses && that_present_facetResponses))
        return false;
      if (!this.facetResponses.equals(that.facetResponses))
        return false;
    }

    boolean this_present_totalHitCount = true;
    boolean that_present_totalHitCount = true;
    if (this_present_totalHitCount || that_present_totalHitCount) {
      if (!(this_present_totalHitCount && that_present_totalHitCount))
        return false;
      if (this.totalHitCount != that.totalHitCount)
        return false;
    }

    boolean this_present_queryText = true && this.isSetQueryText();
    boolean that_present_queryText = true && that.isSetQueryText();
    if (this_present_queryText || that_present_queryText) {
      if (!(this_present_queryText && that_present_queryText))
        return false;
      if (!this.queryText.equals(that.queryText))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(SearchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    SearchResult typedOther = (SearchResult)other;

    lastComparison = Boolean.valueOf(isSetHits()).compareTo(typedOther.isSetHits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hits, typedOther.hits);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFacetResponses()).compareTo(typedOther.isSetFacetResponses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFacetResponses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.facetResponses, typedOther.facetResponses);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTotalHitCount()).compareTo(typedOther.isSetTotalHitCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalHitCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalHitCount, typedOther.totalHitCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetQueryText()).compareTo(typedOther.isSetQueryText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueryText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.queryText, typedOther.queryText);
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
    StringBuilder sb = new StringBuilder("SearchResult(");
    boolean first = true;

    sb.append("hits:");
    if (this.hits == null) {
      sb.append("null");
    } else {
      sb.append(this.hits);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("facetResponses:");
    if (this.facetResponses == null) {
      sb.append("null");
    } else {
      sb.append(this.facetResponses);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalHitCount:");
    sb.append(this.totalHitCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("queryText:");
    if (this.queryText == null) {
      sb.append("null");
    } else {
      sb.append(this.queryText);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SearchResultStandardSchemeFactory implements SchemeFactory {
    public SearchResultStandardScheme getScheme() {
      return new SearchResultStandardScheme();
    }
  }

  private static class SearchResultStandardScheme extends StandardScheme<SearchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SearchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HITS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list124 = iprot.readListBegin();
                struct.hits = new ArrayList<Hit>(_list124.size);
                for (int _i125 = 0; _i125 < _list124.size; ++_i125)
                {
                  Hit _elem126; // required
                  _elem126 = new Hit();
                  _elem126.read(iprot);
                  struct.hits.add(_elem126);
                }
                iprot.readListEnd();
              }
              struct.setHitsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FACET_RESPONSES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list127 = iprot.readListBegin();
                struct.facetResponses = new ArrayList<FacetResponse>(_list127.size);
                for (int _i128 = 0; _i128 < _list127.size; ++_i128)
                {
                  FacetResponse _elem129; // required
                  _elem129 = new FacetResponse();
                  _elem129.read(iprot);
                  struct.facetResponses.add(_elem129);
                }
                iprot.readListEnd();
              }
              struct.setFacetResponsesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_HIT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalHitCount = iprot.readI64();
              struct.setTotalHitCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 40: // QUERY_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.queryText = iprot.readString();
              struct.setQueryTextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SearchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hits != null) {
        oprot.writeFieldBegin(HITS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.hits.size()));
          for (Hit _iter130 : struct.hits)
          {
            _iter130.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.facetResponses != null) {
        oprot.writeFieldBegin(FACET_RESPONSES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.facetResponses.size()));
          for (FacetResponse _iter131 : struct.facetResponses)
          {
            _iter131.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_HIT_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalHitCount);
      oprot.writeFieldEnd();
      if (struct.queryText != null) {
        oprot.writeFieldBegin(QUERY_TEXT_FIELD_DESC);
        oprot.writeString(struct.queryText);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SearchResultTupleSchemeFactory implements SchemeFactory {
    public SearchResultTupleScheme getScheme() {
      return new SearchResultTupleScheme();
    }
  }

  private static class SearchResultTupleScheme extends TupleScheme<SearchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SearchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHits()) {
        optionals.set(0);
      }
      if (struct.isSetFacetResponses()) {
        optionals.set(1);
      }
      if (struct.isSetTotalHitCount()) {
        optionals.set(2);
      }
      if (struct.isSetQueryText()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetHits()) {
        {
          oprot.writeI32(struct.hits.size());
          for (Hit _iter132 : struct.hits)
          {
            _iter132.write(oprot);
          }
        }
      }
      if (struct.isSetFacetResponses()) {
        {
          oprot.writeI32(struct.facetResponses.size());
          for (FacetResponse _iter133 : struct.facetResponses)
          {
            _iter133.write(oprot);
          }
        }
      }
      if (struct.isSetTotalHitCount()) {
        oprot.writeI64(struct.totalHitCount);
      }
      if (struct.isSetQueryText()) {
        oprot.writeString(struct.queryText);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SearchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list134 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.hits = new ArrayList<Hit>(_list134.size);
          for (int _i135 = 0; _i135 < _list134.size; ++_i135)
          {
            Hit _elem136; // required
            _elem136 = new Hit();
            _elem136.read(iprot);
            struct.hits.add(_elem136);
          }
        }
        struct.setHitsIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list137 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.facetResponses = new ArrayList<FacetResponse>(_list137.size);
          for (int _i138 = 0; _i138 < _list137.size; ++_i138)
          {
            FacetResponse _elem139; // required
            _elem139 = new FacetResponse();
            _elem139.read(iprot);
            struct.facetResponses.add(_elem139);
          }
        }
        struct.setFacetResponsesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalHitCount = iprot.readI64();
        struct.setTotalHitCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.queryText = iprot.readString();
        struct.setQueryTextIsSet(true);
      }
    }
  }

}

