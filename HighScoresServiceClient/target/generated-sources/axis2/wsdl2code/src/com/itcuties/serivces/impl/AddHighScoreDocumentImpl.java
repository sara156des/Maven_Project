/*
 * An XML document type.
 * Localname: addHighScore
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.AddHighScoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one addHighScore(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class AddHighScoreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.AddHighScoreDocument
{
    
    public AddHighScoreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDHIGHSCORE$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "addHighScore");
    
    
    /**
     * Gets the "addHighScore" element
     */
    public com.itcuties.serivces.AddHighScoreDocument.AddHighScore getAddHighScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.AddHighScoreDocument.AddHighScore target = null;
            target = (com.itcuties.serivces.AddHighScoreDocument.AddHighScore)get_store().find_element_user(ADDHIGHSCORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "addHighScore" element
     */
    public void setAddHighScore(com.itcuties.serivces.AddHighScoreDocument.AddHighScore addHighScore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.AddHighScoreDocument.AddHighScore target = null;
            target = (com.itcuties.serivces.AddHighScoreDocument.AddHighScore)get_store().find_element_user(ADDHIGHSCORE$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.AddHighScoreDocument.AddHighScore)get_store().add_element_user(ADDHIGHSCORE$0);
            }
            target.set(addHighScore);
        }
    }
    
    /**
     * Appends and returns a new empty "addHighScore" element
     */
    public com.itcuties.serivces.AddHighScoreDocument.AddHighScore addNewAddHighScore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.AddHighScoreDocument.AddHighScore target = null;
            target = (com.itcuties.serivces.AddHighScoreDocument.AddHighScore)get_store().add_element_user(ADDHIGHSCORE$0);
            return target;
        }
    }
    /**
     * An XML addHighScore(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class AddHighScoreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.AddHighScoreDocument.AddHighScore
    {
        
        public AddHighScoreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCORE$0 = 
            new javax.xml.namespace.QName("http://serivces.itcuties.com", "score");
        
        
        /**
         * Gets the "score" element
         */
        public com.itcuties.serivces.xsd.HighScore getScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(SCORE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "score" element
         */
        public boolean isNilScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(SCORE$0, 0);
                if (target == null) return false;
                return target.isNil();
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
                return get_store().count_elements(SCORE$0) != 0;
            }
        }
        
        /**
         * Sets the "score" element
         */
        public void setScore(com.itcuties.serivces.xsd.HighScore score)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(SCORE$0, 0);
                if (target == null)
                {
                    target = (com.itcuties.serivces.xsd.HighScore)get_store().add_element_user(SCORE$0);
                }
                target.set(score);
            }
        }
        
        /**
         * Appends and returns a new empty "score" element
         */
        public com.itcuties.serivces.xsd.HighScore addNewScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().add_element_user(SCORE$0);
                return target;
            }
        }
        
        /**
         * Nils the "score" element
         */
        public void setNilScore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(SCORE$0, 0);
                if (target == null)
                {
                    target = (com.itcuties.serivces.xsd.HighScore)get_store().add_element_user(SCORE$0);
                }
                target.setNil();
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
                get_store().remove_element(SCORE$0, 0);
            }
        }
    }
}
