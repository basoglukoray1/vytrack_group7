package com.vytrack.utilities;

import org.openqa.selenium.By;

public class VytrackUtils {

        public static void login(String username, String password){
                //go to website
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));

                //enter username
                Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(username);
                //enter password
                Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(password);

                //click login button
                Driver.getDriver().findElement(By.tagName("button")).click();


        }


        public static void loginAsDriver(){
                //go to website
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));

                //enter username
                Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("driver_username"));
                //enter password
                Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("driver_password"));

                //click login button
                Driver.getDriver().findElement(By.tagName("button")).click();
        }


        public static void loginAsStoreManager(){
                //go to website
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));

                //enter username
                Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("store_manager_username"));
                //enter password
                Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("store_manager_password"));

                //click login button
                Driver.getDriver().findElement(By.tagName("button")).click();
        }


        public static void loginAsSalesManager(){
                //go to website
                Driver.getDriver().get(ConfigurationReader.getProperty("env"));

                //enter username
                Driver.getDriver().findElement(By.cssSelector("#prependedInput")).sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
                //enter password
                Driver.getDriver().findElement(By.cssSelector("#prependedInput2")).sendKeys(ConfigurationReader.getProperty("sales_manager_password"));

                //click login button
                Driver.getDriver().findElement(By.tagName("button")).click();
        }
        }



