/*
 * An XML document type.
 * Localname: getHighScoresSize
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresSizeDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one getHighScoresSize(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class GetHighScoresSizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresSizeDocument
{
    
    public GetHighScoresSizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHIGHSCORESSIZE$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "getHighScoresSize");
    
    
    /**
     * Gets the "getHighScoresSize" element
     */
    public com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize getGetHighScoresSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize)get_store().find_element_user(GETHIGHSCORESSIZE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getHighScoresSize" element
     */
    public void setGetHighScoresSize(com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize getHighScoresSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize)get_store().find_element_user(GETHIGHSCORESSIZE$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize)get_store().add_element_user(GETHIGHSCORESSIZE$0);
            }
            target.set(getHighScoresSize);
        }
    }
    
    /**
     * Appends and returns a new empty "getHighScoresSize" element
     */
    public com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize addNewGetHighScoresSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize)get_store().add_element_user(GETHIGHSCORESSIZE$0);
            return target;
        }
    }
    /**
     * An XML getHighScoresSize(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class GetHighScoresSizeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresSizeDocument.GetHighScoresSize
    {
        
        public GetHighScoresSizeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
