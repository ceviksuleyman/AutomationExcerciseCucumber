import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class C01 {

    public static void main(String[] args) throws IOException {

        Random rnd = new Random();
        System.out.println(rnd.nextInt(1));


        String filePath = "src/resources/Book1.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sheet1").getRow(2).createCell(2).setCellValue("murtaza");

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        fis.close();
        workbook.close();
        fos.close();
    }
}
