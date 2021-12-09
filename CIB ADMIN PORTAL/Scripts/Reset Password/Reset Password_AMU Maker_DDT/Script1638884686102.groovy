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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.27.15.103:8045/Default.aspx?sessiontimeout=1')

WebUI.setText(findTestObject('Object Repository/Reset Password/input_User Name_txtUserName'), Username)

WebUI.setText(findTestObject('Object Repository/Reset Password/input_Password_txtPassword'), Password)

WebUI.setText(findTestObject('Object Repository/Reset Password/input_Token_txtToken'), Token)

WebUI.click(findTestObject('Object Repository/Reset Password/input__btnLogin'))

WebUI.click(findTestObject('Reset Password/td_Manage Existing'))

WebUI.click(findTestObject('Object Repository/Reset Password/a_Manage Existing'))

WebUI.setText(findTestObject('Reset Password/input_Customer Name_search'), Customer_Name)

WebUI.click(findTestObject('Reset Password/input__btnSearch_Customer'))

WebUI.click(findTestObject('Object Repository/Reset Password/a_Select'))

WebUI.click(findTestObject('Reset Password/input_Deactivation Remarks_ctl'))

WebUI.acceptAlert()

WebUI.acceptAlert()

WebUI.closeBrowser()

