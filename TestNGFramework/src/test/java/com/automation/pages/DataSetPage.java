package com.automation.pages;

import com.automation.utils.DriverManager;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataSetPage extends BasePage {

//    public void openWebsite(){
//        driver.get("https://datatables.net/");
//        DriverManager.createDriver();
//    }




    public void openWebsite(){
        driver.get("https://datatables.net/");
    }

    public void validateTableData(List<List<String>> dataTable) {
        for (int i=0;i<dataTable.size();i++){
            String xPath = "//table[@id='example']/tbody/tr[%s]/td[not(@style='display: none;')]";
            List<WebElement> eachRowData = driver.findElements(By.xpath(String.format(xPath,i+1)));

            for (int j=0;j<eachRowData.size();j++){
                String expData = dataTable.get(i).get(j);
                String actData = eachRowData.get(j).getText();
                System.out.println(expData +"   "+actData);
            }
        }
    }
}
