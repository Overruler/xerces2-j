/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999,2000 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xerces" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, International
 * Business Machines, Inc., http://www.apache.org.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */

package org.apache.xerces.impl.validation;

/**
 * @author Stubs generated by DesignDoc on Wed Jun 07 11:58:44 PDT 2000
 * @version $Id$
 */
public class XMLSimpleType {

    //
    // Constants
    //

    /** TYPE_CDATA */
    public static final short TYPE_CDATA = 1;

    /** TYPE_ENTITY */
    public static final short TYPE_ENTITY = 2;

    /** TYPE_ENUMERATION */
    public static final short TYPE_ENUMERATION = 3;

    /** TYPE_ID */
    public static final short TYPE_ID = 4;

    /** TYPE_IDREF */
    public static final short TYPE_IDREF = 5;

    /** TYPE_NMTOKEN */
    public static final short TYPE_NMTOKEN = 6;

    /** TYPE_NOTATION */
    public static final short TYPE_NOTATION = 7;

    /** TYPE_NAMED */
    public static final short TYPE_NAMED = 8;

    /** DEFAULT_TYPE_DEFAULT */
    public static final short DEFAULT_TYPE_DEFAULT = -1;

    /** DEFAULT_TYPE_FIXED */
    public static final short DEFAULT_TYPE_FIXED = -1;

    /** DEFAULT_TYPE_IMPLIED */
    public static final short DEFAULT_TYPE_IMPLIED = -1;

    /** DEFAULT_TYPE_REQUIRED */
    public static final short DEFAULT_TYPE_REQUIRED = -1;

    //
    // Data
    //

    /** type */
    protected short type;

    /** name */
    protected String name;

    /** enumeration */
    public String[] enumeration;

    /** list */
    public boolean list;

    /** defaultType */
    public short defaultType;

    /** defaultValue */
    public String defaultValue;

    /** datatypeValidator */
    public DatatypeValidator datatypeValidator;

    //
    // Methods
    //

    /**
     * setValues
     * 
     * @param type 
     * @param name 
     * @param enumeration 
     * @param list 
     * @param defaultType 
     * @param defaultValue 
     * @param datatypeValidator 
     */
    public void setValues(short type, String name, String[] enumeration, boolean list, short defaultType, String defaultValue, DatatypeValidator datatypeValidator) {
        this.type              = type;
        this.name              = name;
        this.enumeration       = enumeration;
        this.list              = list;
        this.defaultType       = defaultType;
        this.defaultValue      = defaultValue;
        this.datatypeValidator = datatypeValidator;
    } // setValues

    /**
     * clear
     */
    public void clear() {
        this.type              = -1;
        this.name              = null;
        this.enumeration       = null;
        this.list              = false;
        this.defaultType       = -1;
        this.defaultValue      = null;
        this.datatypeValidator = null;
    } // clear

} // class XMLSimpleType
