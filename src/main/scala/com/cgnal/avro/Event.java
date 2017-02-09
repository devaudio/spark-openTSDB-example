/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.cgnal.avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** A generic event. See the reference guide for event format information. */
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2010746250175112015L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.cgnal.avro\",\"doc\":\"A generic event. See the reference guide for event format information.\",\"fields\":[{\"name\":\"version\",\"type\":\"long\",\"doc\":\"Version of this schema\",\"default\":3},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"A globally unique identifier for this event.\",\"default\":null},{\"name\":\"ts\",\"type\":\"long\",\"doc\":\"Epoch timestamp in millis. Required.\"},{\"name\":\"event_type_id\",\"type\":\"int\",\"doc\":\"ID indicating the type of event. Required.\"},{\"name\":\"source\",\"type\":[\"string\",\"null\"],\"doc\":\"Deprecated event source. Optional.\",\"default\":\"\"},{\"name\":\"location\",\"type\":\"string\",\"doc\":\"Location from which the event was generated. Required.\",\"default\":\"\"},{\"name\":\"host\",\"type\":\"string\",\"doc\":\"Hostname, IP, or other device identifier from which the event was generated. Required.\",\"default\":\"\"},{\"name\":\"service\",\"type\":\"string\",\"doc\":\"Service or process from which the event was generated. Required.\",\"default\":\"\"},{\"name\":\"body\",\"type\":[\"null\",\"bytes\"],\"doc\":\"Raw event content in bytes. Optional.\",\"default\":null},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"Event type-specific key/value pairs, usually extracted from the event body. Required.\",\"order\":\"ignore\"}],\"version\":3}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** Version of this schema */
  @Deprecated public long version;
  /** A globally unique identifier for this event. */
  @Deprecated public java.lang.CharSequence id;
  /** Epoch timestamp in millis. Required. */
  @Deprecated public long ts;
  /** ID indicating the type of event. Required. */
  @Deprecated public int event_type_id;
  /** Deprecated event source. Optional. */
  @Deprecated public java.lang.CharSequence source;
  /** Location from which the event was generated. Required. */
  @Deprecated public java.lang.CharSequence location;
  /** Hostname, IP, or other device identifier from which the event was generated. Required. */
  @Deprecated public java.lang.CharSequence host;
  /** Service or process from which the event was generated. Required. */
  @Deprecated public java.lang.CharSequence service;
  /** Raw event content in bytes. Optional. */
  @Deprecated public java.nio.ByteBuffer body;
  /** Event type-specific key/value pairs, usually extracted from the event body. Required. */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> attributes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Event() {}

  /**
   * All-args constructor.
   * @param version Version of this schema
   * @param id A globally unique identifier for this event.
   * @param ts Epoch timestamp in millis. Required.
   * @param event_type_id ID indicating the type of event. Required.
   * @param source Deprecated event source. Optional.
   * @param location Location from which the event was generated. Required.
   * @param host Hostname, IP, or other device identifier from which the event was generated. Required.
   * @param service Service or process from which the event was generated. Required.
   * @param body Raw event content in bytes. Optional.
   * @param attributes Event type-specific key/value pairs, usually extracted from the event body. Required.
   */
  public Event(java.lang.Long version, java.lang.CharSequence id, java.lang.Long ts, java.lang.Integer event_type_id, java.lang.CharSequence source, java.lang.CharSequence location, java.lang.CharSequence host, java.lang.CharSequence service, java.nio.ByteBuffer body, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> attributes) {
    this.version = version;
    this.id = id;
    this.ts = ts;
    this.event_type_id = event_type_id;
    this.source = source;
    this.location = location;
    this.host = host;
    this.service = service;
    this.body = body;
    this.attributes = attributes;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return version;
    case 1: return id;
    case 2: return ts;
    case 3: return event_type_id;
    case 4: return source;
    case 5: return location;
    case 6: return host;
    case 7: return service;
    case 8: return body;
    case 9: return attributes;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: version = (java.lang.Long)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: ts = (java.lang.Long)value$; break;
    case 3: event_type_id = (java.lang.Integer)value$; break;
    case 4: source = (java.lang.CharSequence)value$; break;
    case 5: location = (java.lang.CharSequence)value$; break;
    case 6: host = (java.lang.CharSequence)value$; break;
    case 7: service = (java.lang.CharSequence)value$; break;
    case 8: body = (java.nio.ByteBuffer)value$; break;
    case 9: attributes = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'version' field.
   * @return Version of this schema
   */
  public java.lang.Long getVersion() {
    return version;
  }

  /**
   * Sets the value of the 'version' field.
   * Version of this schema
   * @param value the value to set.
   */
  public void setVersion(java.lang.Long value) {
    this.version = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return A globally unique identifier for this event.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * A globally unique identifier for this event.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'ts' field.
   * @return Epoch timestamp in millis. Required.
   */
  public java.lang.Long getTs() {
    return ts;
  }

  /**
   * Sets the value of the 'ts' field.
   * Epoch timestamp in millis. Required.
   * @param value the value to set.
   */
  public void setTs(java.lang.Long value) {
    this.ts = value;
  }

  /**
   * Gets the value of the 'event_type_id' field.
   * @return ID indicating the type of event. Required.
   */
  public java.lang.Integer getEventTypeId() {
    return event_type_id;
  }

  /**
   * Sets the value of the 'event_type_id' field.
   * ID indicating the type of event. Required.
   * @param value the value to set.
   */
  public void setEventTypeId(java.lang.Integer value) {
    this.event_type_id = value;
  }

  /**
   * Gets the value of the 'source' field.
   * @return Deprecated event source. Optional.
   */
  public java.lang.CharSequence getSource() {
    return source;
  }

  /**
   * Sets the value of the 'source' field.
   * Deprecated event source. Optional.
   * @param value the value to set.
   */
  public void setSource(java.lang.CharSequence value) {
    this.source = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return Location from which the event was generated. Required.
   */
  public java.lang.CharSequence getLocation() {
    return location;
  }

  /**
   * Sets the value of the 'location' field.
   * Location from which the event was generated. Required.
   * @param value the value to set.
   */
  public void setLocation(java.lang.CharSequence value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'host' field.
   * @return Hostname, IP, or other device identifier from which the event was generated. Required.
   */
  public java.lang.CharSequence getHost() {
    return host;
  }

  /**
   * Sets the value of the 'host' field.
   * Hostname, IP, or other device identifier from which the event was generated. Required.
   * @param value the value to set.
   */
  public void setHost(java.lang.CharSequence value) {
    this.host = value;
  }

  /**
   * Gets the value of the 'service' field.
   * @return Service or process from which the event was generated. Required.
   */
  public java.lang.CharSequence getService() {
    return service;
  }

  /**
   * Sets the value of the 'service' field.
   * Service or process from which the event was generated. Required.
   * @param value the value to set.
   */
  public void setService(java.lang.CharSequence value) {
    this.service = value;
  }

  /**
   * Gets the value of the 'body' field.
   * @return Raw event content in bytes. Optional.
   */
  public java.nio.ByteBuffer getBody() {
    return body;
  }

  /**
   * Sets the value of the 'body' field.
   * Raw event content in bytes. Optional.
   * @param value the value to set.
   */
  public void setBody(java.nio.ByteBuffer value) {
    this.body = value;
  }

  /**
   * Gets the value of the 'attributes' field.
   * @return Event type-specific key/value pairs, usually extracted from the event body. Required.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAttributes() {
    return attributes;
  }

  /**
   * Sets the value of the 'attributes' field.
   * Event type-specific key/value pairs, usually extracted from the event body. Required.
   * @param value the value to set.
   */
  public void setAttributes(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.attributes = value;
  }

  /**
   * Creates a new Event RecordBuilder.
   * @return A new Event RecordBuilder
   */
  public static com.cgnal.avro.Event.Builder newBuilder() {
    return new com.cgnal.avro.Event.Builder();
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Event RecordBuilder
   */
  public static com.cgnal.avro.Event.Builder newBuilder(com.cgnal.avro.Event.Builder other) {
    return new com.cgnal.avro.Event.Builder(other);
  }

  /**
   * Creates a new Event RecordBuilder by copying an existing Event instance.
   * @param other The existing instance to copy.
   * @return A new Event RecordBuilder
   */
  public static com.cgnal.avro.Event.Builder newBuilder(com.cgnal.avro.Event other) {
    return new com.cgnal.avro.Event.Builder(other);
  }

  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    /** Version of this schema */
    private long version;
    /** A globally unique identifier for this event. */
    private java.lang.CharSequence id;
    /** Epoch timestamp in millis. Required. */
    private long ts;
    /** ID indicating the type of event. Required. */
    private int event_type_id;
    /** Deprecated event source. Optional. */
    private java.lang.CharSequence source;
    /** Location from which the event was generated. Required. */
    private java.lang.CharSequence location;
    /** Hostname, IP, or other device identifier from which the event was generated. Required. */
    private java.lang.CharSequence host;
    /** Service or process from which the event was generated. Required. */
    private java.lang.CharSequence service;
    /** Raw event content in bytes. Optional. */
    private java.nio.ByteBuffer body;
    /** Event type-specific key/value pairs, usually extracted from the event body. Required. */
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> attributes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cgnal.avro.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ts)) {
        this.ts = data().deepCopy(fields()[2].schema(), other.ts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event_type_id)) {
        this.event_type_id = data().deepCopy(fields()[3].schema(), other.event_type_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.source)) {
        this.source = data().deepCopy(fields()[4].schema(), other.source);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.location)) {
        this.location = data().deepCopy(fields()[5].schema(), other.location);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.host)) {
        this.host = data().deepCopy(fields()[6].schema(), other.host);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.service)) {
        this.service = data().deepCopy(fields()[7].schema(), other.service);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.attributes)) {
        this.attributes = data().deepCopy(fields()[9].schema(), other.attributes);
        fieldSetFlags()[9] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Event instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cgnal.avro.Event other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.version)) {
        this.version = data().deepCopy(fields()[0].schema(), other.version);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ts)) {
        this.ts = data().deepCopy(fields()[2].schema(), other.ts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.event_type_id)) {
        this.event_type_id = data().deepCopy(fields()[3].schema(), other.event_type_id);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.source)) {
        this.source = data().deepCopy(fields()[4].schema(), other.source);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.location)) {
        this.location = data().deepCopy(fields()[5].schema(), other.location);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.host)) {
        this.host = data().deepCopy(fields()[6].schema(), other.host);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.service)) {
        this.service = data().deepCopy(fields()[7].schema(), other.service);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.body)) {
        this.body = data().deepCopy(fields()[8].schema(), other.body);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.attributes)) {
        this.attributes = data().deepCopy(fields()[9].schema(), other.attributes);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'version' field.
      * Version of this schema
      * @return The value.
      */
    public java.lang.Long getVersion() {
      return version;
    }

    /**
      * Sets the value of the 'version' field.
      * Version of this schema
      * @param value The value of 'version'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setVersion(long value) {
      validate(fields()[0], value);
      this.version = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'version' field has been set.
      * Version of this schema
      * @return True if the 'version' field has been set, false otherwise.
      */
    public boolean hasVersion() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'version' field.
      * Version of this schema
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearVersion() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * A globally unique identifier for this event.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * A globally unique identifier for this event.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * A globally unique identifier for this event.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * A globally unique identifier for this event.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ts' field.
      * Epoch timestamp in millis. Required.
      * @return The value.
      */
    public java.lang.Long getTs() {
      return ts;
    }

    /**
      * Sets the value of the 'ts' field.
      * Epoch timestamp in millis. Required.
      * @param value The value of 'ts'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setTs(long value) {
      validate(fields()[2], value);
      this.ts = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ts' field has been set.
      * Epoch timestamp in millis. Required.
      * @return True if the 'ts' field has been set, false otherwise.
      */
    public boolean hasTs() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ts' field.
      * Epoch timestamp in millis. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearTs() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'event_type_id' field.
      * ID indicating the type of event. Required.
      * @return The value.
      */
    public java.lang.Integer getEventTypeId() {
      return event_type_id;
    }

    /**
      * Sets the value of the 'event_type_id' field.
      * ID indicating the type of event. Required.
      * @param value The value of 'event_type_id'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setEventTypeId(int value) {
      validate(fields()[3], value);
      this.event_type_id = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'event_type_id' field has been set.
      * ID indicating the type of event. Required.
      * @return True if the 'event_type_id' field has been set, false otherwise.
      */
    public boolean hasEventTypeId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'event_type_id' field.
      * ID indicating the type of event. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearEventTypeId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'source' field.
      * Deprecated event source. Optional.
      * @return The value.
      */
    public java.lang.CharSequence getSource() {
      return source;
    }

    /**
      * Sets the value of the 'source' field.
      * Deprecated event source. Optional.
      * @param value The value of 'source'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setSource(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.source = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'source' field has been set.
      * Deprecated event source. Optional.
      * @return True if the 'source' field has been set, false otherwise.
      */
    public boolean hasSource() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'source' field.
      * Deprecated event source. Optional.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearSource() {
      source = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * Location from which the event was generated. Required.
      * @return The value.
      */
    public java.lang.CharSequence getLocation() {
      return location;
    }

    /**
      * Sets the value of the 'location' field.
      * Location from which the event was generated. Required.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setLocation(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.location = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * Location from which the event was generated. Required.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'location' field.
      * Location from which the event was generated. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearLocation() {
      location = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'host' field.
      * Hostname, IP, or other device identifier from which the event was generated. Required.
      * @return The value.
      */
    public java.lang.CharSequence getHost() {
      return host;
    }

    /**
      * Sets the value of the 'host' field.
      * Hostname, IP, or other device identifier from which the event was generated. Required.
      * @param value The value of 'host'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setHost(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.host = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'host' field has been set.
      * Hostname, IP, or other device identifier from which the event was generated. Required.
      * @return True if the 'host' field has been set, false otherwise.
      */
    public boolean hasHost() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'host' field.
      * Hostname, IP, or other device identifier from which the event was generated. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearHost() {
      host = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'service' field.
      * Service or process from which the event was generated. Required.
      * @return The value.
      */
    public java.lang.CharSequence getService() {
      return service;
    }

    /**
      * Sets the value of the 'service' field.
      * Service or process from which the event was generated. Required.
      * @param value The value of 'service'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setService(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.service = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'service' field has been set.
      * Service or process from which the event was generated. Required.
      * @return True if the 'service' field has been set, false otherwise.
      */
    public boolean hasService() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'service' field.
      * Service or process from which the event was generated. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearService() {
      service = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'body' field.
      * Raw event content in bytes. Optional.
      * @return The value.
      */
    public java.nio.ByteBuffer getBody() {
      return body;
    }

    /**
      * Sets the value of the 'body' field.
      * Raw event content in bytes. Optional.
      * @param value The value of 'body'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setBody(java.nio.ByteBuffer value) {
      validate(fields()[8], value);
      this.body = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'body' field has been set.
      * Raw event content in bytes. Optional.
      * @return True if the 'body' field has been set, false otherwise.
      */
    public boolean hasBody() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'body' field.
      * Raw event content in bytes. Optional.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearBody() {
      body = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributes' field.
      * Event type-specific key/value pairs, usually extracted from the event body. Required.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getAttributes() {
      return attributes;
    }

    /**
      * Sets the value of the 'attributes' field.
      * Event type-specific key/value pairs, usually extracted from the event body. Required.
      * @param value The value of 'attributes'.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder setAttributes(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[9], value);
      this.attributes = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'attributes' field has been set.
      * Event type-specific key/value pairs, usually extracted from the event body. Required.
      * @return True if the 'attributes' field has been set, false otherwise.
      */
    public boolean hasAttributes() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'attributes' field.
      * Event type-specific key/value pairs, usually extracted from the event body. Required.
      * @return This builder.
      */
    public com.cgnal.avro.Event.Builder clearAttributes() {
      attributes = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    public Event build() {
      try {
        Event record = new Event();
        record.version = fieldSetFlags()[0] ? this.version : (java.lang.Long) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ts = fieldSetFlags()[2] ? this.ts : (java.lang.Long) defaultValue(fields()[2]);
        record.event_type_id = fieldSetFlags()[3] ? this.event_type_id : (java.lang.Integer) defaultValue(fields()[3]);
        record.source = fieldSetFlags()[4] ? this.source : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.location = fieldSetFlags()[5] ? this.location : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.host = fieldSetFlags()[6] ? this.host : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.service = fieldSetFlags()[7] ? this.service : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.body = fieldSetFlags()[8] ? this.body : (java.nio.ByteBuffer) defaultValue(fields()[8]);
        record.attributes = fieldSetFlags()[9] ? this.attributes : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[9]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
