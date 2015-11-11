/*
 * An XML document type.
 * Localname: addHighScore
 * Namespace: http://serivces.itcuties.com
 * Java type: com.itcuties.serivces.AddHighScoreDocument
 *
 * Automatically generated - do not modify.
 */
package com.itcuties.serivces;


/**
 * A document containing one addHighScore(@http://serivces.itcuties.com) element.
 *
 * This is a complex type.
 */
public interface AddHighScoreDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddHighScoreDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("addhighscore6fe3doctype");
    
    /**
     * Gets the "addHighScore" element
     */
    com.itcuties.serivces.AddHighScoreDocument.AddHighScore getAddHighScore();
    
    /**
     * Sets the "addHighScore" element
     */
    void setAddHighScore(com.itcuties.serivces.AddHighScoreDocument.AddHighScore addHighScore);
    
    /**
     * Appends and returns a new empty "addHighScore" element
     */
    com.itcuties.serivces.AddHighScoreDocument.AddHighScore addNewAddHighScore();
    
    /**
     * An XML addHighScore(@http://serivces.itcuties.com).
     *
     * This is a complex type.
     */
    public interface AddHighScore extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddHighScore.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCC8CE22298979F5586767BD677B85ED5").resolveHandle("addhighscorea26eelemtype");
        
        /**
         * Gets the "score" element
         */
        com.itcuties.serivces.xsd.HighScore getScore();
        
        /**
         * Tests for nil "score" element
         */
        boolean isNilScore();
        
        /**
         * True if has "score" element
         */
        boolean isSetScore();
        
        /**
         * Sets the "score" element
         */
        void setScore(com.itcuties.serivces.xsd.HighScore score);
        
        /**
         * Appends and returns a new empty "score" element
         */
        com.itcuties.serivces.xsd.HighScore addNewScore();
        
        /**
         * Nils the "score" element
         */
        void setNilScore();
        
        /**
         * Unsets the "score" element
         */
        void unsetScore();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.itcuties.serivces.AddHighScoreDocument.AddHighScore newInstance() {
              return (com.itcuties.serivces.AddHighScoreDocument.AddHighScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.itcuties.serivces.AddHighScoreDocument.AddHighScore newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.itcuties.serivces.AddHighScoreDocument.AddHighScore) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.itcuties.serivces.AddHighScoreDocument newInstance() {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.itcuties.serivces.AddHighScoreDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.AddHighScoreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.itcuties.serivces.AddHighScoreDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.itcuties.serivces.AddHighScoreDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
