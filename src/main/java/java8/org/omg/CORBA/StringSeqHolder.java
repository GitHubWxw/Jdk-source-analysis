package org.omg.CORBA;


/**
* org/omg/CORBA/StringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-i586-cygwin/jdk8u251/737/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Thursday, March 12, 2020 6:33:48 AM UTC
*/


/** An array of Strings */
public final class StringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public StringSeqHolder ()
  {
  }

  public StringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.StringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.StringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.StringSeqHelper.type ();
  }

}
