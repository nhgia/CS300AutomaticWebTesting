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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5 (25)'), 'dhieu@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733 (25)'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in (14)'))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/div_Fi (1)'))

WebUI.click(findTestObject('Page_Town Square - FirstTeam Mattermost/a_ChannelAddMember (1)'))

WebUI.click(findTestObject('Page_ChannelAddMember - FirstTeam Mattermost/span_ChannelAddMember_channelHeaderDropdownIcon (1)'))

WebUI.click(findTestObject('Object Repository/Page_ChannelAddMember - FirstTeam Mattermost/button_Manage Members'))

WebUI.click(findTestObject('Object Repository/Page_ChannelAddMember - FirstTeam Mattermost/button_Channel MembergiabeuuRemove Member'))

WebUI.click(findTestObject('Object Repository/Page_ChannelAddMember - FirstTeam Mattermost/button_Close'))

WebUI.closeBrowser()

