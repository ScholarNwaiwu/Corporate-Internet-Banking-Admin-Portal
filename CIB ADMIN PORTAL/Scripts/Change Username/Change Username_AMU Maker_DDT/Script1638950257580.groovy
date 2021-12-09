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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.27.15.103:8045/Default.aspx?sessiontimeout=1')

WebUI.setText(findTestObject('Object Repository/Change Username/input_User Name_txtUserName'), Username)

WebUI.setText(findTestObject('Object Repository/Change Username/input_Password_txtPassword'), Password)

WebUI.setText(findTestObject('Object Repository/Change Username/input_Token_txtToken'), Token)

WebUI.click(findTestObject('Object Repository/Change Username/input__btnLogin'))

WebUI.click(findTestObject('Object Repository/Change Username/a_Manage Existing'))

WebUI.setText(findTestObject('Object Repository/Change Username/input_Customer Name_ctl00ContentPlaceHolder_f4b4c6'), Customer_Name)

WebUI.click(findTestObject('Object Repository/Change Username/input__ctl00ContentPlaceHolder1btnSearchByC_c35b0d'))

WebUI.click(findTestObject('Object Repository/Change Username/a_Select'))

WebUI.setText(findTestObject('Object Repository/Change Username/input_New UserName_ctl00ContentPlaceHolder1_ed2c9c'), New_Username)

WebUI.click(findTestObject('Object Repository/Change Username/input_New UserName_ctl00ContentPlaceHolder1_dcbef1'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.closeBrowser()

