/* Created by Amit Mudgal (Senior Principal Consultant)
 * Date : 5/23/2017
 */
package com.coke;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenData {

	public static void main(String[] args) {
		String FilePath = args[0];
		String FileName = args[1];
		String FILENAME = FilePath + "/" + FileName;
		String  CURRENCY_ID = "USD",EVENT_ID ="1",EVENT_DESC="This is event 1 desc (short - title)"
			   ,NARR_DESC="This is narrative (story)",USER_ID="mstr",DATE_ENTRY="5/17/2017";
	    String[] RLI_IDNT = new String[]{"UCS","CSE","Net Revenue","Profit Before MI"};
        String[] COMPARATIVE_ID = new String[]{"PY","BP","PRE",};
        String[] MEASURE_ID = new String[]{"FY","MTD","QTD","YTD","Q1","Q2","Q3","Q4","YTG"};
        String LEVEL_1_ID = "100";
        String LEVEL_1_DESC ="CCNA";
        String LEVEL_2_ID = "";
        String LEVEL_2_DESC ="";
        String LEVEL_3_ID = "";
        String LEVEL_3_DESC ="";
        String LEVEL_4_ID = "";
        String LEVEL_4_DESC ="";
        String LEVEL_5_ID = "";
        String LEVEL_5_DESC ="";
        String LEVEL_6_ID = "";
        String LEVEL_6_DESC ="";
        
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
         for(int i1=0;i1<30;i1=i1+5){
          if(i1>=5){
        	  LEVEL_2_ID ="200";
        	  LEVEL_2_DESC ="US Ops";
          }	
          if(i1>=10){
        	  LEVEL_3_ID ="300";
        	  LEVEL_3_DESC ="Brands";
          }	
          if(i1>=15){
        	  LEVEL_4_ID ="400";
        	  LEVEL_4_DESC ="Sparkling";
          }	
          if(i1>=20){
        	  LEVEL_5_ID ="500";
        	  LEVEL_5_DESC ="Coca-Cola Portfolio";
          }	
          if(i1>=25){
        	  LEVEL_6_ID ="600";
        	  LEVEL_6_DESC ="Coke TM";
          }	
		  for(int iMEASURE_ID=0;iMEASURE_ID < MEASURE_ID.length;iMEASURE_ID++){
			for(int iCOMPARATIVE_ID=0;iCOMPARATIVE_ID < COMPARATIVE_ID.length;iCOMPARATIVE_ID++){
				for(int iRLI_IDNT=0;iRLI_IDNT <RLI_IDNT.length;iRLI_IDNT++){
					for(int NARR_ID=1; NARR_ID < 5 ;NARR_ID++){
						String Rec = LEVEL_1_ID + "," + LEVEL_1_DESC + "," +
								     LEVEL_2_ID + "," + LEVEL_2_DESC + "," +
								     LEVEL_3_ID + "," + LEVEL_3_DESC + "," +
								     LEVEL_4_ID + "," + LEVEL_4_DESC + "," +
								     LEVEL_5_ID + "," + LEVEL_5_DESC + "," +
								     LEVEL_6_ID + "," + LEVEL_6_DESC + "," +
								     MEASURE_ID[iMEASURE_ID] + "," + COMPARATIVE_ID[iCOMPARATIVE_ID] + "," +
						 		     CURRENCY_ID + "," + EVENT_ID + "," + EVENT_DESC + "," + RLI_IDNT[iRLI_IDNT]+ "," +NARR_ID + "," +	
									 NARR_DESC+ "," + USER_ID + "," + DATE_ENTRY +"\n";
						System.out.println(Rec);
						bw.write(Rec);
					}
				}
			}
		  }
         }
		  bw.close();
		  System.out.println("Finito");

		} catch (IOException e) {
				e.printStackTrace();
		}
        
        
	}
}
