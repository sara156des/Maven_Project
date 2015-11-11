

/**
 * HighScoreService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.itcuties.ws;

    /*
     *  HighScoreService java interface
     */

    public interface HighScoreService {
          

        /**
          * Auto generated method signature
          * 
                    * @param getHighScores
                
         */

         
                     public com.itcuties.serivces.GetHighScoresResponseDocument getHighScores(

                        com.itcuties.serivces.GetHighScoresDocument getHighScores)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getHighScoresSize
                
         */

         
                     public com.itcuties.serivces.GetHighScoresSizeResponseDocument getHighScoresSize(

                        com.itcuties.serivces.GetHighScoresSizeDocument getHighScoresSize)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param getHighScoresForNickname
                
         */

         
                     public com.itcuties.serivces.GetHighScoresForNicknameResponseDocument getHighScoresForNickname(

                        com.itcuties.serivces.GetHighScoresForNicknameDocument getHighScoresForNickname)
                        throws java.rmi.RemoteException
             ;

        
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
         */
        public void  addHighScore(
         com.itcuties.serivces.AddHighScoreDocument addHighScore

        ) throws java.rmi.RemoteException
        
        ;

        

        
       //
       }
    