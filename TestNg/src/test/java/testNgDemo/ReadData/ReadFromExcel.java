package testNgDemo.ReadData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

import static javax.management.openmbean.SimpleType.STRING;

public class ReadFromExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook("src\\resources\\data\\credentials.xlsx");
        XSSFSheet sheet = workbook.getSheet("Positive");



//        XSSFRow row = sheet.getRow(1);
//        System.out.println();
//        XSSFCell cell = row.getCell(1);
//        System.out.println(cell.getStringCellValue());




        for(Row row:sheet){
            for (Cell cell : row){
//                System.out.print(getCellType(cell)  +"  ");
                System.out.print(cell.getStringCellValue()+"   ");
            }
            System.out.println();
        }
//        sheet.
//
//        for()



    }

//    public static  String getCellType(Cell cell){
//
//        if(cell == null){
//            return "";
//        }
//
//        CellType cellType = cell.getCellType();
//
//        switch(cellType){
//            case STRING ->
//                return cellType.getStringCellValue();
//
//        }
//
//
//
//    }

}
