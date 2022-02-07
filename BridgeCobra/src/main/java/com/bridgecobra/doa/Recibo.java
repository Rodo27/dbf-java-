package com.bridgecobra.doa;
import java.io.*;
import com.linuxense.javadbf.*;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.GregorianCalendar;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFRow;
import com.linuxense.javadbf.DBFUtils;

import com.linuxense.javadbf.DBFDataType;
import com.linuxense.javadbf.DBFField;

import com.linuxense.javadbf.DBFWriter;




public class Recibo {

	
	public static void main(String [] args) throws IOException {
		
		
		 //File input = new File("src/test/recibo.dbf");
		 
		 DBFWriter dbfWriter = new DBFWriter(new File("src/test/recibo.dbf"));
			Object rowData[] = new Object[9];
			
			rowData[0] = "ZZ000111";
			rowData[1] = "2796";
			rowData[2] = "DERECHOS";
			
			
			rowData[3] =  new Date();
			rowData[4] = new Date();
			rowData[5] = 27;
			
			rowData[6] = "A";
			rowData[7] = 96;
			rowData[8] = "M";
			
			
			dbfWriter.addRecord(rowData);
			
			dbfWriter.close();
			
			
		 /*
			DBFReader reader = null;
			InputStream in = null;
			
			try {

				// create a DBFReader object
				in = new BufferedInputStream(new FileInputStream(input));
				reader = new DBFReader(in);

				// get the field count if you want for some reasons like the following

				int numberOfFields = reader.getFieldCount();

				// use this count to fetch all field information
				// if required
	 
				for (int i = 0; i < numberOfFields; i++) {

					DBFField field = reader.getField(i);

					// do something with it if you want
					// refer the JavaDoc API reference for more details
					//
					
					System.out.print(field.getName() + '|');
				}

				System.out.print("\n");
				
				// Now, lets us start reading the rows

				Object[] rowObjects;
				
				
				
				int cont = 0;
				
				while ((rowObjects = reader.nextRecord()) != null && cont < 5) {

					for (int i = 0; i < rowObjects.length; i++) {
						System.out.print(rowObjects[i]);
						//System.out.println(rowObjects[i].getClass());
						System.out.print("|");
					}
					
					System.out.print("\n");
					cont++;
				}
				

				// By now, we have iterated through all of the rows

			} catch (DBFException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				DBFUtils.close(reader);
			}
		*/
			
	}
	
	
}

/*
 	DBFWriter dbfWriter = new DBFWriter(new File("src/test/recibo.dbf"));
		Object rowData[] = new Object[9];
		
		rowData[0] = "ZZ000111";
		rowData[1] = "2796";
		rowData[2] = "SIN DERECHOS";
		
		
		rowData[3] =  new Date();
		rowData[4] = new Date();
		rowData[5] = 27;
		
		rowData[6] = "AR";
		rowData[7] = 96;
		rowData[8] = "MM";
		
		
		dbfWriter.addRecord(rowData);
		
		dbfWriter.close();
		
		*/


 