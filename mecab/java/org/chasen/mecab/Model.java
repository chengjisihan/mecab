/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.chasen.mecab;

public class Model {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Model(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Model obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MeCabJNI.delete_Model(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DictionaryInfo dictionary_info() {
    long cPtr = MeCabJNI.Model_dictionary_info(swigCPtr, this);
    return (cPtr == 0) ? null : new DictionaryInfo(cPtr, false);
  }

  public Tagger createTagger() {
    long cPtr = MeCabJNI.Model_createTagger(swigCPtr, this);
    return (cPtr == 0) ? null : new Tagger(cPtr, false);
  }

  public Lattice createLattice() {
    long cPtr = MeCabJNI.Model_createLattice(swigCPtr, this);
    return (cPtr == 0) ? null : new Lattice(cPtr, false);
  }

  public boolean swap(Model model) {
    return MeCabJNI.Model_swap(swigCPtr, this, Model.getCPtr(model), model);
  }

  public static String version() {
    return MeCabJNI.Model_version();
  }

  public static Model create(int argc, SWIGTYPE_p_p_char argv) {
    long cPtr = MeCabJNI.Model_create__SWIG_0(argc, SWIGTYPE_p_p_char.getCPtr(argv));
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public static Model create(String arg) {
    long cPtr = MeCabJNI.Model_create__SWIG_1(arg);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public Model(String argc) {
    this(MeCabJNI.new_Model__SWIG_0(argc), true);
  }

  public Model() {
    this(MeCabJNI.new_Model__SWIG_1(), true);
  }

}
