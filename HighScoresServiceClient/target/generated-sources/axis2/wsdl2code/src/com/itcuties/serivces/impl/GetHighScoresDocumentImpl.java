/*
 * An XML document type.
 * Localname: getHighScores
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one getHighScores(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class GetHighScoresDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresDocument
{
    
    public GetHighScoresDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHIGHSCORES$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "getHighScores");
    
    
    /**
     * Gets the "getHighScores" element
     */
    public com.itcuties.serivces.GetHighScoresDocument.GetHighScores getGetHighScores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresDocument.GetHighScores target = null;
            target = (com.itcuties.serivces.GetHighScoresDocument.GetHighScores)get_store().find_element_user(GETHIGHSCORES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getHighScores" element
     */
    public void setGetHighScores(com.itcuties.serivces.GetHighScoresDocument.GetHighScores getHighScores)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresDocument.GetHighScores target = null;
            target = (com.itcuties.serivces.GetHighScoresDocument.GetHighScores)get_store().find_element_user(GETHIGHSCORES$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.GetHighScoresDocument.GetHighScores)get_store().add_element_user(GETHIGHSCORES$0);
            }
            target.set(getHighScores);
        }
    }
    
    /**
     * Appends and returns a new empty "getHighScores" element
     */
    public com.itcuties.serivces.GetHighScoresDocument.GetHighScores addNewGetHighScores()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresDocument.GetHighScores target = null;
            target = (com.itcuties.serivces.GetHighScoresDocument.GetHighScores)get_store().add_element_user(GETHIGHSCORES$0);
            return target;
        }
    }
    /**
     * An XML getHighScores(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class GetHighScoresImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresDocument.GetHighScores
    {
        
        public GetHighScoresImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
