package com.labs.springstarted.model;

import java.io.Serializable;

/**
 * Interface to mark objects that are identifiable by an id of any type K.
 */
public interface Identifiable<K extends Serializable> {

  /**
   * Returns the id identifying the object.
   *
   * @return the identifier
   */
  K getId();
}
