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

WebUI.openBrowser('Update contact details')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/a_My Info'))

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/a_Contact Details'))

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--focus'), 
    '088898765')

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--active'), 
    '111111111111111')

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/div_David CapchaPersonal DetailsContact Det_19860a'))

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--focus'), 
    '')

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--active'), 
    '1111111111')

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--active'))

WebUI.setText(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/input_oxd-input oxd-input--focus'), 
    '')

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/button_Save'))

WebUI.click(findTestObject('Object Repository/Update contact details/Page_OrangeHRM/div_SuccessSuccessfully Updated'))

