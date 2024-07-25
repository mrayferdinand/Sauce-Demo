import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('saucedemo.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Login Page/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Login Page/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Login Page/input_Swag Labs_login-button'))

WebUI.click(findTestObject('Item Page/button_Add to cart (backpack)'))

WebUI.click(findTestObject('Item Page/button_Add to cart (Bike Light)'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Item Page/a_Swag Labs_shopping_cart_link'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Confirmation Page/button_Checkout'))

WebUI.setText(findTestObject('Data Buyer Page/field_FirstName'), 'Rayhan')

WebUI.setText(findTestObject('Data Buyer Page/input_lastName'), 'Ferdinand')

WebUI.setText(findTestObject('Data Buyer Page/input_postalCode'), '000000')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Data Buyer Page/button_continue'))

WebUI.scrollToElement(findTestObject('Checkout page/div_Item total'), 30)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Checkout page/button_Finish'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Order Complete Page/button_Back Home'))

WebUI.closeBrowser()

