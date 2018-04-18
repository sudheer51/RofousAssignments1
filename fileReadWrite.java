package LavPack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "//Users//govindanmoorthy//Lavanya//JavaProject//SeleniumNew//SeleniumTest//Cover Letter.txt";
		String fnw = "//Users//govindanmoorthy//Lavanya//JavaProject//SeleniumNew//SeleniumTest//Filewrite.txt";
		String ln = null;
		String ln2 = null;
		try {
			FileReader fr = new FileReader(filename);
			FileWriter fw = new FileWriter(fnw); //appends to existing file
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter brw = new BufferedWriter(fw);
			//String str = "";
			
			int ctrfl=0;
			//int li=0;
			while((ln = br.readLine()) != null)
			{
				int ctrln = 0;
               // System.out.println(ln);
              brw.write(ln);
              brw.write("\n");
              int ll = ln.length();
              
              //System.out.println( " line length " + ll + " line "+li++); 
              if ( ll >0  ) {
            	  ln2 = ln+'~';
            	  //System.out.println("After ln "+ln2);
              for(int i = 0;i<=ll;i++)
              {
            	  //int av=(int)(char)13;
                  //char nl=(char)av;
            	  //char st[] = ln.substring(i,i+1).toCharArray();
            	  //System.out.println("Newln -------"+nl+"------");
            	  //System.out.println("ST[0]-------"+st[0]+"------");
            	
            	//System.out.println("Char "+ln.substring(i,i+1));
            	if (ln2.substring(i, i+1).matches(" ") || ln2.substring(i, i+1).matches("~") ) 
            	{
            		//System.out.println(ln2.substring(0,i));
            		ctrln=ctrln+1;
            	}
              }
              //System.out.println(" ctrln "+ ctrln);
              
              //ctrln=ctrln+1;
              ctrfl=ctrfl+ctrln;
              }
            }   
			System.out.println("Number of words : "+ ctrfl);
            // Always close files.
            br.close(); 
            brw.close();
		}
		 
		catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                filename + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + filename + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
		
	}
	}


