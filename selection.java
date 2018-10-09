import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;


public class selection {

	static final int VANDALISM = 0;
	static final int ASSAULT = 1;
	static final int BURGLARY = 2;
	static final int ROBBERY = 3;
	static final int DRUGS_ALCOHOL_VIOLATIONS = 4;
	static final int DUI = 5;
	static final int SEX_CRIMES = 6;
	static final int HOMICIDE = 7;
	static final int MOTOR_VEHICLE_THEFT = 8; 
	static final int WEAPONS = 9;
	static final int THEFT_LARCENY = 10;
	static final int VEHICLE_BREAK_IN_THEFT = 11;
	static final int ARSON = 12;
	static final int FRAUD = 13;
	int INCIDENT_COUNT = 100000;
	
	Hashtable<String,String> incidentsTable;//neighborhood| crimeType
	
	selection(){
		incidentsTable = new Hashtable<String,String>(INCIDENT_COUNT*2);
	}
	
	public void buildIncidentsTable(){
		String csvFile = "incidents-100k.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				String[] crime = line.split(cvsSplitBy);
				incidentsTable.put(crime[13], crime[9]);
				/*
				System.out.println(
						  "crime [id= " + crime[0] + " , date=" + crime[1] 
						+ " , year= " + crime[2] + " , month=" + crime[3]
						+ " , day= " + crime[4] + " , week=" + crime[5]
						+ " , time= " + crime[6] + " , hour=" + crime[7]
						+ " , is_night= " + crime[8] + " , type=" + crime[9]	
						+ " , address= " + crime[10] + " , city=" + crime[11]
						+ " , segment_id= " + crime[12] + " , nbrhood=" + crime[13]
						+ " , community= " + crime[14] + " , comm_pop=" + crime[15]
						+ " , council= " + crime[16] + " , coun_pop=" + crime[17]
						+ " , asr_zone= " + crime[18] + " , lampdist=" + crime[19]
						+ " , lat= " + crime[20] + " , lon=" + crime[21]
						+ " , desc= " + crime[22] + " , gctype=" + crime[23]
						+ " ,  gcquality= " + crime[24]
						+ "]");*/
/*
id	date	year	month	day	week	dow	time	hour	is_night	type	address	city	
segment_id	nbrhood	community	
comm_pop	council	coun_pop	asr_zone	lampdist	lat	lon	desc	gctype	gcquality
*/
				}
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			} 
		catch (IOException e) {
			e.printStackTrace();
			} 
		finally {
			if (br != null) {
				try {
					br.close();
					} 
				catch (IOException e) {
					e.printStackTrace();
					}
				}
			}
		System.out.println("Done");
		}
	
	public boolean isSelected(){
		return false;
		}
	
	}
