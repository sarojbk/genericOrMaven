package pack01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import java.io.File;
import org.apache.commons.io.filefilter.WildcardFileFilter;
import java.io.FileFilter;

public class FileExists01Test {

	@Test
	public void testFileShouldNotExistInWrongFormatDir() {
		System.out.println("-testFileShouldNotExistInWrongFormatDir 01");
		assertEquals(false,fileExists("\\\\t111zzz\\apps\\HD835Archive\\CHC_835\\HealthShareDZ\\Sub_Acute_Units\\SAU_Format","1231_GL1_SauQueue01.835*"));
		//\\t111zzz\apps\HD835Archive\CHC_835\HealthShareDZ\Sub_Acute_Units\SAU_Format
	}



	public boolean fileExists(String sPath01,String sfilePattern01 ){
		boolean bExists=false;
		//String sPath01=".";
		//String sfilePattern01="sample*.*";
		File dir = new File(sPath01);
		FileFilter fileFilter = new WildcardFileFilter(sfilePattern01);
		File[] files = dir.listFiles(fileFilter);

		System.out.println("sPath01"+":"+sPath01);
		System.out.println("sfilePattern01"+":"+sfilePattern01);
		System.out.println("number of files: .length"+":"+files.length+"\n\n");
		bExists=files.length>0?true:false;
		return bExists;
	}

	@Ignore
	@Test
	public void testFileExists() {
		System.out.println("-testFileExists");
		assertEquals(true,fileExists("\\\\t111zzz\\apps\\HD835Archive\\CHC_835\\HealthShareDZ\\commercial\\commerical_Archive","5678_e01_ZA_1234567891_LA_Care_Payer01_56701_12.01_20200501*.*"));
	}

}
