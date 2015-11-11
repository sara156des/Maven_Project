/*
 * An XML document type.
 * Localname: getHighScoresForNicknameResponse
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresForNicknameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces;


/**
 * A document containing one getHighScoresForNicknameResponse(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public interface GetHighScoresForNicknameResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresForNicknameResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoresfornicknameresponse0a33doctype");
    
    /**
     * Gets the "getHighScoresForNicknameResponse" element
     */
    com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse getGetHighScoresForNicknameResponse();
    
    /**
     * Sets the "getHighScoresForNicknameResponse" element
     */
    void setGetHighScoresForNicknameResponse(com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse getHighScoresForNicknameResponse);
    
    /**
     * Appends and returns a new empty "getHighScoresForNicknameResponse" element
     */
    com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse addNewGetHighScoresForNicknameResponse();
    
    /**
     * An XML getHighScoresForNicknameResponse(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public interface GetHighScoresForNicknameResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresForNicknameResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoresfornicknameresponse476eelemtype");
        
        /**
         * Gets array of all "return" elements
         */
        com.itcuties.serivces.xsd.HighScore[] getReturnArray();
        
        /**
         * Gets ith "return" element
         */
        com.itcuties.serivces.xsd.HighScore getReturnArray(int i);
        
        /**
         * Tests for nil ith "return" element
         */
        boolean isNilReturnArray(int i);
        
        /**
         * Returns number of "return" element
         */
        int sizeOfReturnArray();
        
        /**
         * Sets array of all "return" element
         */
        void setReturnArray(com.itcuties.serivces.xsd.HighScore[] xreturnArray);
        
        /**
         * Sets ith "return" element
         */
        void setReturnArray(int i, com.itcuties.serivces.xsd.HighScore xreturn);
        
        /**
         * Nils the ith "return" element
         */
        void setNilReturnArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "return" element
         */
        com.itcuties.serivces.xsd.HighScore insertNewReturn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "return" element
         */
        com.itcuties.serivces.xsd.HighScore addNewReturn();
        
        /**
         * Removes the ith "return" element
         */
        void removeReturn(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse newInstance() {
              return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument.GetHighScoresForNicknameResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument newInstance() {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresForNicknameResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresForNicknameResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
