/*
 * An XML document type.
 * Localname: getHighScoresSizeResponse
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresSizeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces;


/**
 * A document containing one getHighScoresSizeResponse(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public interface GetHighScoresSizeResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresSizeResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoressizeresponse8789doctype");
    
    /**
     * Gets the "getHighScoresSizeResponse" element
     */
    com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse getGetHighScoresSizeResponse();
    
    /**
     * Sets the "getHighScoresSizeResponse" element
     */
    void setGetHighScoresSizeResponse(com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse getHighScoresSizeResponse);
    
    /**
     * Appends and returns a new empty "getHighScoresSizeResponse" element
     */
    com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse addNewGetHighScoresSizeResponse();
    
    /**
     * An XML getHighScoresSizeResponse(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public interface GetHighScoresSizeResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresSizeResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoressizeresponse7ca2elemtype");
        
        /**
         * Gets the "return" element
         */
        int getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlInt xgetReturn();
        
        /**
         * True if has "return" element
         */
        boolean isSetReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(int xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlInt xreturn);
        
        /**
         * Unsets the "return" element
         */
        void unsetReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse newInstance() {
              return (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.itcuties.serivces.GetHighScoresSizeResponseDocument.GetHighScoresSizeResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument newInstance() {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresSizeResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresSizeResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
