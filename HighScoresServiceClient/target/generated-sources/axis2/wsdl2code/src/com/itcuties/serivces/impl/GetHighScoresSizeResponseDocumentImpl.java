/*
 * An XML document type.
 * Localname: getHighScoresSizeResponse
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresSizeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one getHighScoresSizeResponse(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class GetHighScoresSizeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresSizeResponseDocument
{
    
    public GetHighScoresSizeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHIGHSCORESSIZERESPONSE$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "getHighScoresSizeResponse");
    
    
    /**
     * Gets the "getHighScoresSizeResponse" element
     */
    public com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse getGetHighScoresSizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse)get_store().find_element_user(GETHIGHSCORESSIZERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getHighScoresSizeResponse" element
     */
    public void setGetHighScoresSizeResponse(com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse getHighScoresSizeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse)get_store().find_element_user(GETHIGHSCORESSIZERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse)get_store().add_element_user(GETHIGHSCORESSIZERESPONSE$0);
            }
            target.set(getHighScoresSizeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getHighScoresSizeResponse" element
     */
    public com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse addNewGetHighScoresSizeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse)get_store().add_element_user(GETHIGHSCORESSIZERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getHighScoresSizeResponse(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class GetHighScoresSizeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse
    {
        
        public GetHighScoresSizeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://serivces.itcuties.com", "return");
        
        
        /**
         * Gets the "return" element
         */
        public int getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlInt xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "return" element
         */
        public boolean isSetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0) != 0;
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(int xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setIntValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlInt xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Unsets the "return" element
         */
        public void unsetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, 0);
            }
        }
    }
}
