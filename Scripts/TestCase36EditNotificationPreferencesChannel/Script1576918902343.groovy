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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'dhieu@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'iGDxf8hSRT4=')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - FirstTeam Mattermost/span_Off-Topic'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Off-Topic_channelHeaderDropdownIcon'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/button_Notification Preferences'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/input_Mute channel_channelNotificationMute'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/li_OnOffWhen enabled channel here and all w_65cb61'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/label_On'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/button_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/li_OnOffMuting turns off desktop email and _95114b'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/label_Never'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Page_Off-Topic - FirstTeam Mattermost/span_'))

WebUI.closeBrowser()

