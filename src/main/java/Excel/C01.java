package Excel;

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

        String filePath = "src/main/resources/Book.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis);

        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));


        workbook.getSheet("Sheet1").getRow(2).createCell(2).setCellValue("Java");

        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        fis.close();
        workbook.close();
        fos.close();

    }
}
