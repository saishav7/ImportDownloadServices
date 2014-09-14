
/**
 * ImportDownloadServicesMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package au.edu.unsw.sltf.services;

        /**
        *  ImportDownloadServicesMessageReceiverInOut message receiver
        */

        public class ImportDownloadServicesMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ImportDownloadServicesSkeletonInterface skel = (ImportDownloadServicesSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("importMarketData".equals(methodName)){
                
                au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketDataResponse5 = null;
	                        au.edu.unsw.sltf.services.ImportMarketDataDocument wrappedParam =
                                                             (au.edu.unsw.sltf.services.ImportMarketDataDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    au.edu.unsw.sltf.services.ImportMarketDataDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               importMarketDataResponse5 =
                                                   
                                                   
                                                         skel.importMarketData(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), importMarketDataResponse5, false, new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services",
                                                    "importMarketData"));
                                    } else 

            if("downloadFile".equals(methodName)){
                
                au.edu.unsw.sltf.services.DownloadFileResponseDocument downloadFileResponse7 = null;
	                        au.edu.unsw.sltf.services.DownloadFileDocument wrappedParam =
                                                             (au.edu.unsw.sltf.services.DownloadFileDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    au.edu.unsw.sltf.services.DownloadFileDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               downloadFileResponse7 =
                                                   
                                                   
                                                         skel.downloadFile(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), downloadFileResponse7, false, new javax.xml.namespace.QName("http://sltf.unsw.edu.au/services",
                                                    "downloadFile"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ImportDownloadFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"importDownloadFault");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //

            private  org.apache.axiom.om.OMElement  toOM(au.edu.unsw.sltf.services.ImportMarketDataDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final au.edu.unsw.sltf.services.ImportMarketDataDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(au.edu.unsw.sltf.services.ImportMarketDataResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final au.edu.unsw.sltf.services.ImportMarketDataResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(au.edu.unsw.sltf.services.ImportDownloadFaultDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final au.edu.unsw.sltf.services.ImportDownloadFaultDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(au.edu.unsw.sltf.services.DownloadFileDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final au.edu.unsw.sltf.services.DownloadFileDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(au.edu.unsw.sltf.services.DownloadFileResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final au.edu.unsw.sltf.services.DownloadFileResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, au.edu.unsw.sltf.services.ImportMarketDataResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, au.edu.unsw.sltf.services.DownloadFileResponseDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                            throws org.apache.axis2.AxisFault {
                            org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                            if (param != null){
                            envelope.getBody().addChild(toOM(param, optimizeContent));
                            }
                            return envelope;
                            }
                        


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (au.edu.unsw.sltf.services.ImportMarketDataDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.ImportMarketDataDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.ImportMarketDataDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.ImportDownloadFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.ImportDownloadFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (au.edu.unsw.sltf.services.DownloadFileDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.DownloadFileDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.DownloadFileDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (au.edu.unsw.sltf.services.DownloadFileResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.DownloadFileResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.DownloadFileResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (au.edu.unsw.sltf.services.ImportDownloadFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return au.edu.unsw.sltf.services.ImportDownloadFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return au.edu.unsw.sltf.services.ImportDownloadFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    