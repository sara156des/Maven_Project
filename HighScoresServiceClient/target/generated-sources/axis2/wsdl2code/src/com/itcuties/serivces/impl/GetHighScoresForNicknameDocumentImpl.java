/*
 * An XML document type.
 * Localname: getHighScoresForNickname
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresForNicknameDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one getHighScoresForNickname(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class GetHighScoresForNicknameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresForNicknameDocument
{
    
    public GetHighScoresForNicknameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHIGHSCORESFORNICKNAME$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "getHighScoresForNickname");
    
    
    /**
     * Gets the "getHighScoresForNickname" element
     */
    public com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname getGetHighScoresForNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname)get_store().find_element_user(GETHIGHSCORESFORNICKNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getHighScoresForNickname" element
     */
    public void setGetHighScoresForNickname(com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname getHighScoresForNickname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname)get_store().find_element_user(GETHIGHSCORESFORNICKNAME$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname)get_store().add_element_user(GETHIGHSCORESFORNICKNAME$0);
            }
            target.set(getHighScoresForNickname);
        }
    }
    
    /**
     * Appends and returns a new empty "getHighScoresForNickname" element
     */
    public com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname addNewGetHighScoresForNickname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname)get_store().add_element_user(GETHIGHSCORESFORNICKNAME$0);
            return target;
        }
    }
    /**
     * An XML getHighScoresForNickname(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class GetHighScoresForNicknameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname
    {
        
        public GetHighScoresForNicknameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NICKNAME$0 = 
            new javax.xml.namespace.QName("http://serivces.itcuties.com", "nickname");
        
        
        /**
         * Gets the "nickname" element
         */
        public java.lang.String getNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "nickname" element
         */
        public org.apache.xmlbeans.XmlString xgetNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "nickname" element
         */
        public boolean isNilNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "nickname" element
         */
        public boolean isSetNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NICKNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "nickname" element
         */
        public void setNickname(java.lang.String nickname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NICKNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NICKNAME$0);
                }
                target.setStringValue(nickname);
            }
        }
        
        /**
         * Sets (as xml) the "nickname" element
         */
        public void xsetNickname(org.apache.xmlbeans.XmlString nickname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$0);
                }
                target.set(nickname);
            }
        }
        
        /**
         * Nils the "nickname" element
         */
        public void setNilNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NICKNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NICKNAME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "nickname" element
         */
        public void unsetNickname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NICKNAME$0, 0);
            }
        }
    }
}
