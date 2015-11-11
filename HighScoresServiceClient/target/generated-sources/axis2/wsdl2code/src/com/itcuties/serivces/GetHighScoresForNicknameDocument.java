/*
 * An XML document type.
 * Localname: getHighScoresForNickname
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.GetHighScoresForNicknameDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces;


/**
 * A document containing one getHighScoresForNickname(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public interface GetHighScoresForNicknameDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresForNicknameDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoresfornickname33f4doctype");
    
    /**
     * Gets the "getHighScoresForNickname" element
     */
    com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname getGetHighScoresForNickname();
    
    /**
     * Sets the "getHighScoresForNickname" element
     */
    void setGetHighScoresForNickname(com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname getHighScoresForNickname);
    
    /**
     * Appends and returns a new empty "getHighScoresForNickname" element
     */
    com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname addNewGetHighScoresForNickname();
    
    /**
     * An XML getHighScoresForNickname(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public interface GetHighScoresForNickname extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHighScoresForNickname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("gethighscoresfornickname30ceelemtype");
        
        /**
         * Gets the "nickname" element
         */
        java.lang.String getNickname();
        
        /**
         * Gets (as xml) the "nickname" element
         */
        org.apache.xmlbeans.XmlString xgetNickname();
        
        /**
         * Tests for nil "nickname" element
         */
        boolean isNilNickname();
        
        /**
         * True if has "nickname" element
         */
        boolean isSetNickname();
        
        /**
         * Sets the "nickname" element
         */
        void setNickname(java.lang.String nickname);
        
        /**
         * Sets (as xml) the "nickname" element
         */
        void xsetNickname(org.apache.xmlbeans.XmlString nickname);
        
        /**
         * Nils the "nickname" element
         */
        void setNilNickname();
        
        /**
         * Unsets the "nickname" element
         */
        void unsetNickname();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname newInstance() {
              return (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.itcuties.serivces.GetHighScoresForNicknameDocument.GetHighScoresForNickname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument newInstance() {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.GetHighScoresForNicknameDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.GetHighScoresForNicknameDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
