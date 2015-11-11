/*
 * An XML document type.
 * Localname: getHighScoresForNicknameResponse
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresForNicknameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces.impl;
/**
 * A document containing one getHighScoresForNicknameResponse(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public class GetHighScoresForNicknameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresForNicknameResponseDocument
{
    
    public GetHighScoresForNicknameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHIGHSCORESFORNICKNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://serivces.itcuties.com", "getHighScoresForNicknameResponse");
    
    
    /**
     * Gets the "getHighScoresForNicknameResponse" element
     */
    public com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse getGetHighScoresForNicknameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse)get_store().find_element_user(GETHIGHSCORESFORNICKNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getHighScoresForNicknameResponse" element
     */
    public void setGetHighScoresForNicknameResponse(com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse getHighScoresForNicknameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse)get_store().find_element_user(GETHIGHSCORESFORNICKNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse)get_store().add_element_user(GETHIGHSCORESFORNICKNAMERESPONSE$0);
            }
            target.set(getHighScoresForNicknameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "getHighScoresForNicknameResponse" element
     */
    public com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse addNewGetHighScoresForNicknameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse target = null;
            target = (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse)get_store().add_element_user(GETHIGHSCORESFORNICKNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getHighScoresForNicknameResponse(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public static class GetHighScoresForNicknameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse
    {
        
        public GetHighScoresForNicknameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("http://serivces.itcuties.com", "return");
        
        
        /**
         * Gets array of all "return" elements
         */
        public com.itcuties.serivces.xsd.HighScore[] getReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RETURN$0, targetList);
                com.itcuties.serivces.xsd.HighScore[] result = new com.itcuties.serivces.xsd.HighScore[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "return" element
         */
        public com.itcuties.serivces.xsd.HighScore getReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "return" element
         */
        public boolean isNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "return" element
         */
        public int sizeOfReturnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RETURN$0);
            }
        }
        
        /**
         * Sets array of all "return" element
         */
        public void setReturnArray(com.itcuties.serivces.xsd.HighScore[] xreturnArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(xreturnArray, RETURN$0);
            }
        }
        
        /**
         * Sets ith "return" element
         */
        public void setReturnArray(int i, com.itcuties.serivces.xsd.HighScore xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the ith "return" element
         */
        public void setNilReturnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().find_element_user(RETURN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "return" element
         */
        public com.itcuties.serivces.xsd.HighScore insertNewReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().insert_element_user(RETURN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "return" element
         */
        public com.itcuties.serivces.xsd.HighScore addNewReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.itcuties.serivces.xsd.HighScore target = null;
                target = (com.itcuties.serivces.xsd.HighScore)get_store().add_element_user(RETURN$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "return" element
         */
        public void removeReturn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RETURN$0, i);
            }
        }
    }
}
