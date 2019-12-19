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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Create one now'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/div_Valid email required for sign-up'))

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_concat(What  s your email address)_email'), emailUser)

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_Choose your username_name'), nameUser)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_Choose your password_password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/button_Create Account'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/h1_Mattermost'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_All team communication in one place se_ecfdc4'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/div_No teams are available to join Please c_a3dc7f'))

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_No teams are available to join Please _1046a9'))

WebUI.closeBrowser()

