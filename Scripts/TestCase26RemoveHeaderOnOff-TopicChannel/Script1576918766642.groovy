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

WebUI.navigateToUrl('https://cs300testautomatic.herokuapp.com/')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (26)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (26)'), 'GoUae4B8Jrc=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (15)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/div_Fi (11)'))

WebUI.click(findTestObject('Object Repository/Page_ Town Square - FirstTeam Mattermost/a_Off-Topic'))

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/span_Off-Topic_channelHeaderDropdownIcon (2)'))

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/button_Edit Channel Header (2)'))

WebUI.setText(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/textarea_Edited Header (1)'), '')

WebUI.click(findTestObject('Page_ Off-Topic - FirstTeam Mattermost/button_Save (3)'))

WebUI.closeBrowser()

