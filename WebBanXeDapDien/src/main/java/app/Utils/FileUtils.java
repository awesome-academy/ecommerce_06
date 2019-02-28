package app.Utils;

import app.bean.Product;
import app.bean.Supplier;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileUtils {
    private static final Logger logger = Logger.getLogger(FileUtils.class);

    public static File saveFile(byte[] bytes, String pathName) throws IOException {
        File newFile = new File(pathName);
        logger.info(newFile.getName());
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);
        try {
            fileOutputStream.write(bytes);
            return newFile;
        } catch (FileNotFoundException e) {
            logger.error(e);
            throw e;
        } catch (IOException e) {
            logger.error(e);
            throw e;
        } finally {
            fileOutputStream.close();
        }
    }

    public static List<Product> ReadFileProducts(File file) throws IOException {
        FileInputStream excelFile = null;
        Workbook workbook = null;
        List<Product> products = new ArrayList<>();
        try {
            excelFile = new FileInputStream(file);
            workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            Iterator<Row> iterator = datatypeSheet.iterator();
            Row firstRow = iterator.next();
            Cell firstCell = firstRow.getCell(0);
            System.out.println(firstCell.getStringCellValue());
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                Product product = new Product();
                product.setName(fmt.formatCellValue(currentRow.getCell(0)));
                product.setPrice(Double.parseDouble(fmt.formatCellValue(currentRow.getCell(1))));
                product.setMainPhoto(fmt.formatCellValue(currentRow.getCell(2)));
                Supplier supplier = new Supplier();
                supplier.setId(Integer.parseInt(fmt.formatCellValue(currentRow.getCell(3))));
                product.setSupplier(supplier);
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        } finally {

            workbook.close();
        }
        return products;
    }
}
