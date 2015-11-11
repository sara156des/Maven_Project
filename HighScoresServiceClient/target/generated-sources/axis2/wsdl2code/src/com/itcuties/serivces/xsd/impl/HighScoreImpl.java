/*
 * XML Type:  HighScore
 * Namespace: http://serivces.itcuties.com/xsd
 * Java type: com.itcuties.serivces.xsd.HighScore
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.xsd.impl;
/**
 * An XML HighScore(@http://serivces.itcuties.com/xsd).
 *
 * This is a complex type.
 */
public class HighScoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.xsd.HighScore
{
    
    public HighScoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NICKNAME$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com/xsd", "nickname");
    private static final javax.xml.namespace.QName SCORE$2 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com/xsd", "score");
    
    
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
    
    /**
     * Gets the "score" element
     */
    public int getScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "score" element
     */
    public org.apache.xmlbeans.XmlInt xgetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCORE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "score" element
     */
    public boolean isSetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCORE$2) != 0;
        }
    }
    
    /**
     * Sets the "score" element
     */
    public void setScore(int score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCORE$2);
            }
            target.setIntValue(score);
        }
    }
    
    /**
     * Sets (as xml) the "score" element
     */
    public void xsetScore(org.apache.xmlbeans.XmlInt score)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCORE$2);
            }
            target.set(score);
        }
    }
    
    /**
     * Unsets the "score" element
     */
    public void unsetScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCORE$2, 0);
        }
    }
}
