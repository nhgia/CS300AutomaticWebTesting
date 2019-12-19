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

WebUI.callTestCase(findTestCase('TestCase1LoginSuccessfully'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ Town Square - FirstTeam Mattermost/div_He'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - Hello Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - Hello Mattermost/button_Team Settings'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - Hello Mattermost/button_Edit'))

WebUI.setText(findTestObject('Object Repository/Page_ Town Square - Hello Mattermost/input_Team Name_teamName'), 'SecondTeam')

WebUI.click(findTestObject('Object Repository/Page_ Town Square - Hello Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - SecondTeam Mattermost/button_Close'))

WebUI.closeBrowser()

