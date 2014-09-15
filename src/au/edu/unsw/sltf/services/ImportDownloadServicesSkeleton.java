
/**
 * ImportDownloadServicesSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package au.edu.unsw.sltf.services;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import au.edu.unsw.sltf.services.DownloadFileDocument.DownloadFile;
import au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse;
import au.edu.unsw.sltf.services.ImportDownloadFaultDocument.ImportDownloadFault;
import au.edu.unsw.sltf.services.ImportMarketDataDocument.ImportMarketData;
import au.edu.unsw.sltf.services.ImportMarketDataResponseDocument.ImportMarketDataResponse;
import au.edu.unsw.sltf.services.helper.IncorrectTimeException;
import au.edu.unsw.sltf.services.helper.MarketData;
    /**
     *  ImportDownloadServicesSkeleton java skeleton for the axisService
     */
    public class ImportDownloadServicesSkeleton implements ImportDownloadServicesSkeletonInterface{
        
        private String resourcesFolder = System.getProperty("catalina.base") + "/webapps/SoapServices/cs9322ass1/";
        /**
         * Auto generated method signature
         * 
         * @param importMarketData0 
         * @return importMarketDataResponse1 
         * @throws ImportDownloadFaultException 
         */
        
         @Override
		public au.edu.unsw.sltf.services.ImportMarketDataResponseDocument importMarketData
          (
          au.edu.unsw.sltf.services.ImportMarketDataDocument importMarketData0
          )
		  throws ImportDownloadFaultException{
        	 ImportMarketData data = importMarketData0.getImportMarketData();
             
             Random rand = new Random();
             int  fileName = rand.nextInt(1000000) + 1;
             
             File outputFile = new File(resourcesFolder + fileName + ".csv");
             while (outputFile.exists()) {
            	 fileName = rand.nextInt(1000000) + 1;
                 outputFile = new File(resourcesFolder + fileName + ".csv");
             }
             
             MarketData md;
			
				if (!data.getSec().matches("[^0-9]+")) {
					throw idFaultException("Incorrect SEC code", "InvalidSECCode");
				} else {
					
					try {
						md = new MarketData(data.getSec(), data.getStartDate(),
					         data.getEndDate(), data.getDataSourceURL());
					} catch (IOException e1) {
						e1.printStackTrace();
						throw idFaultException("URL cannot be used", "InvalidURL");
					} catch (IncorrectTimeException ite) {
						ite.printStackTrace();
						throw idFaultException("Incorrect times", "ProgramError");
					} catch (ParseException e) {
						e.printStackTrace();
						throw idFaultException("Incorrect times", "ProgramError");
					}
				}

				try {
	             FileUtils.writeStringToFile(outputFile, md.stringify());
	         } catch (IOException e) {
	        	 e.printStackTrace();
	             throw idFaultException("Cannot write to file", "ProgramError");
	         }
             
             ImportMarketDataResponseDocument respDoc = ImportMarketDataResponseDocument.Factory.newInstance();
             ImportMarketDataResponse resp = respDoc.addNewImportMarketDataResponse();
             resp.setEventSetId(Integer.toString(fileName));
             respDoc.setImportMarketDataResponse(resp);
             return respDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
         * @param downloadFile2 
         * @return downloadFileResponse3 
         * @throws ImportDownloadFaultException 
         */
        
         @Override
		public au.edu.unsw.sltf.services.DownloadFileResponseDocument downloadFile
          (
          au.edu.unsw.sltf.services.DownloadFileDocument downloadFile2
          )
        	throws ImportDownloadFaultException{
            	 DownloadFile dfreq = downloadFile2.getDownloadFile();
                 
                 String url = System.getProperty("catalina.base") + "/webapps/SoapServices/cs9322ass1/" + dfreq.getEventSetId() + ".csv";
                 File f = new File(url);

                 if (f.exists()) {
                	 DownloadFileResponseDocument dfrespdoc = 
                			 DownloadFileResponseDocument.Factory.newInstance();
                     DownloadFileResponse dfresp = dfrespdoc.addNewDownloadFileResponse();
                     dfresp.setDataURL(url);
                     return dfrespdoc;
                 } else {
    	             throw idFaultException("Cannot find file!", "InvalidEventSetId");
                 }
        }


		private ImportDownloadFaultException idFaultException(String faultMsg, String type) {
            au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum faultType = 
           		 au.edu.unsw.sltf.services.ImportDownloadFaultType.Enum.
           		 forString(type);
            ImportDownloadFault fault = ImportDownloadFault.Factory.newInstance();
            fault.setFaultMessage(faultMsg);
            fault.setFaultType(faultType);
            ImportDownloadFaultDocument faultDoc = ImportDownloadFaultDocument.Factory.newInstance();
            faultDoc.setImportDownloadFault(fault);
            ImportDownloadFaultException ie = new ImportDownloadFaultException();
            ie.setFaultMessage(faultDoc);
            
            return ie;
		}
     
    }
    