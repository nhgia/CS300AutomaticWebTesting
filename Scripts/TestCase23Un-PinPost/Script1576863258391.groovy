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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (47)'), 'giabeuu@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (47)'), 'GoUae4B8Jrc=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (34)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/div_Fi (18)'))

WebUI.click(findTestObject('Page_ Town Square - FirstTeam Mattermost/a_ChannelsTest (4)'))

WebUI.click(findTestObject('Object Repository/Page_ ChannelsTest - FirstTeam Mattermost/button_Add a channel description_channelHea_11db4d'))

WebUI.click(findTestObject('Object Repository/Page_ ChannelsTest - FirstTeam Mattermost/button_Pinned_SEARCH_button_ndx3uchketdr3dz_02c332'))

WebUI.click(findTestObject('Page_ ChannelsTest - FirstTeam Mattermost/button_Un-pin from channel (1)'))

WebUI.click(findTestObject('Object Repository/Page_ ChannelsTest - FirstTeam Mattermost/span_There are no pinned messages yet'))

WebUI.closeBrowser()

